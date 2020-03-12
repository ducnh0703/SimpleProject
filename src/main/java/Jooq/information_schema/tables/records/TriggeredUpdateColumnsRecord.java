/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables.records;


import Jooq.information_schema.tables.TriggeredUpdateColumns;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TriggeredUpdateColumnsRecord extends TableRecordImpl<TriggeredUpdateColumnsRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -482016580;

    /**
     * Setter for <code>information_schema.triggered_update_columns.trigger_catalog</code>.
     */
    public void setTriggerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.trigger_catalog</code>.
     */
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.trigger_schema</code>.
     */
    public void setTriggerSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.trigger_schema</code>.
     */
    public String getTriggerSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.trigger_name</code>.
     */
    public void setTriggerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.trigger_name</code>.
     */
    public String getTriggerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.event_object_catalog</code>.
     */
    public void setEventObjectCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.event_object_catalog</code>.
     */
    public String getEventObjectCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.event_object_schema</code>.
     */
    public void setEventObjectSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.event_object_schema</code>.
     */
    public String getEventObjectSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.event_object_table</code>.
     */
    public void setEventObjectTable(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.event_object_table</code>.
     */
    public String getEventObjectTable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.triggered_update_columns.event_object_column</code>.
     */
    public void setEventObjectColumn(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.triggered_update_columns.event_object_column</code>.
     */
    public String getEventObjectColumn() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.TRIGGER_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.TRIGGER_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.TRIGGER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.EVENT_OBJECT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.EVENT_OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.EVENT_OBJECT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS.EVENT_OBJECT_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTriggerCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTriggerSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTriggerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEventObjectCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEventObjectTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEventObjectColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value1(String value) {
        setTriggerCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value2(String value) {
        setTriggerSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value3(String value) {
        setTriggerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value4(String value) {
        setEventObjectCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value5(String value) {
        setEventObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value6(String value) {
        setEventObjectTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord value7(String value) {
        setEventObjectColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TriggeredUpdateColumnsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TriggeredUpdateColumnsRecord
     */
    public TriggeredUpdateColumnsRecord() {
        super(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS);
    }

    /**
     * Create a detached, initialised TriggeredUpdateColumnsRecord
     */
    public TriggeredUpdateColumnsRecord(String triggerCatalog, String triggerSchema, String triggerName, String eventObjectCatalog, String eventObjectSchema, String eventObjectTable, String eventObjectColumn) {
        super(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS);

        set(0, triggerCatalog);
        set(1, triggerSchema);
        set(2, triggerName);
        set(3, eventObjectCatalog);
        set(4, eventObjectSchema);
        set(5, eventObjectTable);
        set(6, eventObjectColumn);
    }
}
