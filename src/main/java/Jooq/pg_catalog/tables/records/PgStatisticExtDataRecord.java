/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgStatisticExtData;

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
public class PgStatisticExtDataRecord extends TableRecordImpl<PgStatisticExtDataRecord> implements Record4<Long, Object, Object, Object> {

    private static final long serialVersionUID = 39618153;

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    public void setStxoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    public Long getStxoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxdndistinct</code>.
     */
    public void setStxdndistinct(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxdndistinct</code>.
     */
    public Object getStxdndistinct() {
        return (Object) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxddependencies</code>.
     */
    public void setStxddependencies(Object value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxddependencies</code>.
     */
    public Object getStxddependencies() {
        return (Object) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxdmcv</code>.
     */
    public void setStxdmcv(Object value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxdmcv</code>.
     */
    public Object getStxdmcv() {
        return (Object) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Object, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Object, Object, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field2() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDNDISTINCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field3() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDDEPENDENCIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field4() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDMCV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getStxoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value2() {
        return getStxdndistinct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value3() {
        return getStxddependencies();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value4() {
        return getStxdmcv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExtDataRecord value1(Long value) {
        setStxoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExtDataRecord value2(Object value) {
        setStxdndistinct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExtDataRecord value3(Object value) {
        setStxddependencies(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExtDataRecord value4(Object value) {
        setStxdmcv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatisticExtDataRecord values(Long value1, Object value2, Object value3, Object value4) {
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
     * Create a detached PgStatisticExtDataRecord
     */
    public PgStatisticExtDataRecord() {
        super(PgStatisticExtData.PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create a detached, initialised PgStatisticExtDataRecord
     */
    public PgStatisticExtDataRecord(Long stxoid, Object stxdndistinct, Object stxddependencies, Object stxdmcv) {
        super(PgStatisticExtData.PG_STATISTIC_EXT_DATA);

        set(0, stxoid);
        set(1, stxdndistinct);
        set(2, stxddependencies);
        set(3, stxdmcv);
    }
}
