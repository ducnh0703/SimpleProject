/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgEnumRecord;

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
public class PgEnum extends TableImpl<PgEnumRecord> {

    private static final long serialVersionUID = 1343082495;

    /**
     * The reference instance of <code>pg_catalog.pg_enum</code>
     */
    public static final PgEnum PG_ENUM = new PgEnum();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEnumRecord> getRecordType() {
        return PgEnumRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_enum.oid</code>.
     */
    public final TableField<PgEnumRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    public final TableField<PgEnumRecord, Long> ENUMTYPID = createField("enumtypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    public final TableField<PgEnumRecord, Float> ENUMSORTORDER = createField("enumsortorder", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    public final TableField<PgEnumRecord, String> ENUMLABEL = createField("enumlabel", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum() {
        this("pg_enum", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum(String alias) {
        this(alias, PG_ENUM);
    }

    private PgEnum(String alias, Table<PgEnumRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgEnum(String alias, Table<PgEnumRecord> aliased, Field<?>[] parameters) {
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
    public PgEnum as(String alias) {
        return new PgEnum(alias, this);
    }

    /**
     * Rename this table
     */
    public PgEnum rename(String name) {
        return new PgEnum(name, null);
    }
}
