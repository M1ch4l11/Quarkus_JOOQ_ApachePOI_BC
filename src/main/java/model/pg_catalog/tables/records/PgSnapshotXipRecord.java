/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgSnapshotXip;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSnapshotXipRecord extends TableRecordImpl<PgSnapshotXipRecord> implements Record1<Object> {

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
    public void setPgSnapshotXip(Object value) {
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
    public Object getPgSnapshotXip() {
        return get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Object> valuesRow() {
        return (Row1) super.valuesRow();
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
        return PgSnapshotXip.PG_SNAPSHOT_XIP.PG_SNAPSHOT_XIP_;
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
        return getPgSnapshotXip();
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
        return getPgSnapshotXip();
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
    public PgSnapshotXipRecord value1(Object value) {
        setPgSnapshotXip(value);
        return this;
    }

    @Override
    public PgSnapshotXipRecord values(Object value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSnapshotXipRecord
     */
    public PgSnapshotXipRecord() {
        super(PgSnapshotXip.PG_SNAPSHOT_XIP);
    }

    /**
     * Create a detached, initialised PgSnapshotXipRecord
     */
    public PgSnapshotXipRecord(Object pgSnapshotXip) {
        super(PgSnapshotXip.PG_SNAPSHOT_XIP);

        setPgSnapshotXip(pgSnapshotXip);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgSnapshotXipRecord
     */
    public PgSnapshotXipRecord(model.pg_catalog.tables.pojos.PgSnapshotXip value) {
        super(PgSnapshotXip.PG_SNAPSHOT_XIP);

        if (value != null) {
            setPgSnapshotXip(value.getPgSnapshotXip());
            resetChangedOnNotNull();
        }
    }
}
