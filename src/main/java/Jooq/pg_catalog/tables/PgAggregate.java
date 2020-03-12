/**
 * This class is generated by jOOQ
 */
package Jooq.pg_catalog.tables;


import Jooq.pg_catalog.PgCatalog;
import Jooq.pg_catalog.tables.records.PgAggregateRecord;

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
public class PgAggregate extends TableImpl<PgAggregateRecord> {

    private static final long serialVersionUID = 866312034;

    /**
     * The reference instance of <code>pg_catalog.pg_aggregate</code>
     */
    public static final PgAggregate PG_AGGREGATE = new PgAggregate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAggregateRecord> getRecordType() {
        return PgAggregateRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGFNOID = createField("aggfnoid", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGKIND = createField("aggkind", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    public final TableField<PgAggregateRecord, Short> AGGNUMDIRECTARGS = createField("aggnumdirectargs", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGTRANSFN = createField("aggtransfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGFINALFN = createField("aggfinalfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGCOMBINEFN = createField("aggcombinefn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGSERIALFN = createField("aggserialfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGDESERIALFN = createField("aggdeserialfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGMTRANSFN = createField("aggmtransfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGMINVTRANSFN = createField("aggminvtransfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGMFINALFN = createField("aggmfinalfn", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    public final TableField<PgAggregateRecord, Boolean> AGGFINALEXTRA = createField("aggfinalextra", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    public final TableField<PgAggregateRecord, Boolean> AGGMFINALEXTRA = createField("aggmfinalextra", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGFINALMODIFY = createField("aggfinalmodify", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGMFINALMODIFY = createField("aggmfinalmodify", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    public final TableField<PgAggregateRecord, Long> AGGSORTOP = createField("aggsortop", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    public final TableField<PgAggregateRecord, Long> AGGTRANSTYPE = createField("aggtranstype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    public final TableField<PgAggregateRecord, Integer> AGGTRANSSPACE = createField("aggtransspace", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    public final TableField<PgAggregateRecord, Long> AGGMTRANSTYPE = createField("aggmtranstype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    public final TableField<PgAggregateRecord, Integer> AGGMTRANSSPACE = createField("aggmtransspace", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGINITVAL = createField("agginitval", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    public final TableField<PgAggregateRecord, String> AGGMINITVAL = createField("aggminitval", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_aggregate</code> table reference
     */
    public PgAggregate() {
        this("pg_aggregate", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_aggregate</code> table reference
     */
    public PgAggregate(String alias) {
        this(alias, PG_AGGREGATE);
    }

    private PgAggregate(String alias, Table<PgAggregateRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAggregate(String alias, Table<PgAggregateRecord> aliased, Field<?>[] parameters) {
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
    public PgAggregate as(String alias) {
        return new PgAggregate(alias, this);
    }

    /**
     * Rename this table
     */
    public PgAggregate rename(String name) {
        return new PgAggregate(name, null);
    }
}
