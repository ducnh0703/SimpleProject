/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgDependRecord;

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
public class PgDepend extends TableImpl<PgDependRecord> {

    private static final long serialVersionUID = 154884663;

    /**
     * The reference instance of <code>pg_catalog.pg_depend</code>
     */
    public static final PgDepend PG_DEPEND = new PgDepend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDependRecord> getRecordType() {
        return PgDependRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_depend.classid</code>.
     */
    public final TableField<PgDependRecord, Long> CLASSID = createField("classid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.objid</code>.
     */
    public final TableField<PgDependRecord, Long> OBJID = createField("objid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public final TableField<PgDependRecord, Integer> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public final TableField<PgDependRecord, Long> REFCLASSID = createField("refclassid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public final TableField<PgDependRecord, Long> REFOBJID = createField("refobjid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public final TableField<PgDependRecord, Integer> REFOBJSUBID = createField("refobjsubid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.deptype</code>.
     */
    public final TableField<PgDependRecord, String> DEPTYPE = createField("deptype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_depend</code> table reference
     */
    public PgDepend() {
        this("pg_depend", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_depend</code> table reference
     */
    public PgDepend(String alias) {
        this(alias, PG_DEPEND);
    }

    private PgDepend(String alias, Table<PgDependRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDepend(String alias, Table<PgDependRecord> aliased, Field<?>[] parameters) {
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
    public PgDepend as(String alias) {
        return new PgDepend(alias, this);
    }

    /**
     * Rename this table
     */
    public PgDepend rename(String name) {
        return new PgDepend(name, null);
    }
}
