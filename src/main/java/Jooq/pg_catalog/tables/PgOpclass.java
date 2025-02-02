/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgOpclassRecord;

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
public class PgOpclass extends TableImpl<PgOpclassRecord> {

    private static final long serialVersionUID = -230902683;

    /**
     * The reference instance of <code>pg_catalog.pg_opclass</code>
     */
    public static final PgOpclass PG_OPCLASS = new PgOpclass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOpclassRecord> getRecordType() {
        return PgOpclassRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_opclass.oid</code>.
     */
    public final TableField<PgOpclassRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCMETHOD = createField("opcmethod", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public final TableField<PgOpclassRecord, String> OPCNAME = createField("opcname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCNAMESPACE = createField("opcnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCOWNER = createField("opcowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCFAMILY = createField("opcfamily", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCINTYPE = createField("opcintype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public final TableField<PgOpclassRecord, Boolean> OPCDEFAULT = createField("opcdefault", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCKEYTYPE = createField("opckeytype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_opclass</code> table reference
     */
    public PgOpclass() {
        this("pg_opclass", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opclass</code> table reference
     */
    public PgOpclass(String alias) {
        this(alias, PG_OPCLASS);
    }

    private PgOpclass(String alias, Table<PgOpclassRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOpclass(String alias, Table<PgOpclassRecord> aliased, Field<?>[] parameters) {
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
    public PgOpclass as(String alias) {
        return new PgOpclass(alias, this);
    }

    /**
     * Rename this table
     */
    public PgOpclass rename(String name) {
        return new PgOpclass(name, null);
    }
}
