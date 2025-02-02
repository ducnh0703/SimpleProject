/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgUserMapping;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgUserMappingRecord extends TableRecordImpl<PgUserMappingRecord> implements Record4<Long, Long, Long, String[]> {

    private static final long serialVersionUID = -895336940;

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    public void setUmuser(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    public Long getUmuser() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    public void setUmserver(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    public Long getUmserver() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    public void setUmoptions(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    public String[] getUmoptions() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgUserMapping.PG_USER_MAPPING.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgUserMapping.PG_USER_MAPPING.UMUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgUserMapping.PG_USER_MAPPING.UMSERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return PgUserMapping.PG_USER_MAPPING.UMOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUmuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getUmserver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getUmoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value2(Long value) {
        setUmuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value3(Long value) {
        setUmserver(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value4(String[] value) {
        setUmoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord values(Long value1, Long value2, Long value3, String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgUserMappingRecord
     */
    public PgUserMappingRecord() {
        super(PgUserMapping.PG_USER_MAPPING);
    }

    /**
     * Create a detached, initialised PgUserMappingRecord
     */
    public PgUserMappingRecord(Long oid, Long umuser, Long umserver, String[] umoptions) {
        super(PgUserMapping.PG_USER_MAPPING);

        set(0, oid);
        set(1, umuser);
        set(2, umserver);
        set(3, umoptions);
    }
}
