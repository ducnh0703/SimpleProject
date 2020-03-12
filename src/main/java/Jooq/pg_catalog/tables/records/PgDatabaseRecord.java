/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgDatabase;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class PgDatabaseRecord extends TableRecordImpl<PgDatabaseRecord> implements Record14<Long, String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> {

    private static final long serialVersionUID = 979686986;

    /**
     * Setter for <code>pg_catalog.pg_database.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public void setDatdba(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public Long getDatdba() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public void setEncoding(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public Integer getEncoding() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public void setDatcollate(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public String getDatcollate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public void setDatctype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public String getDatctype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public void setDatistemplate(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public Boolean getDatistemplate() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public void setDatallowconn(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public Boolean getDatallowconn() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public void setDatconnlimit(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public Integer getDatconnlimit() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public void setDatlastsysoid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public Long getDatlastsysoid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public void setDatfrozenxid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public Long getDatfrozenxid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public void setDatminmxid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public Long getDatminmxid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public void setDattablespace(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public Long getDattablespace() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public void setDatacl(String[] value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public String[] getDatacl() {
        return (String[]) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, Long, Integer, String, String, Boolean, Boolean, Integer, Long, Long, Long, Long, String[]> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgDatabase.PG_DATABASE.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgDatabase.PG_DATABASE.DATNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgDatabase.PG_DATABASE.DATDBA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgDatabase.PG_DATABASE.ENCODING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgDatabase.PG_DATABASE.DATCOLLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgDatabase.PG_DATABASE.DATCTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgDatabase.PG_DATABASE.DATISTEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return PgDatabase.PG_DATABASE.DATALLOWCONN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return PgDatabase.PG_DATABASE.DATCONNLIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgDatabase.PG_DATABASE.DATLASTSYSOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PgDatabase.PG_DATABASE.DATFROZENXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return PgDatabase.PG_DATABASE.DATMINMXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return PgDatabase.PG_DATABASE.DATTABLESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field14() {
        return PgDatabase.PG_DATABASE.DATACL;
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
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getDatdba();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatcollate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDatctype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDatistemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getDatallowconn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDatconnlimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getDatlastsysoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getDatfrozenxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getDatminmxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getDattablespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value14() {
        return getDatacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value1(Long value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value2(String value) {
        setDatname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value3(Long value) {
        setDatdba(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value4(Integer value) {
        setEncoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value5(String value) {
        setDatcollate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value6(String value) {
        setDatctype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value7(Boolean value) {
        setDatistemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value8(Boolean value) {
        setDatallowconn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value9(Integer value) {
        setDatconnlimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value10(Long value) {
        setDatlastsysoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value11(Long value) {
        setDatfrozenxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value12(Long value) {
        setDatminmxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value13(Long value) {
        setDattablespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord value14(String[] value) {
        setDatacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabaseRecord values(Long value1, String value2, Long value3, Integer value4, String value5, String value6, Boolean value7, Boolean value8, Integer value9, Long value10, Long value11, Long value12, Long value13, String[] value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDatabaseRecord
     */
    public PgDatabaseRecord() {
        super(PgDatabase.PG_DATABASE);
    }

    /**
     * Create a detached, initialised PgDatabaseRecord
     */
    public PgDatabaseRecord(Long oid, String datname, Long datdba, Integer encoding, String datcollate, String datctype, Boolean datistemplate, Boolean datallowconn, Integer datconnlimit, Long datlastsysoid, Long datfrozenxid, Long datminmxid, Long dattablespace, String[] datacl) {
        super(PgDatabase.PG_DATABASE);

        set(0, oid);
        set(1, datname);
        set(2, datdba);
        set(3, encoding);
        set(4, datcollate);
        set(5, datctype);
        set(6, datistemplate);
        set(7, datallowconn);
        set(8, datconnlimit);
        set(9, datlastsysoid);
        set(10, datfrozenxid);
        set(11, datminmxid);
        set(12, dattablespace);
        set(13, datacl);
    }
}
