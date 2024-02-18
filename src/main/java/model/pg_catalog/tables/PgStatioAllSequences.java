/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgStatioAllSequencesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class PgStatioAllSequences extends TableImpl<PgStatioAllSequencesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_all_sequences</code>
     */
    public static final PgStatioAllSequences PG_STATIO_ALL_SEQUENCES = new PgStatioAllSequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioAllSequencesRecord> getRecordType() {
        return PgStatioAllSequencesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.relid</code>.
     */
    public final TableField<PgStatioAllSequencesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.schemaname</code>.
     */
    public final TableField<PgStatioAllSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.relname</code>.
     */
    public final TableField<PgStatioAllSequencesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.blks_read</code>.
     */
    public final TableField<PgStatioAllSequencesRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.blks_hit</code>.
     */
    public final TableField<PgStatioAllSequencesRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioAllSequences(Name alias, Table<PgStatioAllSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioAllSequences(Name alias, Table<PgStatioAllSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_sequences</code> table
     * reference
     */
    public PgStatioAllSequences(String alias) {
        this(DSL.name(alias), PG_STATIO_ALL_SEQUENCES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_sequences</code> table
     * reference
     */
    public PgStatioAllSequences(Name alias) {
        this(alias, PG_STATIO_ALL_SEQUENCES);
    }

    /**
     * Create a <code>pg_catalog.pg_statio_all_sequences</code> table reference
     */
    public PgStatioAllSequences() {
        this(DSL.name("pg_statio_all_sequences"), null);
    }

    public <O extends Record> PgStatioAllSequences(Table<O> child, ForeignKey<O, PgStatioAllSequencesRecord> key) {
        super(child, key, PG_STATIO_ALL_SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioAllSequences as(String alias) {
        return new PgStatioAllSequences(DSL.name(alias), this);
    }

    @Override
    public PgStatioAllSequences as(Name alias) {
        return new PgStatioAllSequences(alias, this);
    }

    @Override
    public PgStatioAllSequences as(Table<?> alias) {
        return new PgStatioAllSequences(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllSequences rename(String name) {
        return new PgStatioAllSequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllSequences rename(Name name) {
        return new PgStatioAllSequences(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllSequences rename(Table<?> name) {
        return new PgStatioAllSequences(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
