/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.time.OffsetDateTime;
import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgStatSlruRecord;

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
public class PgStatSlru extends TableImpl<PgStatSlruRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_slru</code>
     */
    public static final PgStatSlru PG_STAT_SLRU = new PgStatSlru();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSlruRecord> getRecordType() {
        return PgStatSlruRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_slru.name</code>.
     */
    public final TableField<PgStatSlruRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.blks_zeroed</code>.
     */
    public final TableField<PgStatSlruRecord, Long> BLKS_ZEROED = createField(DSL.name("blks_zeroed"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.blks_hit</code>.
     */
    public final TableField<PgStatSlruRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.blks_read</code>.
     */
    public final TableField<PgStatSlruRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.blks_written</code>.
     */
    public final TableField<PgStatSlruRecord, Long> BLKS_WRITTEN = createField(DSL.name("blks_written"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.blks_exists</code>.
     */
    public final TableField<PgStatSlruRecord, Long> BLKS_EXISTS = createField(DSL.name("blks_exists"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.flushes</code>.
     */
    public final TableField<PgStatSlruRecord, Long> FLUSHES = createField(DSL.name("flushes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.truncates</code>.
     */
    public final TableField<PgStatSlruRecord, Long> TRUNCATES = createField(DSL.name("truncates"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_slru.stats_reset</code>.
     */
    public final TableField<PgStatSlruRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatSlru(Name alias, Table<PgStatSlruRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSlru(Name alias, Table<PgStatSlruRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_slru</code> table reference
     */
    public PgStatSlru(String alias) {
        this(DSL.name(alias), PG_STAT_SLRU);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_slru</code> table reference
     */
    public PgStatSlru(Name alias) {
        this(alias, PG_STAT_SLRU);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_slru</code> table reference
     */
    public PgStatSlru() {
        this(DSL.name("pg_stat_slru"), null);
    }

    public <O extends Record> PgStatSlru(Table<O> child, ForeignKey<O, PgStatSlruRecord> key) {
        super(child, key, PG_STAT_SLRU);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatSlru as(String alias) {
        return new PgStatSlru(DSL.name(alias), this);
    }

    @Override
    public PgStatSlru as(Name alias) {
        return new PgStatSlru(alias, this);
    }

    @Override
    public PgStatSlru as(Table<?> alias) {
        return new PgStatSlru(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSlru rename(String name) {
        return new PgStatSlru(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSlru rename(Name name) {
        return new PgStatSlru(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSlru rename(Table<?> name) {
        return new PgStatSlru(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
