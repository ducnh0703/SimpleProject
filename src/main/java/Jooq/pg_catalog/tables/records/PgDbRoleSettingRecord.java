/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgDbRoleSetting;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class PgDbRoleSettingRecord extends TableRecordImpl<PgDbRoleSettingRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = 1601382926;

    /**
     * Setter for <code>pg_catalog.pg_db_role_setting.setdatabase</code>.
     */
    public void setSetdatabase(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_db_role_setting.setdatabase</code>.
     */
    public Long getSetdatabase() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_db_role_setting.setrole</code>.
     */
    public void setSetrole(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_db_role_setting.setrole</code>.
     */
    public Long getSetrole() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_db_role_setting.setconfig</code>.
     */
    public void setSetconfig(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_db_role_setting.setconfig</code>.
     */
    public String[] getSetconfig() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return PgDbRoleSetting.PG_DB_ROLE_SETTING.SETCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getSetdatabase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getSetrole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getSetconfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDbRoleSettingRecord value1(Long value) {
        setSetdatabase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDbRoleSettingRecord value2(Long value) {
        setSetrole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDbRoleSettingRecord value3(String[] value) {
        setSetconfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDbRoleSettingRecord values(Long value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDbRoleSettingRecord
     */
    public PgDbRoleSettingRecord() {
        super(PgDbRoleSetting.PG_DB_ROLE_SETTING);
    }

    /**
     * Create a detached, initialised PgDbRoleSettingRecord
     */
    public PgDbRoleSettingRecord(Long setdatabase, Long setrole, String[] setconfig) {
        super(PgDbRoleSetting.PG_DB_ROLE_SETTING);

        set(0, setdatabase);
        set(1, setrole);
        set(2, setconfig);
    }
}
