/*
 * This file is generated by jOOQ.
 */
package model.company.tables.records;


import java.math.BigDecimal;

import model.company.tables.Orderdetails;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderdetailsRecord extends UpdatableRecordImpl<OrderdetailsRecord> implements Record5<Integer, String, Integer, BigDecimal, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>company.orderdetails.ordernumber</code>.
     */
    public void setOrdernumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>company.orderdetails.ordernumber</code>.
     */
    public Integer getOrdernumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>company.orderdetails.productcode</code>.
     */
    public void setProductcode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>company.orderdetails.productcode</code>.
     */
    public String getProductcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>company.orderdetails.quantityordered</code>.
     */
    public void setQuantityordered(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>company.orderdetails.quantityordered</code>.
     */
    public Integer getQuantityordered() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>company.orderdetails.priceeach</code>.
     */
    public void setPriceeach(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>company.orderdetails.priceeach</code>.
     */
    public BigDecimal getPriceeach() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>company.orderdetails.orderlinenumber</code>.
     */
    public void setOrderlinenumber(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>company.orderdetails.orderlinenumber</code>.
     */
    public Short getOrderlinenumber() {
        return (Short) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, BigDecimal, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, BigDecimal, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Orderdetails.ORDERDETAILS.ORDERNUMBER;
    }

    @Override
    public Field<String> field2() {
        return Orderdetails.ORDERDETAILS.PRODUCTCODE;
    }

    @Override
    public Field<Integer> field3() {
        return Orderdetails.ORDERDETAILS.QUANTITYORDERED;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Orderdetails.ORDERDETAILS.PRICEEACH;
    }

    @Override
    public Field<Short> field5() {
        return Orderdetails.ORDERDETAILS.ORDERLINENUMBER;
    }

    @Override
    public Integer component1() {
        return getOrdernumber();
    }

    @Override
    public String component2() {
        return getProductcode();
    }

    @Override
    public Integer component3() {
        return getQuantityordered();
    }

    @Override
    public BigDecimal component4() {
        return getPriceeach();
    }

    @Override
    public Short component5() {
        return getOrderlinenumber();
    }

    @Override
    public Integer value1() {
        return getOrdernumber();
    }

    @Override
    public String value2() {
        return getProductcode();
    }

    @Override
    public Integer value3() {
        return getQuantityordered();
    }

    @Override
    public BigDecimal value4() {
        return getPriceeach();
    }

    @Override
    public Short value5() {
        return getOrderlinenumber();
    }

    @Override
    public OrderdetailsRecord value1(Integer value) {
        setOrdernumber(value);
        return this;
    }

    @Override
    public OrderdetailsRecord value2(String value) {
        setProductcode(value);
        return this;
    }

    @Override
    public OrderdetailsRecord value3(Integer value) {
        setQuantityordered(value);
        return this;
    }

    @Override
    public OrderdetailsRecord value4(BigDecimal value) {
        setPriceeach(value);
        return this;
    }

    @Override
    public OrderdetailsRecord value5(Short value) {
        setOrderlinenumber(value);
        return this;
    }

    @Override
    public OrderdetailsRecord values(Integer value1, String value2, Integer value3, BigDecimal value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderdetailsRecord
     */
    public OrderdetailsRecord() {
        super(Orderdetails.ORDERDETAILS);
    }

    /**
     * Create a detached, initialised OrderdetailsRecord
     */
    public OrderdetailsRecord(Integer ordernumber, String productcode, Integer quantityordered, BigDecimal priceeach, Short orderlinenumber) {
        super(Orderdetails.ORDERDETAILS);

        setOrdernumber(ordernumber);
        setProductcode(productcode);
        setQuantityordered(quantityordered);
        setPriceeach(priceeach);
        setOrderlinenumber(orderlinenumber);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised OrderdetailsRecord
     */
    public OrderdetailsRecord(model.company.tables.pojos.Orderdetails value) {
        super(Orderdetails.ORDERDETAILS);

        if (value != null) {
            setOrdernumber(value.getOrdernumber());
            setProductcode(value.getProductcode());
            setQuantityordered(value.getQuantityordered());
            setPriceeach(value.getPriceeach());
            setOrderlinenumber(value.getOrderlinenumber());
            resetChangedOnNotNull();
        }
    }
}
