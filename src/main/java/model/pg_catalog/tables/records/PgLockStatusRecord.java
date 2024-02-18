/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import model.pg_catalog.tables.PgLockStatus;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLockStatusRecord extends TableRecordImpl<PgLockStatusRecord> implements Record16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public void setLocktype(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public String getLocktype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.database</code>.
     */
    public void setDatabase(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.database</code>.
     */
    public Long getDatabase() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public void setRelation(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public Long getRelation() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.page</code>.
     */
    public void setPage(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.page</code>.
     */
    public Integer getPage() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public void setTuple(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public Short getTuple() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public void setVirtualxid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public String getVirtualxid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public void setTransactionid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public Long getTransactionid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public void setClassid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public void setObjid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public void setObjsubid(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public Short getObjsubid() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public void setVirtualtransaction(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public String getVirtualtransaction() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public void setPid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public void setMode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public String getMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public void setGranted(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public Boolean getGranted() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public void setFastpath(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public Boolean getFastpath() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public void setWaitstart(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public OffsetDateTime getWaitstart() {
        return (OffsetDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgLockStatus.PG_LOCK_STATUS.LOCKTYPE;
    }

    @Override
    public Field<Long> field2() {
        return PgLockStatus.PG_LOCK_STATUS.DATABASE;
    }

    @Override
    public Field<Long> field3() {
        return PgLockStatus.PG_LOCK_STATUS.RELATION;
    }

    @Override
    public Field<Integer> field4() {
        return PgLockStatus.PG_LOCK_STATUS.PAGE;
    }

    @Override
    public Field<Short> field5() {
        return PgLockStatus.PG_LOCK_STATUS.TUPLE;
    }

    @Override
    public Field<String> field6() {
        return PgLockStatus.PG_LOCK_STATUS.VIRTUALXID;
    }

    @Override
    public Field<Long> field7() {
        return PgLockStatus.PG_LOCK_STATUS.TRANSACTIONID;
    }

    @Override
    public Field<Long> field8() {
        return PgLockStatus.PG_LOCK_STATUS.CLASSID;
    }

    @Override
    public Field<Long> field9() {
        return PgLockStatus.PG_LOCK_STATUS.OBJID;
    }

    @Override
    public Field<Short> field10() {
        return PgLockStatus.PG_LOCK_STATUS.OBJSUBID;
    }

    @Override
    public Field<String> field11() {
        return PgLockStatus.PG_LOCK_STATUS.VIRTUALTRANSACTION;
    }

    @Override
    public Field<Integer> field12() {
        return PgLockStatus.PG_LOCK_STATUS.PID;
    }

    @Override
    public Field<String> field13() {
        return PgLockStatus.PG_LOCK_STATUS.MODE;
    }

    @Override
    public Field<Boolean> field14() {
        return PgLockStatus.PG_LOCK_STATUS.GRANTED;
    }

    @Override
    public Field<Boolean> field15() {
        return PgLockStatus.PG_LOCK_STATUS.FASTPATH;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return PgLockStatus.PG_LOCK_STATUS.WAITSTART;
    }

    @Override
    public String component1() {
        return getLocktype();
    }

    @Override
    public Long component2() {
        return getDatabase();
    }

    @Override
    public Long component3() {
        return getRelation();
    }

    @Override
    public Integer component4() {
        return getPage();
    }

    @Override
    public Short component5() {
        return getTuple();
    }

    @Override
    public String component6() {
        return getVirtualxid();
    }

    @Override
    public Long component7() {
        return getTransactionid();
    }

    @Override
    public Long component8() {
        return getClassid();
    }

    @Override
    public Long component9() {
        return getObjid();
    }

    @Override
    public Short component10() {
        return getObjsubid();
    }

    @Override
    public String component11() {
        return getVirtualtransaction();
    }

    @Override
    public Integer component12() {
        return getPid();
    }

    @Override
    public String component13() {
        return getMode();
    }

    @Override
    public Boolean component14() {
        return getGranted();
    }

    @Override
    public Boolean component15() {
        return getFastpath();
    }

    @Override
    public OffsetDateTime component16() {
        return getWaitstart();
    }

    @Override
    public String value1() {
        return getLocktype();
    }

    @Override
    public Long value2() {
        return getDatabase();
    }

    @Override
    public Long value3() {
        return getRelation();
    }

    @Override
    public Integer value4() {
        return getPage();
    }

    @Override
    public Short value5() {
        return getTuple();
    }

    @Override
    public String value6() {
        return getVirtualxid();
    }

    @Override
    public Long value7() {
        return getTransactionid();
    }

    @Override
    public Long value8() {
        return getClassid();
    }

    @Override
    public Long value9() {
        return getObjid();
    }

    @Override
    public Short value10() {
        return getObjsubid();
    }

    @Override
    public String value11() {
        return getVirtualtransaction();
    }

    @Override
    public Integer value12() {
        return getPid();
    }

    @Override
    public String value13() {
        return getMode();
    }

    @Override
    public Boolean value14() {
        return getGranted();
    }

    @Override
    public Boolean value15() {
        return getFastpath();
    }

    @Override
    public OffsetDateTime value16() {
        return getWaitstart();
    }

    @Override
    public PgLockStatusRecord value1(String value) {
        setLocktype(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value2(Long value) {
        setDatabase(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value3(Long value) {
        setRelation(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value4(Integer value) {
        setPage(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value5(Short value) {
        setTuple(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value6(String value) {
        setVirtualxid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value7(Long value) {
        setTransactionid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value8(Long value) {
        setClassid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value9(Long value) {
        setObjid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value10(Short value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value11(String value) {
        setVirtualtransaction(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value12(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value13(String value) {
        setMode(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value14(Boolean value) {
        setGranted(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value15(Boolean value) {
        setFastpath(value);
        return this;
    }

    @Override
    public PgLockStatusRecord value16(OffsetDateTime value) {
        setWaitstart(value);
        return this;
    }

    @Override
    public PgLockStatusRecord values(String value1, Long value2, Long value3, Integer value4, Short value5, String value6, Long value7, Long value8, Long value9, Short value10, String value11, Integer value12, String value13, Boolean value14, Boolean value15, OffsetDateTime value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLockStatusRecord
     */
    public PgLockStatusRecord() {
        super(PgLockStatus.PG_LOCK_STATUS);
    }

    /**
     * Create a detached, initialised PgLockStatusRecord
     */
    public PgLockStatusRecord(String locktype, Long database, Long relation, Integer page, Short tuple, String virtualxid, Long transactionid, Long classid, Long objid, Short objsubid, String virtualtransaction, Integer pid, String mode, Boolean granted, Boolean fastpath, OffsetDateTime waitstart) {
        super(PgLockStatus.PG_LOCK_STATUS);

        setLocktype(locktype);
        setDatabase(database);
        setRelation(relation);
        setPage(page);
        setTuple(tuple);
        setVirtualxid(virtualxid);
        setTransactionid(transactionid);
        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setVirtualtransaction(virtualtransaction);
        setPid(pid);
        setMode(mode);
        setGranted(granted);
        setFastpath(fastpath);
        setWaitstart(waitstart);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgLockStatusRecord
     */
    public PgLockStatusRecord(model.pg_catalog.tables.pojos.PgLockStatus value) {
        super(PgLockStatus.PG_LOCK_STATUS);

        if (value != null) {
            setLocktype(value.getLocktype());
            setDatabase(value.getDatabase());
            setRelation(value.getRelation());
            setPage(value.getPage());
            setTuple(value.getTuple());
            setVirtualxid(value.getVirtualxid());
            setTransactionid(value.getTransactionid());
            setClassid(value.getClassid());
            setObjid(value.getObjid());
            setObjsubid(value.getObjsubid());
            setVirtualtransaction(value.getVirtualtransaction());
            setPid(value.getPid());
            setMode(value.getMode());
            setGranted(value.getGranted());
            setFastpath(value.getFastpath());
            setWaitstart(value.getWaitstart());
            resetChangedOnNotNull();
        }
    }
}
