/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables;


import Jooq.information_schema.InformationSchema;
import Jooq.information_schema.tables.records.CheckConstraintsRecord;

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
public class CheckConstraints extends TableImpl<CheckConstraintsRecord> {

    private static final long serialVersionUID = 2058534708;

    /**
     * The reference instance of <code>information_schema.check_constraints</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckConstraintsRecord> getRecordType() {
        return CheckConstraintsRecord.class;
    }

    /**
     * The column <code>information_schema.check_constraints.constraint_catalog</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.constraint_schema</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.constraint_name</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraints.check_clause</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CHECK_CLAUSE = createField("check_clause", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.check_constraints</code> table reference
     */
    public CheckConstraints() {
        this("check_constraints", null);
    }

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table reference
     */
    public CheckConstraints(String alias) {
        this(alias, CHECK_CONSTRAINTS);
    }

    private CheckConstraints(String alias, Table<CheckConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(String alias, Table<CheckConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraints as(String alias) {
        return new CheckConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    public CheckConstraints rename(String name) {
        return new CheckConstraints(name, null);
    }
}
