/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import java.util.function.Function;

import model.information_schema.InformationSchema;
import model.information_schema.tables.records.RoutineRoutineUsageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class RoutineRoutineUsage extends TableImpl<RoutineRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_routine_usage</code>
     */
    public static final RoutineRoutineUsage ROUTINE_ROUTINE_USAGE = new RoutineRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineRoutineUsageRecord> getRecordType() {
        return RoutineRoutineUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineRoutineUsage(Name alias, Table<RoutineRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineRoutineUsage(Name alias, Table<RoutineRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    public RoutineRoutineUsage(String alias) {
        this(DSL.name(alias), ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    public RoutineRoutineUsage(Name alias) {
        this(alias, ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_routine_usage</code> table
     * reference
     */
    public RoutineRoutineUsage() {
        this(DSL.name("routine_routine_usage"), null);
    }

    public <O extends Record> RoutineRoutineUsage(Table<O> child, ForeignKey<O, RoutineRoutineUsageRecord> key) {
        super(child, key, ROUTINE_ROUTINE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineRoutineUsage as(String alias) {
        return new RoutineRoutineUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineRoutineUsage as(Name alias) {
        return new RoutineRoutineUsage(alias, this);
    }

    @Override
    public RoutineRoutineUsage as(Table<?> alias) {
        return new RoutineRoutineUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineRoutineUsage rename(String name) {
        return new RoutineRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineRoutineUsage rename(Name name) {
        return new RoutineRoutineUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineRoutineUsage rename(Table<?> name) {
        return new RoutineRoutineUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}