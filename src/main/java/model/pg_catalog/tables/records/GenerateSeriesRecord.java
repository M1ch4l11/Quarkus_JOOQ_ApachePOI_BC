/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.records;


import model.pg_catalog.tables.GenerateSeries;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSeriesRecord extends TableRecordImpl<GenerateSeriesRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public void setGenerateSeries(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public Integer getGenerateSeries() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GenerateSeries.GENERATE_SERIES.GENERATE_SERIES_;
    }

    @Override
    public Integer component1() {
        return getGenerateSeries();
    }

    @Override
    public Integer value1() {
        return getGenerateSeries();
    }

    @Override
    public GenerateSeriesRecord value1(Integer value) {
        setGenerateSeries(value);
        return this;
    }

    @Override
    public GenerateSeriesRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenerateSeriesRecord
     */
    public GenerateSeriesRecord() {
        super(GenerateSeries.GENERATE_SERIES);
    }

    /**
     * Create a detached, initialised GenerateSeriesRecord
     */
    public GenerateSeriesRecord(Integer generateSeries) {
        super(GenerateSeries.GENERATE_SERIES);

        setGenerateSeries(generateSeries);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised GenerateSeriesRecord
     */
    public GenerateSeriesRecord(model.pg_catalog.tables.pojos.GenerateSeries value) {
        super(GenerateSeries.GENERATE_SERIES);

        if (value != null) {
            setGenerateSeries(value.getGenerateSeries());
            resetChangedOnNotNull();
        }
    }
}