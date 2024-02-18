/*
 * This file is generated by jOOQ.
 */
package model;


import java.util.Arrays;
import java.util.List;

import model.company.Company;
import model.information_schema.InformationSchema;
import model.pg_catalog.PgCatalog;

import org.jooq.Constants;
import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>company</code>.
     */
    public final Company COMPANY = Company.COMPANY;

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>pg_catalog</code>.
     */
    public final PgCatalog PG_CATALOG = PgCatalog.PG_CATALOG;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.asList(
            Company.COMPANY,
            InformationSchema.INFORMATION_SCHEMA,
            PgCatalog.PG_CATALOG
        );
    }

    /**
     * A reference to the 3.18 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.18. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private static final String REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_18;
}