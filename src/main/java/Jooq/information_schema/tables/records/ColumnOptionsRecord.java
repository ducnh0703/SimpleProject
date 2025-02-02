/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables.records;


import Jooq.information_schema.tables.ColumnOptions;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ColumnOptionsRecord extends TableRecordImpl<ColumnOptionsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 508251596;

    /**
     * Setter for <code>information_schema.column_options.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_options.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_options.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.column_options.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.column_options.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ColumnOptions.COLUMN_OPTIONS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOptionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOptionValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value5(String value) {
        setOptionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord value6(String value) {
        setOptionValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnOptionsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnOptionsRecord
     */
    public ColumnOptionsRecord() {
        super(ColumnOptions.COLUMN_OPTIONS);
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    public ColumnOptionsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, String optionName, String optionValue) {
        super(ColumnOptions.COLUMN_OPTIONS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, columnName);
        set(4, optionName);
        set(5, optionValue);
    }
}
