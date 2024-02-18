/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgAvailableExtensionsRecord;

import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgAvailableExtensions extends TableImpl<PgAvailableExtensionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_available_extensions</code>
     */
    public static final PgAvailableExtensions PG_AVAILABLE_EXTENSIONS = new PgAvailableExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAvailableExtensionsRecord> getRecordType() {
        return PgAvailableExtensionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> DEFAULT_VERSION = createField(DSL.name("default_version"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public final TableField<PgAvailableExtensionsRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CLOB, this, "");

    private PgAvailableExtensions(Name alias, Table<PgAvailableExtensionsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgAvailableExtensions(Name alias, Table<PgAvailableExtensionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extensions</code> table
     * reference
     */
    public PgAvailableExtensions(String alias) {
        this(DSL.name(alias), PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extensions</code> table
     * reference
     */
    public PgAvailableExtensions(Name alias) {
        this(alias, PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_available_extensions</code> table reference
     */
    public PgAvailableExtensions() {
        this(DSL.name("pg_available_extensions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgAvailableExtensions as(String alias) {
        return new PgAvailableExtensions(DSL.name(alias), this, parameters);
    }

    @Override
    public PgAvailableExtensions as(Name alias) {
        return new PgAvailableExtensions(alias, this, parameters);
    }

    @Override
    public PgAvailableExtensions as(Table<?> alias) {
        return new PgAvailableExtensions(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensions rename(String name) {
        return new PgAvailableExtensions(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensions rename(Name name) {
        return new PgAvailableExtensions(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensions rename(Table<?> name) {
        return new PgAvailableExtensions(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgAvailableExtensions call() {
        PgAvailableExtensions result = new PgAvailableExtensions(DSL.name("pg_available_extensions"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
