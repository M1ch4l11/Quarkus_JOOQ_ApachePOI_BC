/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.JsonbEachText;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbEachTextRecord extends TableRecordImpl<JsonbEachTextRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_each_text.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_each_text.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.jsonb_each_text.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_each_text.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JsonbEachText.JSONB_EACH_TEXT.KEY;
    }

    @Override
    public Field<String> field2() {
        return JsonbEachText.JSONB_EACH_TEXT.VALUE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public JsonbEachTextRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public JsonbEachTextRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonbEachTextRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbEachTextRecord
     */
    public JsonbEachTextRecord() {
        super(JsonbEachText.JSONB_EACH_TEXT);
    }

    /**
     * Create a detached, initialised JsonbEachTextRecord
     */
    public JsonbEachTextRecord(String key, String value) {
        super(JsonbEachText.JSONB_EACH_TEXT);

        setKey(key);
        setValue(value);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised JsonbEachTextRecord
     */
    public JsonbEachTextRecord(model.pg_catalog.tables.pojos.JsonbEachText value) {
        super(JsonbEachText.JSONB_EACH_TEXT);

        if (value != null) {
            setKey(value.getKey());
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
