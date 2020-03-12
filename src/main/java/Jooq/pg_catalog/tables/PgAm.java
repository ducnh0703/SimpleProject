/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgAmRecord;

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
public class PgAm extends TableImpl<PgAmRecord> {

    private static final long serialVersionUID = 1068897600;

    /**
     * The reference instance of <code>pg_catalog.pg_am</code>
     */
    public static final PgAm PG_AM = new PgAm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAmRecord> getRecordType() {
        return PgAmRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_am.oid</code>.
     */
    public final TableField<PgAmRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amname</code>.
     */
    public final TableField<PgAmRecord, String> AMNAME = createField("amname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amhandler</code>.
     */
    public final TableField<PgAmRecord, String> AMHANDLER = createField("amhandler", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amtype</code>.
     */
    public final TableField<PgAmRecord, String> AMTYPE = createField("amtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm() {
        this("pg_am", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm(String alias) {
        this(alias, PG_AM);
    }

    private PgAm(String alias, Table<PgAmRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAm(String alias, Table<PgAmRecord> aliased, Field<?>[] parameters) {
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
    public PgAm as(String alias) {
        return new PgAm(alias, this);
    }

    /**
     * Rename this table
     */
    public PgAm rename(String name) {
        return new PgAm(name, null);
    }
}
