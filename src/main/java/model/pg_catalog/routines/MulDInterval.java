/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import model.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MulDInterval extends AbstractRoutine<YearToSecond> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.mul_d_interval.RETURN_VALUE</code>.
     */
    public static final Parameter<YearToSecond> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>pg_catalog.mul_d_interval._1</code>.
     */
    public static final Parameter<Double> _1 = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>pg_catalog.mul_d_interval._2</code>.
     */
    public static final Parameter<YearToSecond> _2 = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true);

    /**
     * Create a new routine call instance
     */
    public MulDInterval() {
        super("mul_d_interval", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(YearToSecond value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<YearToSecond> field) {
        setField(_2, field);
    }
}
