/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgAuthMembers;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAuthMembersRecord extends UpdatableRecordImpl<PgAuthMembersRecord> implements Record4<Long, Long, Long, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public void setRoleid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public Long getRoleid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    public void setMember(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    public Long getMember() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public void setGrantor(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public Long getGrantor() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public void setAdminOption(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public Boolean getAdminOption() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgAuthMembers.PG_AUTH_MEMBERS.ROLEID;
    }

    @Override
    public Field<Long> field2() {
        return PgAuthMembers.PG_AUTH_MEMBERS.MEMBER;
    }

    @Override
    public Field<Long> field3() {
        return PgAuthMembers.PG_AUTH_MEMBERS.GRANTOR;
    }

    @Override
    public Field<Boolean> field4() {
        return PgAuthMembers.PG_AUTH_MEMBERS.ADMIN_OPTION;
    }

    @Override
    public Long component1() {
        return getRoleid();
    }

    @Override
    public Long component2() {
        return getMember();
    }

    @Override
    public Long component3() {
        return getGrantor();
    }

    @Override
    public Boolean component4() {
        return getAdminOption();
    }

    @Override
    public Long value1() {
        return getRoleid();
    }

    @Override
    public Long value2() {
        return getMember();
    }

    @Override
    public Long value3() {
        return getGrantor();
    }

    @Override
    public Boolean value4() {
        return getAdminOption();
    }

    @Override
    public PgAuthMembersRecord value1(Long value) {
        setRoleid(value);
        return this;
    }

    @Override
    public PgAuthMembersRecord value2(Long value) {
        setMember(value);
        return this;
    }

    @Override
    public PgAuthMembersRecord value3(Long value) {
        setGrantor(value);
        return this;
    }

    @Override
    public PgAuthMembersRecord value4(Boolean value) {
        setAdminOption(value);
        return this;
    }

    @Override
    public PgAuthMembersRecord values(Long value1, Long value2, Long value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAuthMembersRecord
     */
    public PgAuthMembersRecord() {
        super(PgAuthMembers.PG_AUTH_MEMBERS);
    }

    /**
     * Create a detached, initialised PgAuthMembersRecord
     */
    public PgAuthMembersRecord(Long roleid, Long member, Long grantor, Boolean adminOption) {
        super(PgAuthMembers.PG_AUTH_MEMBERS);

        setRoleid(roleid);
        setMember(member);
        setGrantor(grantor);
        setAdminOption(adminOption);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgAuthMembersRecord
     */
    public PgAuthMembersRecord(model.pg_catalog.tables.pojos.PgAuthMembers value) {
        super(PgAuthMembers.PG_AUTH_MEMBERS);

        if (value != null) {
            setRoleid(value.getRoleid());
            setMember(value.getMember());
            setGrantor(value.getGrantor());
            setAdminOption(value.getAdminOption());
            resetChangedOnNotNull();
        }
    }
}
