/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables;


import Jooq.information_schema.InformationSchema;
import Jooq.information_schema.tables.records.TablePrivilegesRecord;

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
public class TablePrivileges extends TableImpl<TablePrivilegesRecord> {

    private static final long serialVersionUID = -1929299579;

    /**
     * The reference instance of <code>information_schema.table_privileges</code>
     */
    public static final TablePrivileges TABLE_PRIVILEGES = new TablePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablePrivilegesRecord> getRecordType() {
        return TablePrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.table_privileges.grantor</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.grantee</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.table_catalog</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.table_schema</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.table_name</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.privilege_type</code>.
     */
    public final TableField<TablePrivilegesRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_privileges.is_grantable</code>.
     */
    public final TableField<TablePrivilegesRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.table_privileges.with_hierarchy</code>.
     */
    public final TableField<TablePrivilegesRecord, String> WITH_HIERARCHY = createField("with_hierarchy", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>information_schema.table_privileges</code> table reference
     */
    public TablePrivileges() {
        this("table_privileges", null);
    }

    /**
     * Create an aliased <code>information_schema.table_privileges</code> table reference
     */
    public TablePrivileges(String alias) {
        this(alias, TABLE_PRIVILEGES);
    }

    private TablePrivileges(String alias, Table<TablePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablePrivileges(String alias, Table<TablePrivilegesRecord> aliased, Field<?>[] parameters) {
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
    public TablePrivileges as(String alias) {
        return new TablePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    public TablePrivileges rename(String name) {
        return new TablePrivileges(name, null);
    }
}
