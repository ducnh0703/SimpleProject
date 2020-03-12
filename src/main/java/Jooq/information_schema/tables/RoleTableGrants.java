/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables;


import Jooq.information_schema.InformationSchema;
import Jooq.information_schema.tables.records.RoleTableGrantsRecord;

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
public class RoleTableGrants extends TableImpl<RoleTableGrantsRecord> {

    private static final long serialVersionUID = -304025064;

    /**
     * The reference instance of <code>information_schema.role_table_grants</code>
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = new RoleTableGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleTableGrantsRecord> getRecordType() {
        return RoleTableGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_table_grants.grantor</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.grantee</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.table_catalog</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.table_schema</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.table_name</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.privilege_type</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_table_grants.is_grantable</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> WITH_HIERARCHY = createField("with_hierarchy", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>information_schema.role_table_grants</code> table reference
     */
    public RoleTableGrants() {
        this("role_table_grants", null);
    }

    /**
     * Create an aliased <code>information_schema.role_table_grants</code> table reference
     */
    public RoleTableGrants(String alias) {
        this(alias, ROLE_TABLE_GRANTS);
    }

    private RoleTableGrants(String alias, Table<RoleTableGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleTableGrants(String alias, Table<RoleTableGrantsRecord> aliased, Field<?>[] parameters) {
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
    public RoleTableGrants as(String alias) {
        return new RoleTableGrants(alias, this);
    }

    /**
     * Rename this table
     */
    public RoleTableGrants rename(String name) {
        return new RoleTableGrants(name, null);
    }
}
