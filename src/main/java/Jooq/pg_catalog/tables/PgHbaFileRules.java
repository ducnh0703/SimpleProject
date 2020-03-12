/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgHbaFileRulesRecord;

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
public class PgHbaFileRules extends TableImpl<PgHbaFileRulesRecord> {

    private static final long serialVersionUID = -25291042;

    /**
     * The reference instance of <code>pg_catalog.pg_hba_file_rules</code>
     */
    public static final PgHbaFileRules PG_HBA_FILE_RULES = new PgHbaFileRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgHbaFileRulesRecord> getRecordType() {
        return PgHbaFileRulesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public final TableField<PgHbaFileRulesRecord, Integer> LINE_NUMBER = createField("line_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> DATABASE = createField("database", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> NETMASK = createField("netmask", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> AUTH_METHOD = createField("auth_method", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> OPTIONS = createField("options", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ERROR = createField("error", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules() {
        this("pg_hba_file_rules", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules(String alias) {
        this(alias, PG_HBA_FILE_RULES);
    }

    private PgHbaFileRules(String alias, Table<PgHbaFileRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgHbaFileRules(String alias, Table<PgHbaFileRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgHbaFileRules as(String alias) {
        return new PgHbaFileRules(alias, this);
    }

    /**
     * Rename this table
     */
    public PgHbaFileRules rename(String name) {
        return new PgHbaFileRules(name, null);
    }
}
