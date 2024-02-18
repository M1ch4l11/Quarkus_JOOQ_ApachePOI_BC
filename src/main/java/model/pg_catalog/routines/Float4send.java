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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Float4send extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.float4send.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BLOB, false, false);

    /**
     * The parameter <code>pg_catalog.float4send._1</code>.
     */
    public static final Parameter<Float> _1 = Internal.createParameter("_1", SQLDataType.REAL, false, true);

    /**
     * Create a new routine call instance
     */
    public Float4send() {
        super("float4send", PgCatalog.PG_CATALOG, SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Float value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Float> field) {
        setField(_1, field);
    }
}
