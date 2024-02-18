/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgMatviewsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class PgMatviews extends TableImpl<PgMatviewsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_matviews</code>
     */
    public static final PgMatviews PG_MATVIEWS = new PgMatviews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgMatviewsRecord> getRecordType() {
        return PgMatviewsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_matviews.schemaname</code>.
     */
    public final TableField<PgMatviewsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.matviewname</code>.
     */
    public final TableField<PgMatviewsRecord, String> MATVIEWNAME = createField(DSL.name("matviewname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.matviewowner</code>.
     */
    public final TableField<PgMatviewsRecord, String> MATVIEWOWNER = createField(DSL.name("matviewowner"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.tablespace</code>.
     */
    public final TableField<PgMatviewsRecord, String> TABLESPACE = createField(DSL.name("tablespace"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.hasindexes</code>.
     */
    public final TableField<PgMatviewsRecord, Boolean> HASINDEXES = createField(DSL.name("hasindexes"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.ispopulated</code>.
     */
    public final TableField<PgMatviewsRecord, Boolean> ISPOPULATED = createField(DSL.name("ispopulated"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.definition</code>.
     */
    public final TableField<PgMatviewsRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB, this, "");

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews(String alias) {
        this(DSL.name(alias), PG_MATVIEWS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews(Name alias) {
        this(alias, PG_MATVIEWS);
    }

    /**
     * Create a <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews() {
        this(DSL.name("pg_matviews"), null);
    }

    public <O extends Record> PgMatviews(Table<O> child, ForeignKey<O, PgMatviewsRecord> key) {
        super(child, key, PG_MATVIEWS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgMatviews as(String alias) {
        return new PgMatviews(DSL.name(alias), this);
    }

    @Override
    public PgMatviews as(Name alias) {
        return new PgMatviews(alias, this);
    }

    @Override
    public PgMatviews as(Table<?> alias) {
        return new PgMatviews(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgMatviews rename(String name) {
        return new PgMatviews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgMatviews rename(Name name) {
        return new PgMatviews(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgMatviews rename(Table<?> name) {
        return new PgMatviews(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Boolean, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}