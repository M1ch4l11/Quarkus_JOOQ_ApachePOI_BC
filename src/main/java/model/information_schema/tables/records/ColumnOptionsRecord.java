/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.records;


import model.information_schema.tables.ColumnOptions;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnOptionsRecord extends TableRecordImpl<ColumnOptionsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.column_options.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_options.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_options.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.column_options.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.column_options.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return ColumnOptions.COLUMN_OPTIONS.COLUMN_NAME;
    }

    @Override
    public Field<String> field5() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_NAME;
    }

    @Override
    public Field<String> field6() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_VALUE;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getColumnName();
    }

    @Override
    public String component5() {
        return getOptionName();
    }

    @Override
    public String component6() {
        return getOptionValue();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getColumnName();
    }

    @Override
    public String value5() {
        return getOptionName();
    }

    @Override
    public String value6() {
        return getOptionValue();
    }

    @Override
    public ColumnOptionsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord value5(String value) {
        setOptionName(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord value6(String value) {
        setOptionValue(value);
        return this;
    }

    @Override
    public ColumnOptionsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnOptionsRecord
     */
    public ColumnOptionsRecord() {
        super(ColumnOptions.COLUMN_OPTIONS);
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    public ColumnOptionsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, String optionName, String optionValue) {
        super(ColumnOptions.COLUMN_OPTIONS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    public ColumnOptionsRecord(model.information_schema.tables.pojos.ColumnOptions value) {
        super(ColumnOptions.COLUMN_OPTIONS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setOptionName(value.getOptionName());
            setOptionValue(value.getOptionValue());
            resetChangedOnNotNull();
        }
    }
}
