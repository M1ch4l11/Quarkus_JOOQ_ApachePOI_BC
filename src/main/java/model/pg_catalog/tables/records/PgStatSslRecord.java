/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import java.math.BigDecimal;

import model.pg_catalog.tables.PgStatSsl;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSslRecord extends TableRecordImpl<PgStatSslRecord> implements Record8<Integer, Boolean, String, String, Integer, String, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public void setSsl(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public Boolean getSsl() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public void setVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public void setCipher(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public String getCipher() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public void setBits(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public Integer getBits() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public void setClientDn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public String getClientDn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public void setClientSerial(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public BigDecimal getClientSerial() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public void setIssuerDn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public String getIssuerDn() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Boolean, String, String, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Boolean, String, String, Integer, String, BigDecimal, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatSsl.PG_STAT_SSL.PID;
    }

    @Override
    public Field<Boolean> field2() {
        return PgStatSsl.PG_STAT_SSL.SSL;
    }

    @Override
    public Field<String> field3() {
        return PgStatSsl.PG_STAT_SSL.VERSION;
    }

    @Override
    public Field<String> field4() {
        return PgStatSsl.PG_STAT_SSL.CIPHER;
    }

    @Override
    public Field<Integer> field5() {
        return PgStatSsl.PG_STAT_SSL.BITS;
    }

    @Override
    public Field<String> field6() {
        return PgStatSsl.PG_STAT_SSL.CLIENT_DN;
    }

    @Override
    public Field<BigDecimal> field7() {
        return PgStatSsl.PG_STAT_SSL.CLIENT_SERIAL;
    }

    @Override
    public Field<String> field8() {
        return PgStatSsl.PG_STAT_SSL.ISSUER_DN;
    }

    @Override
    public Integer component1() {
        return getPid();
    }

    @Override
    public Boolean component2() {
        return getSsl();
    }

    @Override
    public String component3() {
        return getVersion();
    }

    @Override
    public String component4() {
        return getCipher();
    }

    @Override
    public Integer component5() {
        return getBits();
    }

    @Override
    public String component6() {
        return getClientDn();
    }

    @Override
    public BigDecimal component7() {
        return getClientSerial();
    }

    @Override
    public String component8() {
        return getIssuerDn();
    }

    @Override
    public Integer value1() {
        return getPid();
    }

    @Override
    public Boolean value2() {
        return getSsl();
    }

    @Override
    public String value3() {
        return getVersion();
    }

    @Override
    public String value4() {
        return getCipher();
    }

    @Override
    public Integer value5() {
        return getBits();
    }

    @Override
    public String value6() {
        return getClientDn();
    }

    @Override
    public BigDecimal value7() {
        return getClientSerial();
    }

    @Override
    public String value8() {
        return getIssuerDn();
    }

    @Override
    public PgStatSslRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatSslRecord value2(Boolean value) {
        setSsl(value);
        return this;
    }

    @Override
    public PgStatSslRecord value3(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PgStatSslRecord value4(String value) {
        setCipher(value);
        return this;
    }

    @Override
    public PgStatSslRecord value5(Integer value) {
        setBits(value);
        return this;
    }

    @Override
    public PgStatSslRecord value6(String value) {
        setClientDn(value);
        return this;
    }

    @Override
    public PgStatSslRecord value7(BigDecimal value) {
        setClientSerial(value);
        return this;
    }

    @Override
    public PgStatSslRecord value8(String value) {
        setIssuerDn(value);
        return this;
    }

    @Override
    public PgStatSslRecord values(Integer value1, Boolean value2, String value3, String value4, Integer value5, String value6, BigDecimal value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSslRecord
     */
    public PgStatSslRecord() {
        super(PgStatSsl.PG_STAT_SSL);
    }

    /**
     * Create a detached, initialised PgStatSslRecord
     */
    public PgStatSslRecord(Integer pid, Boolean ssl, String version, String cipher, Integer bits, String clientDn, BigDecimal clientSerial, String issuerDn) {
        super(PgStatSsl.PG_STAT_SSL);

        setPid(pid);
        setSsl(ssl);
        setVersion(version);
        setCipher(cipher);
        setBits(bits);
        setClientDn(clientDn);
        setClientSerial(clientSerial);
        setIssuerDn(issuerDn);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatSslRecord
     */
    public PgStatSslRecord(model.pg_catalog.tables.pojos.PgStatSsl value) {
        super(PgStatSsl.PG_STAT_SSL);

        if (value != null) {
            setPid(value.getPid());
            setSsl(value.getSsl());
            setVersion(value.getVersion());
            setCipher(value.getCipher());
            setBits(value.getBits());
            setClientDn(value.getClientDn());
            setClientSerial(value.getClientSerial());
            setIssuerDn(value.getIssuerDn());
            resetChangedOnNotNull();
        }
    }
}
