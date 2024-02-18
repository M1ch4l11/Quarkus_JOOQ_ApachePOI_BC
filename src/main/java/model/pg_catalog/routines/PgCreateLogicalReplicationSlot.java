/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.routines;


import model.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCreateLogicalReplicationSlot extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_create_logical_replication_slot.slot_name</code>.
     */
    public static final Parameter<String> SLOT_NAME1 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_create_logical_replication_slot.plugin</code>.
     */
    public static final Parameter<String> PLUGIN = Internal.createParameter("plugin", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_create_logical_replication_slot.temporary</code>.
     */
    public static final Parameter<Boolean> TEMPORARY = Internal.createParameter("temporary", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_create_logical_replication_slot.twophase</code>.
     */
    public static final Parameter<Boolean> TWOPHASE = Internal.createParameter("twophase", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_create_logical_replication_slot.slot_name</code>.
     */
    public static final Parameter<String> SLOT_NAME5 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * Create a new routine call instance
     */
    public PgCreateLogicalReplicationSlot() {
        super("pg_create_logical_replication_slot", PgCatalog.PG_CATALOG);

        addInOutParameter(SLOT_NAME1);
        addInParameter(PLUGIN);
        addInParameter(TEMPORARY);
        addInParameter(TWOPHASE);
        addInOutParameter(SLOT_NAME5);
        addOutParameter(LSN);
    }

    /**
     * Set the <code>slot_name</code> parameter IN value to the routine
     */
    public void setSlotName1(String value) {
        setValue(SLOT_NAME1, value);
    }

    /**
     * Set the <code>plugin</code> parameter IN value to the routine
     */
    public void setPlugin(String value) {
        setValue(PLUGIN, value);
    }

    /**
     * Set the <code>temporary</code> parameter IN value to the routine
     */
    public void setTemporary(Boolean value) {
        setValue(TEMPORARY, value);
    }

    /**
     * Set the <code>twophase</code> parameter IN value to the routine
     */
    public void setTwophase(Boolean value) {
        setValue(TWOPHASE, value);
    }

    /**
     * Get the <code>slot_name</code> parameter OUT value from the routine
     */
    public String getSlotName1() {
        return get(SLOT_NAME1);
    }

    /**
     * Get the <code>slot_name</code> parameter OUT value from the routine
     */
    public String getSlotName5() {
        return get(SLOT_NAME5);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getLsn() {
        return get(LSN);
    }
}