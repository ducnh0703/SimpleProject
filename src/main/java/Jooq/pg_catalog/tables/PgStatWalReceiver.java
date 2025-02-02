/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatWalReceiverRecord;

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
public class PgStatWalReceiver extends TableImpl<PgStatWalReceiverRecord> {

    private static final long serialVersionUID = 507771145;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_wal_receiver</code>
     */
    public static final PgStatWalReceiver PG_STAT_WAL_RECEIVER = new PgStatWalReceiver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatWalReceiverRecord> getRecordType() {
        return PgStatWalReceiverRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.receive_start_lsn</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Object> RECEIVE_START_LSN = createField("receive_start_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVE_START_TLI = createField("receive_start_tli", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.received_lsn</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Object> RECEIVED_LSN = createField("received_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVED_TLI = createField("received_tli", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Timestamp> LAST_MSG_SEND_TIME = createField("last_msg_send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Timestamp> LAST_MSG_RECEIPT_TIME = createField("last_msg_receipt_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.latest_end_lsn</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Object> LATEST_END_LSN = createField("latest_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Timestamp> LATEST_END_TIME = createField("latest_end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> SLOT_NAME = createField("slot_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.sender_host</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> SENDER_HOST = createField("sender_host", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.sender_port</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> SENDER_PORT = createField("sender_port", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> CONNINFO = createField("conninfo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver() {
        this("pg_stat_wal_receiver", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver(String alias) {
        this(alias, PG_STAT_WAL_RECEIVER);
    }

    private PgStatWalReceiver(String alias, Table<PgStatWalReceiverRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatWalReceiver(String alias, Table<PgStatWalReceiverRecord> aliased, Field<?>[] parameters) {
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
    public PgStatWalReceiver as(String alias) {
        return new PgStatWalReceiver(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatWalReceiver rename(String name) {
        return new PgStatWalReceiver(name, null);
    }
}
