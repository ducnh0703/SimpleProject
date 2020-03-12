/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatSubscriptionRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSubscription extends TableImpl<PgStatSubscriptionRecord> {

    private static final long serialVersionUID = 16747463;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_subscription</code>
     */
    public static final PgStatSubscription PG_STAT_SUBSCRIPTION = new PgStatSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSubscriptionRecord> getRecordType() {
        return PgStatSubscriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> SUBID = createField("subid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    public final TableField<PgStatSubscriptionRecord, String> SUBNAME = createField("subname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.received_lsn</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Object> RECEIVED_LSN = createField("received_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Timestamp> LAST_MSG_SEND_TIME = createField("last_msg_send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Timestamp> LAST_MSG_RECEIPT_TIME = createField("last_msg_receipt_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.latest_end_lsn</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Object> LATEST_END_LSN = createField("latest_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Timestamp> LATEST_END_TIME = createField("latest_end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_subscription</code> table reference
     */
    public PgStatSubscription() {
        this("pg_stat_subscription", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table reference
     */
    public PgStatSubscription(String alias) {
        this(alias, PG_STAT_SUBSCRIPTION);
    }

    private PgStatSubscription(String alias, Table<PgStatSubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSubscription(String alias, Table<PgStatSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatSubscription as(String alias) {
        return new PgStatSubscription(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatSubscription rename(String name) {
        return new PgStatSubscription(name, null);
    }
}
