/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgForeignTable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgForeignTableRecord extends TableRecordImpl<PgForeignTableRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = -1009162489;

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public void setFtrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public Long getFtrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public void setFtserver(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public Long getFtserver() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public void setFtoptions(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public String[] getFtoptions() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTSERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getFtrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getFtserver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getFtoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTableRecord value1(Long value) {
        setFtrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTableRecord value2(Long value) {
        setFtserver(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTableRecord value3(String[] value) {
        setFtoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTableRecord values(Long value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgForeignTableRecord
     */
    public PgForeignTableRecord() {
        super(PgForeignTable.PG_FOREIGN_TABLE);
    }

    /**
     * Create a detached, initialised PgForeignTableRecord
     */
    public PgForeignTableRecord(Long ftrelid, Long ftserver, String[] ftoptions) {
        super(PgForeignTable.PG_FOREIGN_TABLE);

        set(0, ftrelid);
        set(1, ftserver);
        set(2, ftoptions);
    }
}
