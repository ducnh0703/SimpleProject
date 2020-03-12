/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgTimezoneNames;

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
public class PgTimezoneNamesRecord extends TableRecordImpl<PgTimezoneNamesRecord> implements Record4<String, String, Object, Boolean> {

    private static final long serialVersionUID = 442796217;

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public void setAbbrev(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public String getAbbrev() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public void setUtcOffset(Object value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public Object getUtcOffset() {
        return (Object) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public void setIsDst(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public Boolean getIsDst() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Object, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Object, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.ABBREV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field3() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.UTC_OFFSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.IS_DST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAbbrev();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value3() {
        return getUtcOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIsDst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTimezoneNamesRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTimezoneNamesRecord value2(String value) {
        setAbbrev(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTimezoneNamesRecord value3(Object value) {
        setUtcOffset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTimezoneNamesRecord value4(Boolean value) {
        setIsDst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTimezoneNamesRecord values(String value1, String value2, Object value3, Boolean value4) {
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
     * Create a detached PgTimezoneNamesRecord
     */
    public PgTimezoneNamesRecord() {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);
    }

    /**
     * Create a detached, initialised PgTimezoneNamesRecord
     */
    public PgTimezoneNamesRecord(String name, String abbrev, Object utcOffset, Boolean isDst) {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);

        set(0, name);
        set(1, abbrev);
        set(2, utcOffset);
        set(3, isDst);
    }
}
