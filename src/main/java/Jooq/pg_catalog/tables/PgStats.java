/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgStatsRecord;

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
public class PgStats extends TableImpl<PgStatsRecord> {

    private static final long serialVersionUID = 1372888294;

    /**
     * The reference instance of <code>pg_catalog.pg_stats</code>
     */
    public static final PgStats PG_STATS = new PgStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatsRecord> getRecordType() {
        return PgStatsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public final TableField<PgStatsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.tablename</code>.
     */
    public final TableField<PgStatsRecord, String> TABLENAME = createField("tablename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.attname</code>.
     */
    public final TableField<PgStatsRecord, String> ATTNAME = createField("attname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.inherited</code>.
     */
    public final TableField<PgStatsRecord, Boolean> INHERITED = createField("inherited", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public final TableField<PgStatsRecord, Float> NULL_FRAC = createField("null_frac", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public final TableField<PgStatsRecord, Integer> AVG_WIDTH = createField("avg_width", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public final TableField<PgStatsRecord, Float> N_DISTINCT = createField("n_distinct", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public final TableField<PgStatsRecord, Object> MOST_COMMON_VALS = createField("most_common_vals", org.jooq.impl.DefaultDataType.getDefaultDataType("anyarray"), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public final TableField<PgStatsRecord, Float[]> MOST_COMMON_FREQS = createField("most_common_freqs", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public final TableField<PgStatsRecord, Object> HISTOGRAM_BOUNDS = createField("histogram_bounds", org.jooq.impl.DefaultDataType.getDefaultDataType("anyarray"), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.correlation</code>.
     */
    public final TableField<PgStatsRecord, Float> CORRELATION = createField("correlation", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public final TableField<PgStatsRecord, Object> MOST_COMMON_ELEMS = createField("most_common_elems", org.jooq.impl.DefaultDataType.getDefaultDataType("anyarray"), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public final TableField<PgStatsRecord, Float[]> MOST_COMMON_ELEM_FREQS = createField("most_common_elem_freqs", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public final TableField<PgStatsRecord, Float[]> ELEM_COUNT_HISTOGRAM = createField("elem_count_histogram", org.jooq.impl.SQLDataType.REAL.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_stats</code> table reference
     */
    public PgStats() {
        this("pg_stats", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stats</code> table reference
     */
    public PgStats(String alias) {
        this(alias, PG_STATS);
    }

    private PgStats(String alias, Table<PgStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStats(String alias, Table<PgStatsRecord> aliased, Field<?>[] parameters) {
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
    public PgStats as(String alias) {
        return new PgStats(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStats rename(String name) {
        return new PgStats(name, null);
    }
}
