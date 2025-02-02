/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables;


import Jooq.information_schema.InformationSchema;
import Jooq.information_schema.tables.records.EnabledRolesRecord;

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
public class EnabledRoles extends TableImpl<EnabledRolesRecord> {

    private static final long serialVersionUID = 1712780740;

    /**
     * The reference instance of <code>information_schema.enabled_roles</code>
     */
    public static final EnabledRoles ENABLED_ROLES = new EnabledRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnabledRolesRecord> getRecordType() {
        return EnabledRolesRecord.class;
    }

    /**
     * The column <code>information_schema.enabled_roles.role_name</code>.
     */
    public final TableField<EnabledRolesRecord, String> ROLE_NAME = createField("role_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.enabled_roles</code> table reference
     */
    public EnabledRoles() {
        this("enabled_roles", null);
    }

    /**
     * Create an aliased <code>information_schema.enabled_roles</code> table reference
     */
    public EnabledRoles(String alias) {
        this(alias, ENABLED_ROLES);
    }

    private EnabledRoles(String alias, Table<EnabledRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnabledRoles(String alias, Table<EnabledRolesRecord> aliased, Field<?>[] parameters) {
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
    public EnabledRoles as(String alias) {
        return new EnabledRoles(alias, this);
    }

    /**
     * Rename this table
     */
    public EnabledRoles rename(String name) {
        return new EnabledRoles(name, null);
    }
}
