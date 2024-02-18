/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.JsonbObjectKeys;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbObjectKeysRecord extends TableRecordImpl<JsonbObjectKeysRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_object_keys.jsonb_object_keys</code>.
     */
    public void setJsonbObjectKeys(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_object_keys.jsonb_object_keys</code>.
     */
    public String getJsonbObjectKeys() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JsonbObjectKeys.JSONB_OBJECT_KEYS.JSONB_OBJECT_KEYS_;
    }

    @Override
    public String component1() {
        return getJsonbObjectKeys();
    }

    @Override
    public String value1() {
        return getJsonbObjectKeys();
    }

    @Override
    public JsonbObjectKeysRecord value1(String value) {
        setJsonbObjectKeys(value);
        return this;
    }

    @Override
    public JsonbObjectKeysRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbObjectKeysRecord
     */
    public JsonbObjectKeysRecord() {
        super(JsonbObjectKeys.JSONB_OBJECT_KEYS);
    }

    /**
     * Create a detached, initialised JsonbObjectKeysRecord
     */
    public JsonbObjectKeysRecord(String jsonbObjectKeys) {
        super(JsonbObjectKeys.JSONB_OBJECT_KEYS);

        setJsonbObjectKeys(jsonbObjectKeys);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised JsonbObjectKeysRecord
     */
    public JsonbObjectKeysRecord(model.pg_catalog.tables.pojos.JsonbObjectKeys value) {
        super(JsonbObjectKeys.JSONB_OBJECT_KEYS);

        if (value != null) {
            setJsonbObjectKeys(value.getJsonbObjectKeys());
            resetChangedOnNotNull();
        }
    }
}
