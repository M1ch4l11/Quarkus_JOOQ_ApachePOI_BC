/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import model.pg_catalog.tables.PgStatSubscription;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSubscriptionRecord extends TableRecordImpl<PgStatSubscriptionRecord> implements Record9<Long, String, Integer, Long, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    public void setSubid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    public Long getSubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    public void setSubname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    public String getSubname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setReceivedLsn(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getReceivedLsn() {
        return get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    public void setLastMsgSendTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    public void setLastMsgReceiptTime(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(6);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setLatestEndLsn(Object value) {
        set(7, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getLatestEndLsn() {
        return get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    public void setLatestEndTime(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Integer, Long, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, Integer, Long, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.SUBID;
    }

    @Override
    public Field<String> field2() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.SUBNAME;
    }

    @Override
    public Field<Integer> field3() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.PID;
    }

    @Override
    public Field<Long> field4() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.RELID;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field5() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.RECEIVED_LSN;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.LAST_MSG_SEND_TIME;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.LAST_MSG_RECEIPT_TIME;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field8() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.LATEST_END_LSN;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return PgStatSubscription.PG_STAT_SUBSCRIPTION.LATEST_END_TIME;
    }

    @Override
    public Long component1() {
        return getSubid();
    }

    @Override
    public String component2() {
        return getSubname();
    }

    @Override
    public Integer component3() {
        return getPid();
    }

    @Override
    public Long component4() {
        return getRelid();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component5() {
        return getReceivedLsn();
    }

    @Override
    public OffsetDateTime component6() {
        return getLastMsgSendTime();
    }

    @Override
    public OffsetDateTime component7() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component8() {
        return getLatestEndLsn();
    }

    @Override
    public OffsetDateTime component9() {
        return getLatestEndTime();
    }

    @Override
    public Long value1() {
        return getSubid();
    }

    @Override
    public String value2() {
        return getSubname();
    }

    @Override
    public Integer value3() {
        return getPid();
    }

    @Override
    public Long value4() {
        return getRelid();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value5() {
        return getReceivedLsn();
    }

    @Override
    public OffsetDateTime value6() {
        return getLastMsgSendTime();
    }

    @Override
    public OffsetDateTime value7() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value8() {
        return getLatestEndLsn();
    }

    @Override
    public OffsetDateTime value9() {
        return getLatestEndTime();
    }

    @Override
    public PgStatSubscriptionRecord value1(Long value) {
        setSubid(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value2(String value) {
        setSubname(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value3(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgStatSubscriptionRecord value5(Object value) {
        setReceivedLsn(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value6(OffsetDateTime value) {
        setLastMsgSendTime(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value7(OffsetDateTime value) {
        setLastMsgReceiptTime(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgStatSubscriptionRecord value8(Object value) {
        setLatestEndLsn(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord value9(OffsetDateTime value) {
        setLatestEndTime(value);
        return this;
    }

    @Override
    public PgStatSubscriptionRecord values(Long value1, String value2, Integer value3, Long value4, Object value5, OffsetDateTime value6, OffsetDateTime value7, Object value8, OffsetDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSubscriptionRecord
     */
    public PgStatSubscriptionRecord() {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised PgStatSubscriptionRecord
     */
    public PgStatSubscriptionRecord(Long subid, String subname, Integer pid, Long relid, Object receivedLsn, OffsetDateTime lastMsgSendTime, OffsetDateTime lastMsgReceiptTime, Object latestEndLsn, OffsetDateTime latestEndTime) {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);

        setSubid(subid);
        setSubname(subname);
        setPid(pid);
        setRelid(relid);
        setReceivedLsn(receivedLsn);
        setLastMsgSendTime(lastMsgSendTime);
        setLastMsgReceiptTime(lastMsgReceiptTime);
        setLatestEndLsn(latestEndLsn);
        setLatestEndTime(latestEndTime);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatSubscriptionRecord
     */
    public PgStatSubscriptionRecord(model.pg_catalog.tables.pojos.PgStatSubscription value) {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);

        if (value != null) {
            setSubid(value.getSubid());
            setSubname(value.getSubname());
            setPid(value.getPid());
            setRelid(value.getRelid());
            setReceivedLsn(value.getReceivedLsn());
            setLastMsgSendTime(value.getLastMsgSendTime());
            setLastMsgReceiptTime(value.getLastMsgReceiptTime());
            setLatestEndLsn(value.getLatestEndLsn());
            setLatestEndTime(value.getLatestEndTime());
            resetChangedOnNotNull();
        }
    }
}