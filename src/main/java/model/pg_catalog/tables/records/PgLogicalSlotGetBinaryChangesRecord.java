/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgLogicalSlotGetBinaryChanges;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLogicalSlotGetBinaryChangesRecord extends TableRecordImpl<PgLogicalSlotGetBinaryChangesRecord> implements Record3<Object, Long, byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setLsn(Object value) {
        set(0, value);
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
    public Object getLsn() {
        return get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.xid</code>.
     */
    public void setXid(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.xid</code>.
     */
    public Long getXid() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.data</code>.
     */
    public void setData(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_get_binary_changes.data</code>.
     */
    public byte[] getData() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Long, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Object, Long, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
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
    public Field<Object> field1() {
        return PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES.LSN;
    }

    @Override
    public Field<Long> field2() {
        return PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES.XID;
    }

    @Override
    public Field<byte[]> field3() {
        return PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES.DATA;
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
    public Object component1() {
        return getLsn();
    }

    @Override
    public Long component2() {
        return getXid();
    }

    @Override
    public byte[] component3() {
        return getData();
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
    public Object value1() {
        return getLsn();
    }

    @Override
    public Long value2() {
        return getXid();
    }

    @Override
    public byte[] value3() {
        return getData();
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
    public PgLogicalSlotGetBinaryChangesRecord value1(Object value) {
        setLsn(value);
        return this;
    }

    @Override
    public PgLogicalSlotGetBinaryChangesRecord value2(Long value) {
        setXid(value);
        return this;
    }

    @Override
    public PgLogicalSlotGetBinaryChangesRecord value3(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public PgLogicalSlotGetBinaryChangesRecord values(Object value1, Long value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLogicalSlotGetBinaryChangesRecord
     */
    public PgLogicalSlotGetBinaryChangesRecord() {
        super(PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES);
    }

    /**
     * Create a detached, initialised PgLogicalSlotGetBinaryChangesRecord
     */
    public PgLogicalSlotGetBinaryChangesRecord(Object lsn, Long xid, byte[] data) {
        super(PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES);

        setLsn(lsn);
        setXid(xid);
        setData(data);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgLogicalSlotGetBinaryChangesRecord
     */
    public PgLogicalSlotGetBinaryChangesRecord(model.pg_catalog.tables.pojos.PgLogicalSlotGetBinaryChanges value) {
        super(PgLogicalSlotGetBinaryChanges.PG_LOGICAL_SLOT_GET_BINARY_CHANGES);

        if (value != null) {
            setLsn(value.getLsn());
            setXid(value.getXid());
            setData(value.getData());
            resetChangedOnNotNull();
        }
    }
}
