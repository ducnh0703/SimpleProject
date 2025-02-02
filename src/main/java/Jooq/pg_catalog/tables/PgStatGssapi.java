/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatGssapiRecord;

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
public class PgStatGssapi extends TableImpl<PgStatGssapiRecord> {

    private static final long serialVersionUID = -462530875;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_gssapi</code>
     */
    public static final PgStatGssapi PG_STAT_GSSAPI = new PgStatGssapi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGssapiRecord> getRecordType() {
        return PgStatGssapiRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    public final TableField<PgStatGssapiRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    public final TableField<PgStatGssapiRecord, Boolean> GSS_AUTHENTICATED = createField("gss_authenticated", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    public final TableField<PgStatGssapiRecord, String> PRINCIPAL = createField("principal", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    public final TableField<PgStatGssapiRecord, Boolean> ENCRYPTED = createField("encrypted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_gssapi</code> table reference
     */
    public PgStatGssapi() {
        this("pg_stat_gssapi", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_gssapi</code> table reference
     */
    public PgStatGssapi(String alias) {
        this(alias, PG_STAT_GSSAPI);
    }

    private PgStatGssapi(String alias, Table<PgStatGssapiRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatGssapi(String alias, Table<PgStatGssapiRecord> aliased, Field<?>[] parameters) {
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
    public PgStatGssapi as(String alias) {
        return new PgStatGssapi(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatGssapi rename(String name) {
        return new PgStatGssapi(name, null);
    }
}
