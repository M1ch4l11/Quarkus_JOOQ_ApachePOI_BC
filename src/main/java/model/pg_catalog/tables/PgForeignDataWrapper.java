/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import model.pg_catalog.Keys;
import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgForeignDataWrapperRecord;

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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignDataWrapper extends TableImpl<PgForeignDataWrapperRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_data_wrapper</code>
     */
    public static final PgForeignDataWrapper PG_FOREIGN_DATA_WRAPPER = new PgForeignDataWrapper();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignDataWrapperRecord> getRecordType() {
        return PgForeignDataWrapperRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String> FDWNAME = createField(DSL.name("fdwname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWOWNER = createField(DSL.name("fdwowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWHANDLER = createField(DSL.name("fdwhandler"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, Long> FDWVALIDATOR = createField(DSL.name("fdwvalidator"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String[]> FDWACL = createField(DSL.name("fdwacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public final TableField<PgForeignDataWrapperRecord, String[]> FDWOPTIONS = createField(DSL.name("fdwoptions"), SQLDataType.CLOB.array(), this, "");

    private PgForeignDataWrapper(Name alias, Table<PgForeignDataWrapperRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignDataWrapper(Name alias, Table<PgForeignDataWrapperRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table
     * reference
     */
    public PgForeignDataWrapper(String alias) {
        this(DSL.name(alias), PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_data_wrapper</code> table
     * reference
     */
    public PgForeignDataWrapper(Name alias) {
        this(alias, PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create a <code>pg_catalog.pg_foreign_data_wrapper</code> table reference
     */
    public PgForeignDataWrapper() {
        this(DSL.name("pg_foreign_data_wrapper"), null);
    }

    public <O extends Record> PgForeignDataWrapper(Table<O> child, ForeignKey<O, PgForeignDataWrapperRecord> key) {
        super(child, key, PG_FOREIGN_DATA_WRAPPER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgForeignDataWrapperRecord> getPrimaryKey() {
        return Keys.PG_FOREIGN_DATA_WRAPPER_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgForeignDataWrapperRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_FOREIGN_DATA_WRAPPER_NAME_INDEX);
    }

    @Override
    public PgForeignDataWrapper as(String alias) {
        return new PgForeignDataWrapper(DSL.name(alias), this);
    }

    @Override
    public PgForeignDataWrapper as(Name alias) {
        return new PgForeignDataWrapper(alias, this);
    }

    @Override
    public PgForeignDataWrapper as(Table<?> alias) {
        return new PgForeignDataWrapper(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignDataWrapper rename(String name) {
        return new PgForeignDataWrapper(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignDataWrapper rename(Name name) {
        return new PgForeignDataWrapper(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignDataWrapper rename(Table<?> name) {
        return new PgForeignDataWrapper(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Long, Long, Long, String[], String[]> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
