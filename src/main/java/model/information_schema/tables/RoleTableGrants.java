/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import java.util.function.Function;

import model.information_schema.InformationSchema;
import model.information_schema.tables.records.RoleTableGrantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
public class RoleTableGrants extends TableImpl<RoleTableGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_table_grants</code>
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = new RoleTableGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleTableGrantsRecord> getRecordType() {
        return RoleTableGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_table_grants.grantor</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_table_grants.grantee</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_table_grants.table_catalog</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_table_grants.table_schema</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_table_grants.table_name</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_table_grants.privilege_type</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_table_grants.is_grantable</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), model.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> WITH_HIERARCHY = createField(DSL.name("with_hierarchy"), model.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.role_table_grants</code> table
     * reference
     */
    public RoleTableGrants(String alias) {
        this(DSL.name(alias), ROLE_TABLE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_table_grants</code> table
     * reference
     */
    public RoleTableGrants(Name alias) {
        this(alias, ROLE_TABLE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_table_grants</code> table
     * reference
     */
    public RoleTableGrants() {
        this(DSL.name("role_table_grants"), null);
    }

    public <O extends Record> RoleTableGrants(Table<O> child, ForeignKey<O, RoleTableGrantsRecord> key) {
        super(child, key, ROLE_TABLE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleTableGrants as(String alias) {
        return new RoleTableGrants(DSL.name(alias), this);
    }

    @Override
    public RoleTableGrants as(Name alias) {
        return new RoleTableGrants(alias, this);
    }

    @Override
    public RoleTableGrants as(Table<?> alias) {
        return new RoleTableGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(String name) {
        return new RoleTableGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(Name name) {
        return new RoleTableGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(Table<?> name) {
        return new RoleTableGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
