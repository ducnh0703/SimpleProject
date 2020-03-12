package Vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import io.vertx.ext.web.RoutingContext;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.tools.json.JSONArray;
import org.jooq.tools.json.JSONObject;
import org.jooq.tools.json.JSONParser;
import org.jooq.tools.json.ParseException;
import org.apache.logging.log4j.*;

import static Jooq.public_.tables.User.USER;

public class Verticle extends AbstractVerticle {

    Logger logger = LogManager.getLogger();

    public void start() {
        try {
            //
            File file = new File("");
            Object Object = new JSONParser().parse(new FileReader(file.getAbsolutePath() + "\\Config.json"));
            JSONObject jsonObject = (JSONObject) Object;
            JSONObject httpServer =((JSONObject) jsonObject.get("httpServer"));

            //Vertx Web
            Vertx vertx = Vertx.vertx();
            HttpServer server = vertx.createHttpServer();
            Router router = Router.router(vertx);

            //Get
            router.get("/user").handler(this::getAllUser);

            //Delete
            router.delete("/user/:user").handler(this::deleteUser);

            //Create
            router.post("/user/:user/:pass").handler(this::insertUser);

            //Update
            router.put("/user/:user/:pass").handler(this::updateUser);

            int port =Integer.parseInt(httpServer.get("port").toString());
            server.requestHandler(router).listen(port);
            logger.log(Level.toLevel("INFO"),"localhost:"+port);

            //Event Bus
            EventBus eb = vertx.eventBus();
            eb.consumer("localhost:"+port, message -> {
                logger.log(Level.toLevel("INFO"), message.body());
            });
        } catch (ParseException e) {
            logger.log(Level.toLevel("ERROR"),e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            logger.log(Level.toLevel("INFO"),e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            logger.log(Level.toLevel("INFO"),e.getMessage());
            e.printStackTrace();
        }
    }

    private void updateUser(RoutingContext routingContext) {
        try {
            File file = new File("");
            Object Object = new JSONParser().parse(new FileReader(file.getAbsolutePath() + "\\Config.json"));
            JSONObject jsonObject = (JSONObject) Object;
            JSONObject dbConnection = ((JSONObject) jsonObject.get("dbConnection"));

            //Config Database
            String userName = (String) dbConnection.get("user");
            String password = (String) dbConnection.get("pass");
            String url = (String) dbConnection.get("url");

            //Connect Database
            Class.forName((String) dbConnection.get("ClassName"));
            Connection conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);

            String user = routingContext.request().getParam("user");
            String pass = routingContext.request().getParam("pass");
            HttpServerResponse response = routingContext.response();
            if (user == null || pass == null) {
                routingContext.response().setStatusCode(400).end();
            } else {
                create.update(USER)
                        .set(USER.PASSWORD, pass)
                        .where(USER.USER_.eq(user))
                        .execute();
            }
            routingContext.response().setStatusCode(204).end();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void insertUser(RoutingContext routingContext) {
        try {
            File file = new File("");
            Object Object = new JSONParser().parse(new FileReader(file.getAbsolutePath() + "\\Config.json"));
            JSONObject jsonObject = (JSONObject) Object;
            JSONObject dbConnection = ((JSONObject) jsonObject.get("dbConnection"));

            //Config Database
            String userName = (String) dbConnection.get("user");
            String password = (String) dbConnection.get("pass");
            String url = (String) dbConnection.get("url");

            //Connect Database
            Class.forName((String) dbConnection.get("ClassName"));
            Connection conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);

            String user = routingContext.request().getParam("user");
            String pass = routingContext.request().getParam("pass");
            HttpServerResponse response = routingContext.response();
            if (user == null || pass == null) {
                routingContext.response().setStatusCode(400).end();
            } else {
                //result.remove(user);
                create.insertInto(USER,
                        USER.USER_, USER.PASSWORD)
                        .values(user,pass)
                        .execute();
            }
            routingContext.response().setStatusCode(204).end();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(RoutingContext routingContext) {
        try {
            File file = new File("");
            Object Object = new JSONParser().parse(new FileReader(file.getAbsolutePath() + "\\Config.json"));
            JSONObject jsonObject = (JSONObject) Object;
            JSONObject dbConnection = ((JSONObject) jsonObject.get("dbConnection"));

            //Config Database
            String userName = (String) dbConnection.get("user");
            String password = (String) dbConnection.get("pass");
            String url = (String) dbConnection.get("url");

            //Connect Database
            Class.forName((String) dbConnection.get("ClassName"));
            Connection conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);

            String user = routingContext.request().getParam("user");
            if (user == null) {
                routingContext.response().setStatusCode(400).end();
            } else {
                create.delete(USER)
                        .where(USER.USER_.eq(user))
                        .execute();
            }
            routingContext.response().setStatusCode(204).end();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void getAllUser(RoutingContext routingContext) {
        try {
            File file = new File("");
            Object Object = new JSONParser().parse(new FileReader(file.getAbsolutePath() + "\\Config.json"));
            JSONObject jsonObject = (JSONObject) Object;
            JSONObject dbConnection =((JSONObject) jsonObject.get("dbConnection"));

            //Config Database
            String userName = (String)dbConnection.get("user");
            String password = (String)dbConnection.get("pass");
            String url = (String)dbConnection.get("url");

            //Connect Database
            Class.forName((String)dbConnection.get("ClassName"));
            Connection conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);

            JSONObject obj;
            JSONArray arr = new JSONArray();
            Result<Record> result = create.select().from(USER).fetch();

            for (Record r : result) {
                String User = r.getValue(USER.USER_);
                String Pass = r.getValue(USER.PASSWORD);

                obj = new JSONObject();
                obj.put("User", User);
                obj.put("Pass", Pass);
                arr.add(obj);
            }
            HttpServerResponse response = routingContext.response();
            response
                    .putHeader("content-type", "application/json; charset=utf-8")
                    .end(Json.encodePrettily(arr));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
