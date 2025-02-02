/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgSettings;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class PgSettingsRecord extends TableRecordImpl<PgSettingsRecord> implements Record17<String, String, String, String, String, String, String, String, String, String, String, String[], String, String, String, Integer, Boolean> {

    private static final long serialVersionUID = -1767129695;

    /**
     * Setter for <code>pg_catalog.pg_settings.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.setting</code>.
     */
    public void setSetting(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.setting</code>.
     */
    public String getSetting() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.unit</code>.
     */
    public void setUnit(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.unit</code>.
     */
    public String getUnit() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.category</code>.
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.category</code>.
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.short_desc</code>.
     */
    public void setShortDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.short_desc</code>.
     */
    public String getShortDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    public void setExtraDesc(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    public String getExtraDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.context</code>.
     */
    public void setContext(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.context</code>.
     */
    public String getContext() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.vartype</code>.
     */
    public void setVartype(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.vartype</code>.
     */
    public String getVartype() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.source</code>.
     */
    public void setSource(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.source</code>.
     */
    public String getSource() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.min_val</code>.
     */
    public void setMinVal(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.min_val</code>.
     */
    public String getMinVal() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.max_val</code>.
     */
    public void setMaxVal(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.max_val</code>.
     */
    public String getMaxVal() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.enumvals</code>.
     */
    public void setEnumvals(String[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.enumvals</code>.
     */
    public String[] getEnumvals() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.boot_val</code>.
     */
    public void setBootVal(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.boot_val</code>.
     */
    public String getBootVal() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.reset_val</code>.
     */
    public void setResetVal(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.reset_val</code>.
     */
    public String getResetVal() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    public void setSourcefile(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    public String getSourcefile() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.sourceline</code>.
     */
    public void setSourceline(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.sourceline</code>.
     */
    public Integer getSourceline() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    public void setPendingRestart(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    public Boolean getPendingRestart() {
        return (Boolean) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String[], String, String, String, Integer, Boolean> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String[], String, String, String, Integer, Boolean> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgSettings.PG_SETTINGS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgSettings.PG_SETTINGS.SETTING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgSettings.PG_SETTINGS.UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgSettings.PG_SETTINGS.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgSettings.PG_SETTINGS.SHORT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgSettings.PG_SETTINGS.EXTRA_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgSettings.PG_SETTINGS.CONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PgSettings.PG_SETTINGS.VARTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PgSettings.PG_SETTINGS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return PgSettings.PG_SETTINGS.MIN_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgSettings.PG_SETTINGS.MAX_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return PgSettings.PG_SETTINGS.ENUMVALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return PgSettings.PG_SETTINGS.BOOT_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return PgSettings.PG_SETTINGS.RESET_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return PgSettings.PG_SETTINGS.SOURCEFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return PgSettings.PG_SETTINGS.SOURCELINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return PgSettings.PG_SETTINGS.PENDING_RESTART;
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
        return getSetting();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getExtraDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getVartype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMinVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMaxVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getEnumvals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBootVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getResetVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSourcefile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getSourceline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getPendingRestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value2(String value) {
        setSetting(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value3(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value4(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value5(String value) {
        setShortDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value6(String value) {
        setExtraDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value7(String value) {
        setContext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value8(String value) {
        setVartype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value9(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value10(String value) {
        setMinVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value11(String value) {
        setMaxVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value12(String[] value) {
        setEnumvals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value13(String value) {
        setBootVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value14(String value) {
        setResetVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value15(String value) {
        setSourcefile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value16(Integer value) {
        setSourceline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord value17(Boolean value) {
        setPendingRestart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettingsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String[] value12, String value13, String value14, String value15, Integer value16, Boolean value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSettingsRecord
     */
    public PgSettingsRecord() {
        super(PgSettings.PG_SETTINGS);
    }

    /**
     * Create a detached, initialised PgSettingsRecord
     */
    public PgSettingsRecord(String name, String setting, String unit, String category, String shortDesc, String extraDesc, String context, String vartype, String source, String minVal, String maxVal, String[] enumvals, String bootVal, String resetVal, String sourcefile, Integer sourceline, Boolean pendingRestart) {
        super(PgSettings.PG_SETTINGS);

        set(0, name);
        set(1, setting);
        set(2, unit);
        set(3, category);
        set(4, shortDesc);
        set(5, extraDesc);
        set(6, context);
        set(7, vartype);
        set(8, source);
        set(9, minVal);
        set(10, maxVal);
        set(11, enumvals);
        set(12, bootVal);
        set(13, resetVal);
        set(14, sourcefile);
        set(15, sourceline);
        set(16, pendingRestart);
    }
}
