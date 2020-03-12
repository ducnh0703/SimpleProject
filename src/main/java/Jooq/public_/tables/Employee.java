/**
 * This class is generated by jOOQ
 */
package Jooq.public_.tables;


import Jooq.public_.Public;
import Jooq.public_.tables.records.EmployeeRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = -12989123;

    /**
     * The reference instance of <code>public.EMPLOYEE</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>public.EMPLOYEE.User</code>.
     */
    public final TableField<EmployeeRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.EMPLOYEE.Pass</code>.
     */
    public final TableField<EmployeeRecord, String> PASS = createField("Pass", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>public.EMPLOYEE</code> table reference
     */
    public Employee() {
        this("EMPLOYEE", null);
    }

    /**
     * Create an aliased <code>public.EMPLOYEE</code> table reference
     */
    public Employee(String alias) {
        this(alias, EMPLOYEE);
    }

    private Employee(String alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(String alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employee as(String alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    public Employee rename(String name) {
        return new Employee(name, null);
    }
}
