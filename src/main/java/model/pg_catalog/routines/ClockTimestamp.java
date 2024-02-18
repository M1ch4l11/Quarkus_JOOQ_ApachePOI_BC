/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import java.time.OffsetDateTime;

import model.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClockTimestamp extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.clock_timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * Create a new routine call instance
     */
    public ClockTimestamp() {
        super("clock_timestamp", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
    }
}
