/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatDatabaseConflictsRecord;

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
public class PgStatDatabaseConflicts extends TableImpl<PgStatDatabaseConflictsRecord> {

    private static final long serialVersionUID = -927676773;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_database_conflicts</code>
     */
    public static final PgStatDatabaseConflicts PG_STAT_DATABASE_CONFLICTS = new PgStatDatabaseConflicts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatDatabaseConflictsRecord> getRecordType() {
        return PgStatDatabaseConflictsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> DATID = createField("datid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_TABLESPACE = createField("confl_tablespace", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_LOCK = createField("confl_lock", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_SNAPSHOT = createField("confl_snapshot", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_BUFFERPIN = createField("confl_bufferpin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_DEADLOCK = createField("confl_deadlock", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_database_conflicts</code> table reference
     */
    public PgStatDatabaseConflicts() {
        this("pg_stat_database_conflicts", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code> table reference
     */
    public PgStatDatabaseConflicts(String alias) {
        this(alias, PG_STAT_DATABASE_CONFLICTS);
    }

    private PgStatDatabaseConflicts(String alias, Table<PgStatDatabaseConflictsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabaseConflicts(String alias, Table<PgStatDatabaseConflictsRecord> aliased, Field<?>[] parameters) {
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
    public PgStatDatabaseConflicts as(String alias) {
        return new PgStatDatabaseConflicts(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatDatabaseConflicts rename(String name) {
        return new PgStatDatabaseConflicts(name, null);
    }
}
