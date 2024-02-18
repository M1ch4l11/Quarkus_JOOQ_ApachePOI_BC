/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.records;


import model.information_schema.tables.RoutineSequenceUsage;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineSequenceUsageRecord extends TableRecordImpl<RoutineSequenceUsageRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.sequence_catalog</code>.
     */
    public void setSequenceCatalog(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.sequence_catalog</code>.
     */
    public String getSequenceCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.sequence_schema</code>.
     */
    public void setSequenceSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.sequence_schema</code>.
     */
    public String getSequenceSchema() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.routine_sequence_usage.sequence_name</code>.
     */
    public void setSequenceName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_sequence_usage.sequence_name</code>.
     */
    public String getSequenceName() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field4() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.ROUTINE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.ROUTINE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.ROUTINE_NAME;
    }

    @Override
    public Field<String> field7() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SEQUENCE_CATALOG;
    }

    @Override
    public Field<String> field8() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SEQUENCE_SCHEMA;
    }

    @Override
    public Field<String> field9() {
        return RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE.SEQUENCE_NAME;
    }

    @Override
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    public String component3() {
        return getSpecificName();
    }

    @Override
    public String component4() {
        return getRoutineCatalog();
    }

    @Override
    public String component5() {
        return getRoutineSchema();
    }

    @Override
    public String component6() {
        return getRoutineName();
    }

    @Override
    public String component7() {
        return getSequenceCatalog();
    }

    @Override
    public String component8() {
        return getSequenceSchema();
    }

    @Override
    public String component9() {
        return getSequenceName();
    }

    @Override
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    public String value3() {
        return getSpecificName();
    }

    @Override
    public String value4() {
        return getRoutineCatalog();
    }

    @Override
    public String value5() {
        return getRoutineSchema();
    }

    @Override
    public String value6() {
        return getRoutineName();
    }

    @Override
    public String value7() {
        return getSequenceCatalog();
    }

    @Override
    public String value8() {
        return getSequenceSchema();
    }

    @Override
    public String value9() {
        return getSequenceName();
    }

    @Override
    public RoutineSequenceUsageRecord value1(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value2(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value3(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value4(String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value5(String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value6(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value7(String value) {
        setSequenceCatalog(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value8(String value) {
        setSequenceSchema(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord value9(String value) {
        setSequenceName(value);
        return this;
    }

    @Override
    public RoutineSequenceUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
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
     * Create a detached RoutineSequenceUsageRecord
     */
    public RoutineSequenceUsageRecord() {
        super(RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE);
    }

    /**
     * Create a detached, initialised RoutineSequenceUsageRecord
     */
    public RoutineSequenceUsageRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String sequenceCatalog, String sequenceSchema, String sequenceName) {
        super(RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setSequenceCatalog(sequenceCatalog);
        setSequenceSchema(sequenceSchema);
        setSequenceName(sequenceName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoutineSequenceUsageRecord
     */
    public RoutineSequenceUsageRecord(model.information_schema.tables.pojos.RoutineSequenceUsage value) {
        super(RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE);

        if (value != null) {
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setRoutineCatalog(value.getRoutineCatalog());
            setRoutineSchema(value.getRoutineSchema());
            setRoutineName(value.getRoutineName());
            setSequenceCatalog(value.getSequenceCatalog());
            setSequenceSchema(value.getSequenceSchema());
            setSequenceName(value.getSequenceName());
            resetChangedOnNotNull();
        }
    }
}
