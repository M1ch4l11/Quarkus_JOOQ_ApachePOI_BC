/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.function.Function;

import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.JsonbToRecordsetRecord;

import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row1;
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
public class JsonbToRecordset extends TableImpl<JsonbToRecordsetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.jsonb_to_recordset</code>
     */
    public static final JsonbToRecordset JSONB_TO_RECORDSET = new JsonbToRecordset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbToRecordsetRecord> getRecordType() {
        return JsonbToRecordsetRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public final TableField<JsonbToRecordsetRecord, Record> JSONB_TO_RECORDSET_ = createField(DSL.name("jsonb_to_recordset"), SQLDataType.RECORD, this, "");

    private JsonbToRecordset(Name alias, Table<JsonbToRecordsetRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbToRecordset(Name alias, Table<JsonbToRecordsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table
     * reference
     */
    public JsonbToRecordset(String alias) {
        this(DSL.name(alias), JSONB_TO_RECORDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_to_recordset</code> table
     * reference
     */
    public JsonbToRecordset(Name alias) {
        this(alias, JSONB_TO_RECORDSET);
    }

    /**
     * Create a <code>pg_catalog.jsonb_to_recordset</code> table reference
     */
    public JsonbToRecordset() {
        this(DSL.name("jsonb_to_recordset"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbToRecordset as(String alias) {
        return new JsonbToRecordset(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbToRecordset as(Name alias) {
        return new JsonbToRecordset(alias, this, parameters);
    }

    @Override
    public JsonbToRecordset as(Table<?> alias) {
        return new JsonbToRecordset(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbToRecordset rename(String name) {
        return new JsonbToRecordset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbToRecordset rename(Name name) {
        return new JsonbToRecordset(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbToRecordset rename(Table<?> name) {
        return new JsonbToRecordset(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonbToRecordset call(
          JSONB __1
    ) {
        JsonbToRecordset result = new JsonbToRecordset(DSL.name("jsonb_to_recordset"), null, new Field[] {
            DSL.val(__1, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonbToRecordset call(
          Field<JSONB> __1
    ) {
        JsonbToRecordset result = new JsonbToRecordset(DSL.name("jsonb_to_recordset"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Record, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Record, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}