/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgExtension;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgExtensionRecord extends TableRecordImpl<PgExtensionRecord> implements Record8<Long, String, Long, Long, Boolean, String, Long[], String[]> {

    private static final long serialVersionUID = -2040408669;

    /**
     * Setter for <code>pg_catalog.pg_extension.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extname</code>.
     */
    public void setExtname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extname</code>.
     */
    public String getExtname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extowner</code>.
     */
    public void setExtowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extowner</code>.
     */
    public Long getExtowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extnamespace</code>.
     */
    public void setExtnamespace(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extnamespace</code>.
     */
    public Long getExtnamespace() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extrelocatable</code>.
     */
    public void setExtrelocatable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extrelocatable</code>.
     */
    public Boolean getExtrelocatable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extversion</code>.
     */
    public void setExtversion(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extversion</code>.
     */
    public String getExtversion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extconfig</code>.
     */
    public void setExtconfig(Long[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extconfig</code>.
     */
    public Long[] getExtconfig() {
        return (Long[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension.extcondition</code>.
     */
    public void setExtcondition(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension.extcondition</code>.
     */
    public String[] getExtcondition() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, Boolean, String, Long[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, Boolean, String, Long[], String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgExtension.PG_EXTENSION.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgExtension.PG_EXTENSION.EXTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgExtension.PG_EXTENSION.EXTOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgExtension.PG_EXTENSION.EXTNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgExtension.PG_EXTENSION.EXTRELOCATABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgExtension.PG_EXTENSION.EXTVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field7() {
        return PgExtension.PG_EXTENSION.EXTCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return PgExtension.PG_EXTENSION.EXTCONDITION;
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
    public String value2() {
        return getExtname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getExtowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getExtnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getExtrelocatable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getExtversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value7() {
        return getExtconfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getExtcondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value2(String value) {
        setExtname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value3(Long value) {
        setExtowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value4(Long value) {
        setExtnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value5(Boolean value) {
        setExtrelocatable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value6(String value) {
        setExtversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value7(Long[] value) {
        setExtconfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord value8(String[] value) {
        setExtcondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionRecord values(Long value1, String value2, Long value3, Long value4, Boolean value5, String value6, Long[] value7, String[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgExtensionRecord
     */
    public PgExtensionRecord() {
        super(PgExtension.PG_EXTENSION);
    }

    /**
     * Create a detached, initialised PgExtensionRecord
     */
    public PgExtensionRecord(Long oid, String extname, Long extowner, Long extnamespace, Boolean extrelocatable, String extversion, Long[] extconfig, String[] extcondition) {
        super(PgExtension.PG_EXTENSION);

        set(0, oid);
        set(1, extname);
        set(2, extowner);
        set(3, extnamespace);
        set(4, extrelocatable);
        set(5, extversion);
        set(6, extconfig);
        set(7, extcondition);
    }
}
