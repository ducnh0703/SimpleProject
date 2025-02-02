/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables.records;


import Jooq.information_schema.tables.UdtPrivileges;

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
public class UdtPrivilegesRecord extends TableRecordImpl<UdtPrivilegesRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -585033576;

    /**
     * Setter for <code>information_schema.udt_privileges.grantor</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.grantor</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.grantee</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public String getIsGrantable() {
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
        return UdtPrivileges.UDT_PRIVILEGES.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UdtPrivileges.UDT_PRIVILEGES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UdtPrivileges.UDT_PRIVILEGES.UDT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UdtPrivileges.UDT_PRIVILEGES.UDT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UdtPrivileges.UDT_PRIVILEGES.UDT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UdtPrivileges.UDT_PRIVILEGES.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UdtPrivileges.UDT_PRIVILEGES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUdtCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUdtSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUdtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value3(String value) {
        setUdtCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value4(String value) {
        setUdtSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value5(String value) {
        setUdtName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value6(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached UdtPrivilegesRecord
     */
    public UdtPrivilegesRecord() {
        super(UdtPrivileges.UDT_PRIVILEGES);
    }

    /**
     * Create a detached, initialised UdtPrivilegesRecord
     */
    public UdtPrivilegesRecord(String grantor, String grantee, String udtCatalog, String udtSchema, String udtName, String privilegeType, String isGrantable) {
        super(UdtPrivileges.UDT_PRIVILEGES);

        set(0, grantor);
        set(1, grantee);
        set(2, udtCatalog);
        set(3, udtSchema);
        set(4, udtName);
        set(5, privilegeType);
        set(6, isGrantable);
    }
}
