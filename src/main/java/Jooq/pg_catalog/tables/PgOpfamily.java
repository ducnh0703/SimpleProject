/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgOpfamilyRecord;

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
public class PgOpfamily extends TableImpl<PgOpfamilyRecord> {

    private static final long serialVersionUID = -1682540347;

    /**
     * The reference instance of <code>pg_catalog.pg_opfamily</code>
     */
    public static final PgOpfamily PG_OPFAMILY = new PgOpfamily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOpfamilyRecord> getRecordType() {
        return PgOpfamilyRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFMETHOD = createField("opfmethod", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public final TableField<PgOpfamilyRecord, String> OPFNAME = createField("opfname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFNAMESPACE = createField("opfnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFOWNER = createField("opfowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily() {
        this("pg_opfamily", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily(String alias) {
        this(alias, PG_OPFAMILY);
    }

    private PgOpfamily(String alias, Table<PgOpfamilyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOpfamily(String alias, Table<PgOpfamilyRecord> aliased, Field<?>[] parameters) {
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
    public PgOpfamily as(String alias) {
        return new PgOpfamily(alias, this);
    }

    /**
     * Rename this table
     */
    public PgOpfamily rename(String name) {
        return new PgOpfamily(name, null);
    }
}
