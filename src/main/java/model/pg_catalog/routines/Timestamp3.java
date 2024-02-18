/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class Timestamp3 extends AbstractRoutine<LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false);

    /**
     * The parameter <code>pg_catalog.timestamp._1</code>.
     */
    public static final Parameter<LocalDate> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.timestamp._2</code>.
     */
    public static final Parameter<LocalTime> _2 = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true);

    /**
     * Create a new routine call instance
     */
    public Timestamp3() {
        super("timestamp", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDate value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDate> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalTime> field) {
        setField(_2, field);
    }
}
