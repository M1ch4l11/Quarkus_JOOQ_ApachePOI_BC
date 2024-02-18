/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables;


import java.util.function.Function;

import model.information_schema.InformationSchema;
import model.information_schema.tables.records.UdtPrivilegesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class UdtPrivileges extends TableImpl<UdtPrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.udt_privileges</code>
     */
    public static final UdtPrivileges UDT_PRIVILEGES = new UdtPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UdtPrivilegesRecord> getRecordType() {
        return UdtPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.udt_privileges.grantor</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.grantee</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_name</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), model.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), model.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), model.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(String alias) {
        this(DSL.name(alias), UDT_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(Name alias) {
        this(alias, UDT_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges() {
        this(DSL.name("udt_privileges"), null);
    }

    public <O extends Record> UdtPrivileges(Table<O> child, ForeignKey<O, UdtPrivilegesRecord> key) {
        super(child, key, UDT_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UdtPrivileges as(String alias) {
        return new UdtPrivileges(DSL.name(alias), this);
    }

    @Override
    public UdtPrivileges as(Name alias) {
        return new UdtPrivileges(alias, this);
    }

    @Override
    public UdtPrivileges as(Table<?> alias) {
        return new UdtPrivileges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(String name) {
        return new UdtPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Name name) {
        return new UdtPrivileges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Table<?> name) {
        return new UdtPrivileges(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
