/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgTransformRecord;

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
public class PgTransform extends TableImpl<PgTransformRecord> {

    private static final long serialVersionUID = 2055285638;

    /**
     * The reference instance of <code>pg_catalog.pg_transform</code>
     */
    public static final PgTransform PG_TRANSFORM = new PgTransform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTransformRecord> getRecordType() {
        return PgTransformRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_transform.oid</code>.
     */
    public final TableField<PgTransformRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trftype</code>.
     */
    public final TableField<PgTransformRecord, Long> TRFTYPE = createField("trftype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trflang</code>.
     */
    public final TableField<PgTransformRecord, Long> TRFLANG = createField("trflang", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public final TableField<PgTransformRecord, String> TRFFROMSQL = createField("trffromsql", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public final TableField<PgTransformRecord, String> TRFTOSQL = createField("trftosql", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_transform</code> table reference
     */
    public PgTransform() {
        this("pg_transform", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_transform</code> table reference
     */
    public PgTransform(String alias) {
        this(alias, PG_TRANSFORM);
    }

    private PgTransform(String alias, Table<PgTransformRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTransform(String alias, Table<PgTransformRecord> aliased, Field<?>[] parameters) {
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
    public PgTransform as(String alias) {
        return new PgTransform(alias, this);
    }

    /**
     * Rename this table
     */
    public PgTransform rename(String name) {
        return new PgTransform(name, null);
    }
}
