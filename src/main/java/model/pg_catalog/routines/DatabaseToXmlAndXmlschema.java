/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import model.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.XML;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabaseToXmlAndXmlschema extends AbstractRoutine<XML> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.database_to_xml_and_xmlschema.RETURN_VALUE</code>.
     */
    public static final Parameter<XML> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false);

    /**
     * The parameter
     * <code>pg_catalog.database_to_xml_and_xmlschema.nulls</code>.
     */
    public static final Parameter<Boolean> NULLS = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.database_to_xml_and_xmlschema.tableforest</code>.
     */
    public static final Parameter<Boolean> TABLEFOREST = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.database_to_xml_and_xmlschema.targetns</code>.
     */
    public static final Parameter<String> TARGETNS = Internal.createParameter("targetns", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public DatabaseToXmlAndXmlschema() {
        super("database_to_xml_and_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.XML);

        setReturnParameter(RETURN_VALUE);
        addInParameter(NULLS);
        addInParameter(TABLEFOREST);
        addInParameter(TARGETNS);
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    public void setNulls(Boolean value) {
        setValue(NULLS, value);
    }

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setNulls(Field<Boolean> field) {
        setField(NULLS, field);
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    public void setTableforest(Boolean value) {
        setValue(TABLEFOREST, value);
    }

    /**
     * Set the <code>tableforest</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setTableforest(Field<Boolean> field) {
        setField(TABLEFOREST, field);
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    public void setTargetns(String value) {
        setValue(TARGETNS, value);
    }

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTargetns(Field<String> field) {
        setField(TARGETNS, field);
    }
}
