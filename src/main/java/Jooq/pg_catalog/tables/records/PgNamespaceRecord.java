/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgNamespace;

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
public class PgNamespaceRecord extends TableRecordImpl<PgNamespaceRecord> implements Record4<Long, String, Long, String[]> {

    private static final long serialVersionUID = 1192015626;

    /**
     * Setter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public void setNspname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public String getNspname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public void setNspowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public Long getNspowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public void setNspacl(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public String[] getNspacl() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgNamespace.PG_NAMESPACE.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgNamespace.PG_NAMESPACE.NSPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgNamespace.PG_NAMESPACE.NSPOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return PgNamespace.PG_NAMESPACE.NSPACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNspname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getNspowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getNspacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value2(String value) {
        setNspname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value3(Long value) {
        setNspowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value4(String[] value) {
        setNspacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord values(Long value1, String value2, Long value3, String[] value4) {
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
     * Create a detached PgNamespaceRecord
     */
    public PgNamespaceRecord() {
        super(PgNamespace.PG_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgNamespaceRecord
     */
    public PgNamespaceRecord(Long oid, String nspname, Long nspowner, String[] nspacl) {
        super(PgNamespace.PG_NAMESPACE);

        set(0, oid);
        set(1, nspname);
        set(2, nspowner);
        set(3, nspacl);
    }
}
