/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables.records;


import Jooq.information_schema.tables.ForeignDataWrapperOptions;

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
public class ForeignDataWrapperOptionsRecord extends TableRecordImpl<ForeignDataWrapperOptionsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 271765423;

    /**
     * Setter for <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.FOREIGN_DATA_WRAPPER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.OPTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.OPTION_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getForeignDataWrapperCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getForeignDataWrapperName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOptionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOptionValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptionsRecord value1(String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptionsRecord value2(String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptionsRecord value3(String value) {
        setOptionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptionsRecord value4(String value) {
        setOptionValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrapperOptionsRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord() {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    /**
     * Create a detached, initialised ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord(String foreignDataWrapperCatalog, String foreignDataWrapperName, String optionName, String optionValue) {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);

        set(0, foreignDataWrapperCatalog);
        set(1, foreignDataWrapperName);
        set(2, optionName);
        set(3, optionValue);
    }
}
