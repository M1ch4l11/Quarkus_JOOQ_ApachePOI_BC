/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import model.pg_catalog.Keys;
import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgNamespaceRecord;

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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgNamespace extends TableImpl<PgNamespaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_namespace</code>
     */
    public static final PgNamespace PG_NAMESPACE = new PgNamespace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgNamespaceRecord> getRecordType() {
        return PgNamespaceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_namespace.oid</code>.
     */
    public final TableField<PgNamespaceRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public final TableField<PgNamespaceRecord, String> NSPNAME = createField(DSL.name("nspname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public final TableField<PgNamespaceRecord, Long> NSPOWNER = createField(DSL.name("nspowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public final TableField<PgNamespaceRecord, String[]> NSPACL = createField(DSL.name("nspacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgNamespace(Name alias, Table<PgNamespaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgNamespace(Name alias, Table<PgNamespaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace(String alias) {
        this(DSL.name(alias), PG_NAMESPACE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace(Name alias) {
        this(alias, PG_NAMESPACE);
    }

    /**
     * Create a <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace() {
        this(DSL.name("pg_namespace"), null);
    }

    public <O extends Record> PgNamespace(Table<O> child, ForeignKey<O, PgNamespaceRecord> key) {
        super(child, key, PG_NAMESPACE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgNamespaceRecord> getPrimaryKey() {
        return Keys.PG_NAMESPACE_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgNamespaceRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_NAMESPACE_NSPNAME_INDEX);
    }

    @Override
    public PgNamespace as(String alias) {
        return new PgNamespace(DSL.name(alias), this);
    }

    @Override
    public PgNamespace as(Name alias) {
        return new PgNamespace(alias, this);
    }

    @Override
    public PgNamespace as(Table<?> alias) {
        return new PgNamespace(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgNamespace rename(String name) {
        return new PgNamespace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgNamespace rename(Name name) {
        return new PgNamespace(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgNamespace rename(Table<?> name) {
        return new PgNamespace(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Long, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super String, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
