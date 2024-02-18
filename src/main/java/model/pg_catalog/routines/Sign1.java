/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import java.math.BigDecimal;

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
public class Sign1 extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.sign.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>pg_catalog.sign._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = Internal.createParameter("_1", SQLDataType.NUMERIC, false, true);

    /**
     * Create a new routine call instance
     */
    public Sign1() {
        super("sign", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }
}
