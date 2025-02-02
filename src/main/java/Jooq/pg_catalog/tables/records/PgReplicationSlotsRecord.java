/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgReplicationSlots;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class PgReplicationSlotsRecord extends TableRecordImpl<PgReplicationSlotsRecord> implements Record12<String, String, String, Long, String, Boolean, Boolean, Integer, Long, Long, Object, Object> {

    private static final long serialVersionUID = 1189698047;

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.slot_name</code>.
     */
    public void setSlotName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.slot_name</code>.
     */
    public String getSlotName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.plugin</code>.
     */
    public void setPlugin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.plugin</code>.
     */
    public String getPlugin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.slot_type</code>.
     */
    public void setSlotType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.slot_type</code>.
     */
    public String getSlotType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.datoid</code>.
     */
    public void setDatoid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.datoid</code>.
     */
    public Long getDatoid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.database</code>.
     */
    public void setDatabase(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.database</code>.
     */
    public String getDatabase() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.temporary</code>.
     */
    public void setTemporary(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.temporary</code>.
     */
    public Boolean getTemporary() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.active</code>.
     */
    public void setActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.active_pid</code>.
     */
    public void setActivePid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.active_pid</code>.
     */
    public Integer getActivePid() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.xmin</code>.
     */
    public void setXmin(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.xmin</code>.
     */
    public Long getXmin() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.catalog_xmin</code>.
     */
    public void setCatalogXmin(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.catalog_xmin</code>.
     */
    public Long getCatalogXmin() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.restart_lsn</code>.
     */
    public void setRestartLsn(Object value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.restart_lsn</code>.
     */
    public Object getRestartLsn() {
        return (Object) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_slots.confirmed_flush_lsn</code>.
     */
    public void setConfirmedFlushLsn(Object value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_slots.confirmed_flush_lsn</code>.
     */
    public Object getConfirmedFlushLsn() {
        return (Object) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, Long, String, Boolean, Boolean, Integer, Long, Long, Object, Object> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, Long, String, Boolean, Boolean, Integer, Long, Long, Object, Object> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.SLOT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.PLUGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.SLOT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.DATOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.DATABASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.TEMPORARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.ACTIVE_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.XMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.CATALOG_XMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field11() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.RESTART_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field12() {
        return PgReplicationSlots.PG_REPLICATION_SLOTS.CONFIRMED_FLUSH_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSlotName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPlugin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSlotType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getDatoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatabase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getTemporary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getActivePid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getXmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCatalogXmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value11() {
        return getRestartLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value12() {
        return getConfirmedFlushLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value1(String value) {
        setSlotName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value2(String value) {
        setPlugin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value3(String value) {
        setSlotType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value4(Long value) {
        setDatoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value5(String value) {
        setDatabase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value6(Boolean value) {
        setTemporary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value8(Integer value) {
        setActivePid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value9(Long value) {
        setXmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value10(Long value) {
        setCatalogXmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value11(Object value) {
        setRestartLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord value12(Object value) {
        setConfirmedFlushLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationSlotsRecord values(String value1, String value2, String value3, Long value4, String value5, Boolean value6, Boolean value7, Integer value8, Long value9, Long value10, Object value11, Object value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgReplicationSlotsRecord
     */
    public PgReplicationSlotsRecord() {
        super(PgReplicationSlots.PG_REPLICATION_SLOTS);
    }

    /**
     * Create a detached, initialised PgReplicationSlotsRecord
     */
    public PgReplicationSlotsRecord(String slotName, String plugin, String slotType, Long datoid, String database, Boolean temporary, Boolean active, Integer activePid, Long xmin, Long catalogXmin, Object restartLsn, Object confirmedFlushLsn) {
        super(PgReplicationSlots.PG_REPLICATION_SLOTS);

        set(0, slotName);
        set(1, plugin);
        set(2, slotType);
        set(3, datoid);
        set(4, database);
        set(5, temporary);
        set(6, active);
        set(7, activePid);
        set(8, xmin);
        set(9, catalogXmin);
        set(10, restartLsn);
        set(11, confirmedFlushLsn);
    }
}
