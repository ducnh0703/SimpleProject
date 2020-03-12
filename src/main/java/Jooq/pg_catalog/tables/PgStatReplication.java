/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatReplicationRecord;

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
public class PgStatReplication extends TableImpl<PgStatReplicationRecord> {

    private static final long serialVersionUID = 1802947934;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_replication</code>
     */
    public static final PgStatReplication PG_STAT_REPLICATION = new PgStatReplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatReplicationRecord> getRecordType() {
        return PgStatReplicationRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public final TableField<PgStatReplicationRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public final TableField<PgStatReplicationRecord, String> APPLICATION_NAME = createField("application_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_addr</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> CLIENT_ADDR = createField("client_addr", org.jooq.impl.DefaultDataType.getDefaultDataType("inet"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public final TableField<PgStatReplicationRecord, String> CLIENT_HOSTNAME = createField("client_hostname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> CLIENT_PORT = createField("client_port", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public final TableField<PgStatReplicationRecord, Timestamp> BACKEND_START = createField("backend_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public final TableField<PgStatReplicationRecord, Long> BACKEND_XMIN = createField("backend_xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sent_lsn</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> SENT_LSN = createField("sent_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.write_lsn</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> WRITE_LSN = createField("write_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.flush_lsn</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LSN = createField("flush_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.replay_lsn</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LSN = createField("replay_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> WRITE_LAG = createField("write_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LAG = createField("flush_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LAG = createField("replay_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public final TableField<PgStatReplicationRecord, Integer> SYNC_PRIORITY = createField("sync_priority", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public final TableField<PgStatReplicationRecord, String> SYNC_STATE = createField("sync_state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public final TableField<PgStatReplicationRecord, Timestamp> REPLY_TIME = createField("reply_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication() {
        this("pg_stat_replication", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication(String alias) {
        this(alias, PG_STAT_REPLICATION);
    }

    private PgStatReplication(String alias, Table<PgStatReplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatReplication(String alias, Table<PgStatReplicationRecord> aliased, Field<?>[] parameters) {
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
    public PgStatReplication as(String alias) {
        return new PgStatReplication(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatReplication rename(String name) {
        return new PgStatReplication(name, null);
    }
}
