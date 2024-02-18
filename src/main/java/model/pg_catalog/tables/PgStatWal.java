/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgStatWalRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatWal extends TableImpl<PgStatWalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_wal</code>
     */
    public static final PgStatWal PG_STAT_WAL = new PgStatWal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatWalRecord> getRecordType() {
        return PgStatWalRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_records</code>.
     */
    public final TableField<PgStatWalRecord, Long> WAL_RECORDS = createField(DSL.name("wal_records"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_fpi</code>.
     */
    public final TableField<PgStatWalRecord, Long> WAL_FPI = createField(DSL.name("wal_fpi"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_bytes</code>.
     */
    public final TableField<PgStatWalRecord, BigDecimal> WAL_BYTES = createField(DSL.name("wal_bytes"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_buffers_full</code>.
     */
    public final TableField<PgStatWalRecord, Long> WAL_BUFFERS_FULL = createField(DSL.name("wal_buffers_full"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_write</code>.
     */
    public final TableField<PgStatWalRecord, Long> WAL_WRITE = createField(DSL.name("wal_write"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_sync</code>.
     */
    public final TableField<PgStatWalRecord, Long> WAL_SYNC = createField(DSL.name("wal_sync"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_write_time</code>.
     */
    public final TableField<PgStatWalRecord, Double> WAL_WRITE_TIME = createField(DSL.name("wal_write_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.wal_sync_time</code>.
     */
    public final TableField<PgStatWalRecord, Double> WAL_SYNC_TIME = createField(DSL.name("wal_sync_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal.stats_reset</code>.
     */
    public final TableField<PgStatWalRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatWal(Name alias, Table<PgStatWalRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatWal(Name alias, Table<PgStatWalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal</code> table reference
     */
    public PgStatWal(String alias) {
        this(DSL.name(alias), PG_STAT_WAL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal</code> table reference
     */
    public PgStatWal(Name alias) {
        this(alias, PG_STAT_WAL);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_wal</code> table reference
     */
    public PgStatWal() {
        this(DSL.name("pg_stat_wal"), null);
    }

    public <O extends Record> PgStatWal(Table<O> child, ForeignKey<O, PgStatWalRecord> key) {
        super(child, key, PG_STAT_WAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatWal as(String alias) {
        return new PgStatWal(DSL.name(alias), this);
    }

    @Override
    public PgStatWal as(Name alias) {
        return new PgStatWal(alias, this);
    }

    @Override
    public PgStatWal as(Table<?> alias) {
        return new PgStatWal(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWal rename(String name) {
        return new PgStatWal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWal rename(Name name) {
        return new PgStatWal(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWal rename(Table<?> name) {
        return new PgStatWal(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, BigDecimal, Long, Long, Long, Double, Double, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super BigDecimal, ? super Long, ? super Long, ? super Long, ? super Double, ? super Double, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super BigDecimal, ? super Long, ? super Long, ? super Long, ? super Double, ? super Double, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
