/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import model.pg_catalog.Keys;
import model.pg_catalog.PgCatalog;
import model.pg_catalog.tables.records.PgTsParserRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsParser extends TableImpl<PgTsParserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_parser</code>
     */
    public static final PgTsParser PG_TS_PARSER = new PgTsParser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsParserRecord> getRecordType() {
        return PgTsParserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_parser.oid</code>.
     */
    public final TableField<PgTsParserRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSNAME = createField(DSL.name("prsname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public final TableField<PgTsParserRecord, Long> PRSNAMESPACE = createField(DSL.name("prsnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSSTART = createField(DSL.name("prsstart"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSTOKEN = createField(DSL.name("prstoken"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSEND = createField(DSL.name("prsend"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSHEADLINE = createField(DSL.name("prsheadline"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSLEXTYPE = createField(DSL.name("prslextype"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(String alias) {
        this(DSL.name(alias), PG_TS_PARSER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(Name alias) {
        this(alias, PG_TS_PARSER);
    }

    /**
     * Create a <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser() {
        this(DSL.name("pg_ts_parser"), null);
    }

    public <O extends Record> PgTsParser(Table<O> child, ForeignKey<O, PgTsParserRecord> key) {
        super(child, key, PG_TS_PARSER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTsParserRecord> getPrimaryKey() {
        return Keys.PG_TS_PARSER_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgTsParserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TS_PARSER_PRSNAME_INDEX);
    }

    @Override
    public PgTsParser as(String alias) {
        return new PgTsParser(DSL.name(alias), this);
    }

    @Override
    public PgTsParser as(Name alias) {
        return new PgTsParser(alias, this);
    }

    @Override
    public PgTsParser as(Table<?> alias) {
        return new PgTsParser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(String name) {
        return new PgTsParser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(Name name) {
        return new PgTsParser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(Table<?> name) {
        return new PgTsParser(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
