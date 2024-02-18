/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import model.information_schema.InformationSchema;
import model.information_schema.tables.records.ParametersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<ParametersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.parameters</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParametersRecord> getRecordType() {
        return ParametersRecord.class;
    }

    /**
     * The column <code>information_schema.parameters.specific_catalog</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.specific_schema</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.specific_name</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.ordinal_position</code>.
     */
    public final TableField<ParametersRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.parameter_mode</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_MODE = createField(DSL.name("parameter_mode"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.is_result</code>.
     */
    public final TableField<ParametersRecord, String> IS_RESULT = createField(DSL.name("is_result"), model.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.as_locator</code>.
     */
    public final TableField<ParametersRecord, String> AS_LOCATOR = createField(DSL.name("as_locator"), model.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.parameter_name</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_NAME = createField(DSL.name("parameter_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.data_type</code>.
     */
    public final TableField<ParametersRecord, String> DATA_TYPE = createField(DSL.name("data_type"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.character_maximum_length</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.character_octet_length</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.character_set_catalog</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.character_set_schema</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.character_set_name</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.collation_catalog</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.collation_schema</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.collation_name</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.numeric_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.numeric_precision_radix</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.numeric_scale</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.datetime_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.interval_type</code>.
     */
    public final TableField<ParametersRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.interval_precision</code>.
     */
    public final TableField<ParametersRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.udt_catalog</code>.
     */
    public final TableField<ParametersRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.udt_schema</code>.
     */
    public final TableField<ParametersRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.udt_name</code>.
     */
    public final TableField<ParametersRecord, String> UDT_NAME = createField(DSL.name("udt_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.scope_catalog</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.scope_schema</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.scope_name</code>.
     */
    public final TableField<ParametersRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.parameters.maximum_cardinality</code>.
     */
    public final TableField<ParametersRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), model.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.dtd_identifier</code>.
     */
    public final TableField<ParametersRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.parameters.parameter_default</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_DEFAULT = createField(DSL.name("parameter_default"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private Parameters(Name alias, Table<ParametersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.parameters</code> table
     * reference
     */
    public Parameters(String alias) {
        this(DSL.name(alias), PARAMETERS);
    }

    /**
     * Create an aliased <code>information_schema.parameters</code> table
     * reference
     */
    public Parameters(Name alias) {
        this(alias, PARAMETERS);
    }

    /**
     * Create a <code>information_schema.parameters</code> table reference
     */
    public Parameters() {
        this(DSL.name("parameters"), null);
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, ParametersRecord> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Parameters as(String alias) {
        return new Parameters(DSL.name(alias), this);
    }

    @Override
    public Parameters as(Name alias) {
        return new Parameters(alias, this);
    }

    @Override
    public Parameters as(Table<?> alias) {
        return new Parameters(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(String name) {
        return new Parameters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Name name) {
        return new Parameters(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Table<?> name) {
        return new Parameters(name.getQualifiedName(), null);
    }
}
