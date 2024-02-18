/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import java.time.OffsetTime;

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
public class Timezone3 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timezone.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMEWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.timezone._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>pg_catalog.timezone._2</code>.
     */
    public static final Parameter<OffsetTime> _2 = Internal.createParameter("_2", SQLDataType.TIMEWITHTIMEZONE(6), false, true);

    /**
     * Create a new routine call instance
     */
    public Timezone3() {
        super("timezone", PgCatalog.PG_CATALOG, SQLDataType.TIMEWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(OffsetTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<OffsetTime> field) {
        setField(_2, field);
    }
}
