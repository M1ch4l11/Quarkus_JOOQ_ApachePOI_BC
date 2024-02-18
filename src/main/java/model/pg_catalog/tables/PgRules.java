/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgRulesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class PgRules extends TableImpl<PgRulesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_rules</code>
     */
    public static final PgRules PG_RULES = new PgRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRulesRecord> getRecordType() {
        return PgRulesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_rules.schemaname</code>.
     */
    public final TableField<PgRulesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_rules.tablename</code>.
     */
    public final TableField<PgRulesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_rules.rulename</code>.
     */
    public final TableField<PgRulesRecord, String> RULENAME = createField(DSL.name("rulename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_rules.definition</code>.
     */
    public final TableField<PgRulesRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB, this, "");

    private PgRules(Name alias, Table<PgRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRules(Name alias, Table<PgRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rules</code> table reference
     */
    public PgRules(String alias) {
        this(DSL.name(alias), PG_RULES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rules</code> table reference
     */
    public PgRules(Name alias) {
        this(alias, PG_RULES);
    }

    /**
     * Create a <code>pg_catalog.pg_rules</code> table reference
     */
    public PgRules() {
        this(DSL.name("pg_rules"), null);
    }

    public <O extends Record> PgRules(Table<O> child, ForeignKey<O, PgRulesRecord> key) {
        super(child, key, PG_RULES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgRules as(String alias) {
        return new PgRules(DSL.name(alias), this);
    }

    @Override
    public PgRules as(Name alias) {
        return new PgRules(alias, this);
    }

    @Override
    public PgRules as(Table<?> alias) {
        return new PgRules(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRules rename(String name) {
        return new PgRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRules rename(Name name) {
        return new PgRules(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRules rename(Table<?> name) {
        return new PgRules(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
