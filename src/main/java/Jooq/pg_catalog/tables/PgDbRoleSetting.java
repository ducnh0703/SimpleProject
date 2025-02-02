/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgDbRoleSettingRecord;

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
public class PgDbRoleSetting extends TableImpl<PgDbRoleSettingRecord> {

    private static final long serialVersionUID = 551284133;

    /**
     * The reference instance of <code>pg_catalog.pg_db_role_setting</code>
     */
    public static final PgDbRoleSetting PG_DB_ROLE_SETTING = new PgDbRoleSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDbRoleSettingRecord> getRecordType() {
        return PgDbRoleSettingRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setdatabase</code>.
     */
    public final TableField<PgDbRoleSettingRecord, Long> SETDATABASE = createField("setdatabase", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setrole</code>.
     */
    public final TableField<PgDbRoleSettingRecord, Long> SETROLE = createField("setrole", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setconfig</code>.
     */
    public final TableField<PgDbRoleSettingRecord, String[]> SETCONFIG = createField("setconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_db_role_setting</code> table reference
     */
    public PgDbRoleSetting() {
        this("pg_db_role_setting", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_db_role_setting</code> table reference
     */
    public PgDbRoleSetting(String alias) {
        this(alias, PG_DB_ROLE_SETTING);
    }

    private PgDbRoleSetting(String alias, Table<PgDbRoleSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDbRoleSetting(String alias, Table<PgDbRoleSettingRecord> aliased, Field<?>[] parameters) {
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
    public PgDbRoleSetting as(String alias) {
        return new PgDbRoleSetting(alias, this);
    }

    /**
     * Rename this table
     */
    public PgDbRoleSetting rename(String name) {
        return new PgDbRoleSetting(name, null);
    }
}
