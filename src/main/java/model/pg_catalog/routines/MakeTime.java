/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import java.time.LocalTime;

import model.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MakeTime extends AbstractRoutine<LocalTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.make_time.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false);

    /**
     * The parameter <code>pg_catalog.make_time.hour</code>.
     */
    public static final Parameter<Integer> HOUR = Internal.createParameter("hour", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_time.min</code>.
     */
    public static final Parameter<Integer> MIN = Internal.createParameter("min", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_time.sec</code>.
     */
    public static final Parameter<Double> SEC = Internal.createParameter("sec", SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeTime() {
        super("make_time", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(HOUR);
        addInParameter(MIN);
        addInParameter(SEC);
    }

    /**
     * Set the <code>hour</code> parameter IN value to the routine
     */
    public void setHour(Integer value) {
        setValue(HOUR, value);
    }

    /**
     * Set the <code>hour</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setHour(Field<Integer> field) {
        setField(HOUR, field);
    }

    /**
     * Set the <code>min</code> parameter IN value to the routine
     */
    public void setMin(Integer value) {
        setValue(MIN, value);
    }

    /**
     * Set the <code>min</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setMin(Field<Integer> field) {
        setField(MIN, field);
    }

    /**
     * Set the <code>sec</code> parameter IN value to the routine
     */
    public void setSec(Double value) {
        setValue(SEC, value);
    }

    /**
     * Set the <code>sec</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setSec(Field<Double> field) {
        setField(SEC, field);
    }
}
