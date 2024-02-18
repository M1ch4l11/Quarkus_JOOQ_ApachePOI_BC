/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import java.util.function.Function;

import model.information_schema.InformationSchema;
import model.information_schema.tables.records.RoutineTableUsageRecord;

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
public class RoutineTableUsage extends TableImpl<RoutineTableUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_table_usage</code>
     */
    public static final RoutineTableUsage ROUTINE_TABLE_USAGE = new RoutineTableUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineTableUsageRecord> getRecordType() {
        return RoutineTableUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_catalog</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_schema</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_name</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_catalog</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_schema</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_name</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_catalog</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_schema</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_name</code>.
     */
    public final TableField<RoutineTableUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineTableUsage(Name alias, Table<RoutineTableUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineTableUsage(Name alias, Table<RoutineTableUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.routine_table_usage</code>
     * table reference
     */
    public RoutineTableUsage(String alias) {
        this(DSL.name(alias), ROUTINE_TABLE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_table_usage</code>
     * table reference
     */
    public RoutineTableUsage(Name alias) {
        this(alias, ROUTINE_TABLE_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_table_usage</code> table
     * reference
     */
    public RoutineTableUsage() {
        this(DSL.name("routine_table_usage"), null);
    }

    public <O extends Record> RoutineTableUsage(Table<O> child, ForeignKey<O, RoutineTableUsageRecord> key) {
        super(child, key, ROUTINE_TABLE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineTableUsage as(String alias) {
        return new RoutineTableUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineTableUsage as(Name alias) {
        return new RoutineTableUsage(alias, this);
    }

    @Override
    public RoutineTableUsage as(Table<?> alias) {
        return new RoutineTableUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineTableUsage rename(String name) {
        return new RoutineTableUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineTableUsage rename(Name name) {
        return new RoutineTableUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineTableUsage rename(Table<?> name) {
        return new RoutineTableUsage(name.getQualifiedName(), null);
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
