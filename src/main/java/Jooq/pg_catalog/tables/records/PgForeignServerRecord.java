/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgForeignServer;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgForeignServerRecord extends TableRecordImpl<PgForeignServerRecord> implements Record8<Long, String, Long, Long, String, String, String[], String[]> {

    private static final long serialVersionUID = -1664755760;

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public void setSrvname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public String getSrvname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public void setSrvowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public Long getSrvowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public void setSrvfdw(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public Long getSrvfdw() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public void setSrvtype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public String getSrvtype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public void setSrvversion(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public String getSrvversion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public void setSrvacl(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public String[] getSrvacl() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public void setSrvoptions(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public String[] getSrvoptions() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, String, String, String[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, String, String, String[], String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgForeignServer.PG_FOREIGN_SERVER.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVFDW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOPTIONS;
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
        return getSrvname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSrvowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getSrvfdw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSrvtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSrvversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getSrvacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getSrvoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value2(String value) {
        setSrvname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value3(Long value) {
        setSrvowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value4(Long value) {
        setSrvfdw(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value5(String value) {
        setSrvtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value6(String value) {
        setSrvversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value7(String[] value) {
        setSrvacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord value8(String[] value) {
        setSrvoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignServerRecord values(Long value1, String value2, Long value3, Long value4, String value5, String value6, String[] value7, String[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgForeignServerRecord
     */
    public PgForeignServerRecord() {
        super(PgForeignServer.PG_FOREIGN_SERVER);
    }

    /**
     * Create a detached, initialised PgForeignServerRecord
     */
    public PgForeignServerRecord(Long oid, String srvname, Long srvowner, Long srvfdw, String srvtype, String srvversion, String[] srvacl, String[] srvoptions) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        set(0, oid);
        set(1, srvname);
        set(2, srvowner);
        set(3, srvfdw);
        set(4, srvtype);
        set(5, srvversion);
        set(6, srvacl);
        set(7, srvoptions);
    }
}
