/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.TsTokenType;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TsTokenTypeRecord extends TableRecordImpl<TsTokenTypeRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public void setAlias(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.alias</code>.
     */
    public String getAlias() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_token_type.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TsTokenType.TS_TOKEN_TYPE.TOKID;
    }

    @Override
    public Field<String> field2() {
        return TsTokenType.TS_TOKEN_TYPE.ALIAS;
    }

    @Override
    public Field<String> field3() {
        return TsTokenType.TS_TOKEN_TYPE.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getTokid();
    }

    @Override
    public String component2() {
        return getAlias();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getTokid();
    }

    @Override
    public String value2() {
        return getAlias();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public TsTokenTypeRecord value1(Integer value) {
        setTokid(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value2(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TsTokenTypeRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TsTokenTypeRecord
     */
    public TsTokenTypeRecord() {
        super(TsTokenType.TS_TOKEN_TYPE);
    }

    /**
     * Create a detached, initialised TsTokenTypeRecord
     */
    public TsTokenTypeRecord(Integer tokid, String alias, String description) {
        super(TsTokenType.TS_TOKEN_TYPE);

        setTokid(tokid);
        setAlias(alias);
        setDescription(description);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TsTokenTypeRecord
     */
    public TsTokenTypeRecord(model.pg_catalog.tables.pojos.TsTokenType value) {
        super(TsTokenType.TS_TOKEN_TYPE);

        if (value != null) {
            setTokid(value.getTokid());
            setAlias(value.getAlias());
            setDescription(value.getDescription());
            resetChangedOnNotNull();
        }
    }
}
