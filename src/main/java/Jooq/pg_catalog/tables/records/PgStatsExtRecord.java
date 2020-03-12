/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables.records;


import Jooq.pg_catalog.tables.PgStatsExt;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class PgStatsExtRecord extends TableRecordImpl<PgStatsExtRecord> implements Record13<String, String, String, String, String, String[], String[], Object, Object, String[], Boolean[], Double[], Double[]> {

    private static final long serialVersionUID = -784482548;

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.statistics_schemaname</code>.
     */
    public void setStatisticsSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.statistics_schemaname</code>.
     */
    public String getStatisticsSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.statistics_name</code>.
     */
    public void setStatisticsName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.statistics_name</code>.
     */
    public String getStatisticsName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.statistics_owner</code>.
     */
    public void setStatisticsOwner(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.statistics_owner</code>.
     */
    public String getStatisticsOwner() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.attnames</code>.
     */
    public void setAttnames(String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.attnames</code>.
     */
    public String[] getAttnames() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.kinds</code>.
     */
    public void setKinds(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.kinds</code>.
     */
    public String[] getKinds() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.n_distinct</code>.
     */
    public void setNDistinct(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.n_distinct</code>.
     */
    public Object getNDistinct() {
        return (Object) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.dependencies</code>.
     */
    public void setDependencies(Object value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.dependencies</code>.
     */
    public Object getDependencies() {
        return (Object) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.most_common_vals</code>.
     */
    public void setMostCommonVals(String[] value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.most_common_vals</code>.
     */
    public String[] getMostCommonVals() {
        return (String[]) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.most_common_val_nulls</code>.
     */
    public void setMostCommonValNulls(Boolean[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.most_common_val_nulls</code>.
     */
    public Boolean[] getMostCommonValNulls() {
        return (Boolean[]) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.most_common_freqs</code>.
     */
    public void setMostCommonFreqs(Double[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.most_common_freqs</code>.
     */
    public Double[] getMostCommonFreqs() {
        return (Double[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext.most_common_base_freqs</code>.
     */
    public void setMostCommonBaseFreqs(Double[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext.most_common_base_freqs</code>.
     */
    public Double[] getMostCommonBaseFreqs() {
        return (Double[]) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String[], String[], Object, Object, String[], Boolean[], Double[], Double[]> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String[], String[], Object, Object, String[], Boolean[], Double[], Double[]> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgStatsExt.PG_STATS_EXT.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatsExt.PG_STATS_EXT.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatsExt.PG_STATS_EXT.STATISTICS_SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgStatsExt.PG_STATS_EXT.STATISTICS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatsExt.PG_STATS_EXT.STATISTICS_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return PgStatsExt.PG_STATS_EXT.ATTNAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return PgStatsExt.PG_STATS_EXT.KINDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field8() {
        return PgStatsExt.PG_STATS_EXT.N_DISTINCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field9() {
        return PgStatsExt.PG_STATS_EXT.DEPENDENCIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field10() {
        return PgStatsExt.PG_STATS_EXT.MOST_COMMON_VALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean[]> field11() {
        return PgStatsExt.PG_STATS_EXT.MOST_COMMON_VAL_NULLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double[]> field12() {
        return PgStatsExt.PG_STATS_EXT.MOST_COMMON_FREQS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double[]> field13() {
        return PgStatsExt.PG_STATS_EXT.MOST_COMMON_BASE_FREQS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStatisticsSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStatisticsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatisticsOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getAttnames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getKinds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value8() {
        return getNDistinct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value9() {
        return getDependencies();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value10() {
        return getMostCommonVals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean[] value11() {
        return getMostCommonValNulls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] value12() {
        return getMostCommonFreqs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] value13() {
        return getMostCommonBaseFreqs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value2(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value3(String value) {
        setStatisticsSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value4(String value) {
        setStatisticsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value5(String value) {
        setStatisticsOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value6(String[] value) {
        setAttnames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value7(String[] value) {
        setKinds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value8(Object value) {
        setNDistinct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value9(Object value) {
        setDependencies(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value10(String[] value) {
        setMostCommonVals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value11(Boolean[] value) {
        setMostCommonValNulls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value12(Double[] value) {
        setMostCommonFreqs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord value13(Double[] value) {
        setMostCommonBaseFreqs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatsExtRecord values(String value1, String value2, String value3, String value4, String value5, String[] value6, String[] value7, Object value8, Object value9, String[] value10, Boolean[] value11, Double[] value12, Double[] value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatsExtRecord
     */
    public PgStatsExtRecord() {
        super(PgStatsExt.PG_STATS_EXT);
    }

    /**
     * Create a detached, initialised PgStatsExtRecord
     */
    public PgStatsExtRecord(String schemaname, String tablename, String statisticsSchemaname, String statisticsName, String statisticsOwner, String[] attnames, String[] kinds, Object nDistinct, Object dependencies, String[] mostCommonVals, Boolean[] mostCommonValNulls, Double[] mostCommonFreqs, Double[] mostCommonBaseFreqs) {
        super(PgStatsExt.PG_STATS_EXT);

        set(0, schemaname);
        set(1, tablename);
        set(2, statisticsSchemaname);
        set(3, statisticsName);
        set(4, statisticsOwner);
        set(5, attnames);
        set(6, kinds);
        set(7, nDistinct);
        set(8, dependencies);
        set(9, mostCommonVals);
        set(10, mostCommonValNulls);
        set(11, mostCommonFreqs);
        set(12, mostCommonBaseFreqs);
    }
}
