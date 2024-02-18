/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import java.util.function.Function;

import model.information_schema.InformationSchema;
import model.information_schema.tables.records.RoutineSequenceUsageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineSequenceUsage extends TableImpl<RoutineSequenceUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_sequence_usage</code>
     */
    public static final RoutineSequenceUsage ROUTINE_SEQUENCE_USAGE = new RoutineSequenceUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineSequenceUsageRecord> getRecordType() {
        return RoutineSequenceUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_CATALOG = createField(DSL.name("sequence_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("sequence_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_NAME = createField(DSL.name("sequence_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.routine_sequence_usage</code>
     * table reference
     */
    public RoutineSequenceUsage(String alias) {
        this(DSL.name(alias), ROUTINE_SEQUENCE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_sequence_usage</code>
     * table reference
     */
    public RoutineSequenceUsage(Name alias) {
        this(alias, ROUTINE_SEQUENCE_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_sequence_usage</code> table
     * reference
     */
    public RoutineSequenceUsage() {
        this(DSL.name("routine_sequence_usage"), null);
    }

    public <O extends Record> RoutineSequenceUsage(Table<O> child, ForeignKey<O, RoutineSequenceUsageRecord> key) {
        super(child, key, ROUTINE_SEQUENCE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineSequenceUsage as(String alias) {
        return new RoutineSequenceUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineSequenceUsage as(Name alias) {
        return new RoutineSequenceUsage(alias, this);
    }

    @Override
    public RoutineSequenceUsage as(Table<?> alias) {
        return new RoutineSequenceUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(String name) {
        return new RoutineSequenceUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(Name name) {
        return new RoutineSequenceUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(Table<?> name) {
        return new RoutineSequenceUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}