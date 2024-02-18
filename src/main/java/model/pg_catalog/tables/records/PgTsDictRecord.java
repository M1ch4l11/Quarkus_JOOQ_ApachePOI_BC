/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgTsDict;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsDictRecord extends UpdatableRecordImpl<PgTsDictRecord> implements Record6<Long, String, Long, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictname</code>.
     */
    public void setDictname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictname</code>.
     */
    public String getDictname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictnamespace</code>.
     */
    public void setDictnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictnamespace</code>.
     */
    public Long getDictnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictowner</code>.
     */
    public void setDictowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictowner</code>.
     */
    public Long getDictowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dicttemplate</code>.
     */
    public void setDicttemplate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dicttemplate</code>.
     */
    public Long getDicttemplate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictinitoption</code>.
     */
    public void setDictinitoption(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictinitoption</code>.
     */
    public String getDictinitoption() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, Long, Long, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, Long, Long, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTsDict.PG_TS_DICT.OID;
    }

    @Override
    public Field<String> field2() {
        return PgTsDict.PG_TS_DICT.DICTNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgTsDict.PG_TS_DICT.DICTNAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgTsDict.PG_TS_DICT.DICTOWNER;
    }

    @Override
    public Field<Long> field5() {
        return PgTsDict.PG_TS_DICT.DICTTEMPLATE;
    }

    @Override
    public Field<String> field6() {
        return PgTsDict.PG_TS_DICT.DICTINITOPTION;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getDictname();
    }

    @Override
    public Long component3() {
        return getDictnamespace();
    }

    @Override
    public Long component4() {
        return getDictowner();
    }

    @Override
    public Long component5() {
        return getDicttemplate();
    }

    @Override
    public String component6() {
        return getDictinitoption();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getDictname();
    }

    @Override
    public Long value3() {
        return getDictnamespace();
    }

    @Override
    public Long value4() {
        return getDictowner();
    }

    @Override
    public Long value5() {
        return getDicttemplate();
    }

    @Override
    public String value6() {
        return getDictinitoption();
    }

    @Override
    public PgTsDictRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgTsDictRecord value2(String value) {
        setDictname(value);
        return this;
    }

    @Override
    public PgTsDictRecord value3(Long value) {
        setDictnamespace(value);
        return this;
    }

    @Override
    public PgTsDictRecord value4(Long value) {
        setDictowner(value);
        return this;
    }

    @Override
    public PgTsDictRecord value5(Long value) {
        setDicttemplate(value);
        return this;
    }

    @Override
    public PgTsDictRecord value6(String value) {
        setDictinitoption(value);
        return this;
    }

    @Override
    public PgTsDictRecord values(Long value1, String value2, Long value3, Long value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTsDictRecord
     */
    public PgTsDictRecord() {
        super(PgTsDict.PG_TS_DICT);
    }

    /**
     * Create a detached, initialised PgTsDictRecord
     */
    public PgTsDictRecord(Long oid, String dictname, Long dictnamespace, Long dictowner, Long dicttemplate, String dictinitoption) {
        super(PgTsDict.PG_TS_DICT);

        setOid(oid);
        setDictname(dictname);
        setDictnamespace(dictnamespace);
        setDictowner(dictowner);
        setDicttemplate(dicttemplate);
        setDictinitoption(dictinitoption);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgTsDictRecord
     */
    public PgTsDictRecord(model.pg_catalog.tables.pojos.PgTsDict value) {
        super(PgTsDict.PG_TS_DICT);

        if (value != null) {
            setOid(value.getOid());
            setDictname(value.getDictname());
            setDictnamespace(value.getDictnamespace());
            setDictowner(value.getDictowner());
            setDicttemplate(value.getDicttemplate());
            setDictinitoption(value.getDictinitoption());
            resetChangedOnNotNull();
        }
    }
}
