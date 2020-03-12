/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgStatioAllIndexes;

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
public class PgStatioAllIndexesRecord extends TableRecordImpl<PgStatioAllIndexesRecord> implements Record7<Long, Long, String, String, String, Long, Long> {

    private static final long serialVersionUID = -69144575;

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.relname</code>.
     */
    public void setRelname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.relname</code>.
     */
    public String getRelname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>.
     */
    public void setIdxBlksRead(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>.
     */
    public Long getIdxBlksRead() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>.
     */
    public Long getIdxBlksHit() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.INDEXRELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgStatioAllIndexes.PG_STATIO_ALL_INDEXES.IDX_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndexrelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getIdxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getIdxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value2(Long value) {
        setIndexrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value3(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value4(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value5(String value) {
        setIndexrelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value6(Long value) {
        setIdxBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord value7(Long value) {
        setIdxBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllIndexesRecord values(Long value1, Long value2, String value3, String value4, String value5, Long value6, Long value7) {
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
     * Create a detached PgStatioAllIndexesRecord
     */
    public PgStatioAllIndexesRecord() {
        super(PgStatioAllIndexes.PG_STATIO_ALL_INDEXES);
    }

    /**
     * Create a detached, initialised PgStatioAllIndexesRecord
     */
    public PgStatioAllIndexesRecord(Long relid, Long indexrelid, String schemaname, String relname, String indexrelname, Long idxBlksRead, Long idxBlksHit) {
        super(PgStatioAllIndexes.PG_STATIO_ALL_INDEXES);

        set(0, relid);
        set(1, indexrelid);
        set(2, schemaname);
        set(3, relname);
        set(4, indexrelname);
        set(5, idxBlksRead);
        set(6, idxBlksHit);
    }
}
