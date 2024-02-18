/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.PgPublicationTables;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPublicationTablesRecord extends TableRecordImpl<PgPublicationTablesRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public void setPubname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public String getPubname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public void setTablename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public String getTablename() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.PUBNAME;
    }

    @Override
    public Field<String> field2() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.SCHEMANAME;
    }

    @Override
    public Field<String> field3() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.TABLENAME;
    }

    @Override
    public String component1() {
        return getPubname();
    }

    @Override
    public String component2() {
        return getSchemaname();
    }

    @Override
    public String component3() {
        return getTablename();
    }

    @Override
    public String value1() {
        return getPubname();
    }

    @Override
    public String value2() {
        return getSchemaname();
    }

    @Override
    public String value3() {
        return getTablename();
    }

    @Override
    public PgPublicationTablesRecord value1(String value) {
        setPubname(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value3(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationTablesRecord
     */
    public PgPublicationTablesRecord() {
        super(PgPublicationTables.PG_PUBLICATION_TABLES);
    }

    /**
     * Create a detached, initialised PgPublicationTablesRecord
     */
    public PgPublicationTablesRecord(String pubname, String schemaname, String tablename) {
        super(PgPublicationTables.PG_PUBLICATION_TABLES);

        setPubname(pubname);
        setSchemaname(schemaname);
        setTablename(tablename);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgPublicationTablesRecord
     */
    public PgPublicationTablesRecord(model.pg_catalog.tables.pojos.PgPublicationTables value) {
        super(PgPublicationTables.PG_PUBLICATION_TABLES);

        if (value != null) {
            setPubname(value.getPubname());
            setSchemaname(value.getSchemaname());
            setTablename(value.getTablename());
            resetChangedOnNotNull();
        }
    }
}