/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgOperator;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOperatorRecord extends UpdatableRecordImpl<PgOperatorRecord> implements Record15<Long, String, Long, Long, String, Boolean, Boolean, Long, Long, Long, Long, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_operator.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprname</code>.
     */
    public void setOprname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprname</code>.
     */
    public String getOprname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public void setOprnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public Long getOprnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public void setOprowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public Long getOprowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public void setOprkind(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public String getOprkind() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public void setOprcanmerge(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public Boolean getOprcanmerge() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public void setOprcanhash(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public Boolean getOprcanhash() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public void setOprleft(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public Long getOprleft() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprright</code>.
     */
    public void setOprright(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprright</code>.
     */
    public Long getOprright() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public void setOprresult(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public Long getOprresult() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public void setOprcom(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public Long getOprcom() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public void setOprnegate(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public Long getOprnegate() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public void setOprcode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public String getOprcode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public void setOprrest(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public String getOprrest() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public void setOprjoin(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public String getOprjoin() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, String, Long, Long, String, Boolean, Boolean, Long, Long, Long, Long, Long, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Long, String, Long, Long, String, Boolean, Boolean, Long, Long, Long, Long, Long, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgOperator.PG_OPERATOR.OID;
    }

    @Override
    public Field<String> field2() {
        return PgOperator.PG_OPERATOR.OPRNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgOperator.PG_OPERATOR.OPRNAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgOperator.PG_OPERATOR.OPROWNER;
    }

    @Override
    public Field<String> field5() {
        return PgOperator.PG_OPERATOR.OPRKIND;
    }

    @Override
    public Field<Boolean> field6() {
        return PgOperator.PG_OPERATOR.OPRCANMERGE;
    }

    @Override
    public Field<Boolean> field7() {
        return PgOperator.PG_OPERATOR.OPRCANHASH;
    }

    @Override
    public Field<Long> field8() {
        return PgOperator.PG_OPERATOR.OPRLEFT;
    }

    @Override
    public Field<Long> field9() {
        return PgOperator.PG_OPERATOR.OPRRIGHT;
    }

    @Override
    public Field<Long> field10() {
        return PgOperator.PG_OPERATOR.OPRRESULT;
    }

    @Override
    public Field<Long> field11() {
        return PgOperator.PG_OPERATOR.OPRCOM;
    }

    @Override
    public Field<Long> field12() {
        return PgOperator.PG_OPERATOR.OPRNEGATE;
    }

    @Override
    public Field<String> field13() {
        return PgOperator.PG_OPERATOR.OPRCODE;
    }

    @Override
    public Field<String> field14() {
        return PgOperator.PG_OPERATOR.OPRREST;
    }

    @Override
    public Field<String> field15() {
        return PgOperator.PG_OPERATOR.OPRJOIN;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getOprname();
    }

    @Override
    public Long component3() {
        return getOprnamespace();
    }

    @Override
    public Long component4() {
        return getOprowner();
    }

    @Override
    public String component5() {
        return getOprkind();
    }

    @Override
    public Boolean component6() {
        return getOprcanmerge();
    }

    @Override
    public Boolean component7() {
        return getOprcanhash();
    }

    @Override
    public Long component8() {
        return getOprleft();
    }

    @Override
    public Long component9() {
        return getOprright();
    }

    @Override
    public Long component10() {
        return getOprresult();
    }

    @Override
    public Long component11() {
        return getOprcom();
    }

    @Override
    public Long component12() {
        return getOprnegate();
    }

    @Override
    public String component13() {
        return getOprcode();
    }

    @Override
    public String component14() {
        return getOprrest();
    }

    @Override
    public String component15() {
        return getOprjoin();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getOprname();
    }

    @Override
    public Long value3() {
        return getOprnamespace();
    }

    @Override
    public Long value4() {
        return getOprowner();
    }

    @Override
    public String value5() {
        return getOprkind();
    }

    @Override
    public Boolean value6() {
        return getOprcanmerge();
    }

    @Override
    public Boolean value7() {
        return getOprcanhash();
    }

    @Override
    public Long value8() {
        return getOprleft();
    }

    @Override
    public Long value9() {
        return getOprright();
    }

    @Override
    public Long value10() {
        return getOprresult();
    }

    @Override
    public Long value11() {
        return getOprcom();
    }

    @Override
    public Long value12() {
        return getOprnegate();
    }

    @Override
    public String value13() {
        return getOprcode();
    }

    @Override
    public String value14() {
        return getOprrest();
    }

    @Override
    public String value15() {
        return getOprjoin();
    }

    @Override
    public PgOperatorRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgOperatorRecord value2(String value) {
        setOprname(value);
        return this;
    }

    @Override
    public PgOperatorRecord value3(Long value) {
        setOprnamespace(value);
        return this;
    }

    @Override
    public PgOperatorRecord value4(Long value) {
        setOprowner(value);
        return this;
    }

    @Override
    public PgOperatorRecord value5(String value) {
        setOprkind(value);
        return this;
    }

    @Override
    public PgOperatorRecord value6(Boolean value) {
        setOprcanmerge(value);
        return this;
    }

    @Override
    public PgOperatorRecord value7(Boolean value) {
        setOprcanhash(value);
        return this;
    }

    @Override
    public PgOperatorRecord value8(Long value) {
        setOprleft(value);
        return this;
    }

    @Override
    public PgOperatorRecord value9(Long value) {
        setOprright(value);
        return this;
    }

    @Override
    public PgOperatorRecord value10(Long value) {
        setOprresult(value);
        return this;
    }

    @Override
    public PgOperatorRecord value11(Long value) {
        setOprcom(value);
        return this;
    }

    @Override
    public PgOperatorRecord value12(Long value) {
        setOprnegate(value);
        return this;
    }

    @Override
    public PgOperatorRecord value13(String value) {
        setOprcode(value);
        return this;
    }

    @Override
    public PgOperatorRecord value14(String value) {
        setOprrest(value);
        return this;
    }

    @Override
    public PgOperatorRecord value15(String value) {
        setOprjoin(value);
        return this;
    }

    @Override
    public PgOperatorRecord values(Long value1, String value2, Long value3, Long value4, String value5, Boolean value6, Boolean value7, Long value8, Long value9, Long value10, Long value11, Long value12, String value13, String value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgOperatorRecord
     */
    public PgOperatorRecord() {
        super(PgOperator.PG_OPERATOR);
    }

    /**
     * Create a detached, initialised PgOperatorRecord
     */
    public PgOperatorRecord(Long oid, String oprname, Long oprnamespace, Long oprowner, String oprkind, Boolean oprcanmerge, Boolean oprcanhash, Long oprleft, Long oprright, Long oprresult, Long oprcom, Long oprnegate, String oprcode, String oprrest, String oprjoin) {
        super(PgOperator.PG_OPERATOR);

        setOid(oid);
        setOprname(oprname);
        setOprnamespace(oprnamespace);
        setOprowner(oprowner);
        setOprkind(oprkind);
        setOprcanmerge(oprcanmerge);
        setOprcanhash(oprcanhash);
        setOprleft(oprleft);
        setOprright(oprright);
        setOprresult(oprresult);
        setOprcom(oprcom);
        setOprnegate(oprnegate);
        setOprcode(oprcode);
        setOprrest(oprrest);
        setOprjoin(oprjoin);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgOperatorRecord
     */
    public PgOperatorRecord(model.pg_catalog.tables.pojos.PgOperator value) {
        super(PgOperator.PG_OPERATOR);

        if (value != null) {
            setOid(value.getOid());
            setOprname(value.getOprname());
            setOprnamespace(value.getOprnamespace());
            setOprowner(value.getOprowner());
            setOprkind(value.getOprkind());
            setOprcanmerge(value.getOprcanmerge());
            setOprcanhash(value.getOprcanhash());
            setOprleft(value.getOprleft());
            setOprright(value.getOprright());
            setOprresult(value.getOprresult());
            setOprcom(value.getOprcom());
            setOprnegate(value.getOprnegate());
            setOprcode(value.getOprcode());
            setOprrest(value.getOprrest());
            setOprjoin(value.getOprjoin());
            resetChangedOnNotNull();
        }
    }
}
