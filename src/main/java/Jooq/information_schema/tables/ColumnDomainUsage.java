/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables;


import Jooq.information_schema.InformationSchema;
import Jooq.information_schema.tables.records.ColumnDomainUsageRecord;

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
public class ColumnDomainUsage extends TableImpl<ColumnDomainUsageRecord> {

    private static final long serialVersionUID = 1569089988;

    /**
     * The reference instance of <code>information_schema.column_domain_usage</code>
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = new ColumnDomainUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnDomainUsageRecord> getRecordType() {
        return ColumnDomainUsageRecord.class;
    }

    /**
     * The column <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.table_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.column_domain_usage.column_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.column_domain_usage</code> table reference
     */
    public ColumnDomainUsage() {
        this("column_domain_usage", null);
    }

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code> table reference
     */
    public ColumnDomainUsage(String alias) {
        this(alias, COLUMN_DOMAIN_USAGE);
    }

    private ColumnDomainUsage(String alias, Table<ColumnDomainUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnDomainUsage(String alias, Table<ColumnDomainUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnDomainUsage as(String alias) {
        return new ColumnDomainUsage(alias, this);
    }

    /**
     * Rename this table
     */
    public ColumnDomainUsage rename(String name) {
        return new ColumnDomainUsage(name, null);
    }
}
