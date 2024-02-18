/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.TxidSnapshotXip;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TxidSnapshotXipRecord extends TableRecordImpl<TxidSnapshotXipRecord> implements Record1<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public void setTxidSnapshotXip(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public Long getTxidSnapshotXip() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TxidSnapshotXip.TXID_SNAPSHOT_XIP.TXID_SNAPSHOT_XIP_;
    }

    @Override
    public Long component1() {
        return getTxidSnapshotXip();
    }

    @Override
    public Long value1() {
        return getTxidSnapshotXip();
    }

    @Override
    public TxidSnapshotXipRecord value1(Long value) {
        setTxidSnapshotXip(value);
        return this;
    }

    @Override
    public TxidSnapshotXipRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord() {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);
    }

    /**
     * Create a detached, initialised TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord(Long txidSnapshotXip) {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);

        setTxidSnapshotXip(txidSnapshotXip);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord(model.pg_catalog.tables.pojos.TxidSnapshotXip value) {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);

        if (value != null) {
            setTxidSnapshotXip(value.getTxidSnapshotXip());
            resetChangedOnNotNull();
        }
    }
}
