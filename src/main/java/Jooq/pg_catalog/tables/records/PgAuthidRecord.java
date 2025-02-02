/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgAuthid;

import java.sql.Timestamp;

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
public class PgAuthidRecord extends TableRecordImpl<PgAuthidRecord> implements Record12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp> {

    private static final long serialVersionUID = 1589504661;

    /**
     * Setter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public void setRolname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public String getRolname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public void setRolsuper(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public Boolean getRolsuper() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public void setRolinherit(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public Boolean getRolinherit() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public void setRolcreaterole(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public Boolean getRolcreaterole() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public void setRolcreatedb(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public Boolean getRolcreatedb() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public void setRolcanlogin(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public Boolean getRolcanlogin() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public void setRolreplication(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public Boolean getRolreplication() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public void setRolbypassrls(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public Boolean getRolbypassrls() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public void setRolconnlimit(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public Integer getRolconnlimit() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public void setRolpassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public String getRolpassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public Timestamp getRolvaliduntil() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgAuthid.PG_AUTHID.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgAuthid.PG_AUTHID.ROLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgAuthid.PG_AUTHID.ROLSUPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgAuthid.PG_AUTHID.ROLINHERIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgAuthid.PG_AUTHID.ROLCREATEROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgAuthid.PG_AUTHID.ROLCREATEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgAuthid.PG_AUTHID.ROLCANLOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return PgAuthid.PG_AUTHID.ROLREPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return PgAuthid.PG_AUTHID.ROLBYPASSRLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return PgAuthid.PG_AUTHID.ROLCONNLIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgAuthid.PG_AUTHID.ROLPASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return PgAuthid.PG_AUTHID.ROLVALIDUNTIL;
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
        return getRolname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getRolsuper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getRolinherit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getRolcreaterole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getRolcreatedb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getRolcanlogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getRolreplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getRolbypassrls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getRolconnlimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRolpassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getRolvaliduntil();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value2(String value) {
        setRolname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value3(Boolean value) {
        setRolsuper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value4(Boolean value) {
        setRolinherit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value5(Boolean value) {
        setRolcreaterole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value6(Boolean value) {
        setRolcreatedb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value7(Boolean value) {
        setRolcanlogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value8(Boolean value) {
        setRolreplication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value9(Boolean value) {
        setRolbypassrls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value10(Integer value) {
        setRolconnlimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value11(String value) {
        setRolpassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord value12(Timestamp value) {
        setRolvaliduntil(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthidRecord values(Long value1, String value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7, Boolean value8, Boolean value9, Integer value10, String value11, Timestamp value12) {
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
     * Create a detached PgAuthidRecord
     */
    public PgAuthidRecord() {
        super(PgAuthid.PG_AUTHID);
    }

    /**
     * Create a detached, initialised PgAuthidRecord
     */
    public PgAuthidRecord(Long oid, String rolname, Boolean rolsuper, Boolean rolinherit, Boolean rolcreaterole, Boolean rolcreatedb, Boolean rolcanlogin, Boolean rolreplication, Boolean rolbypassrls, Integer rolconnlimit, String rolpassword, Timestamp rolvaliduntil) {
        super(PgAuthid.PG_AUTHID);

        set(0, oid);
        set(1, rolname);
        set(2, rolsuper);
        set(3, rolinherit);
        set(4, rolcreaterole);
        set(5, rolcreatedb);
        set(6, rolcanlogin);
        set(7, rolreplication);
        set(8, rolbypassrls);
        set(9, rolconnlimit);
        set(10, rolpassword);
        set(11, rolvaliduntil);
    }
}
