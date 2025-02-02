/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgShseclabel;

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
public class PgShseclabelRecord extends TableRecordImpl<PgShseclabelRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = 536277923;

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public void setProvider(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public String getProvider() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.label</code>.
     */
    public void setLabel(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.label</code>.
     */
    public String getLabel() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgShseclabel.PG_SHSECLABEL.OBJOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgShseclabel.PG_SHSECLABEL.CLASSOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgShseclabel.PG_SHSECLABEL.PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgShseclabel.PG_SHSECLABEL.LABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getObjoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getClassoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabelRecord value1(Long value) {
        setObjoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabelRecord value2(Long value) {
        setClassoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabelRecord value3(String value) {
        setProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabelRecord value4(String value) {
        setLabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabelRecord values(Long value1, Long value2, String value3, String value4) {
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
     * Create a detached PgShseclabelRecord
     */
    public PgShseclabelRecord() {
        super(PgShseclabel.PG_SHSECLABEL);
    }

    /**
     * Create a detached, initialised PgShseclabelRecord
     */
    public PgShseclabelRecord(Long objoid, Long classoid, String provider, String label) {
        super(PgShseclabel.PG_SHSECLABEL);

        set(0, objoid);
        set(1, classoid);
        set(2, provider);
        set(3, label);
    }
}
