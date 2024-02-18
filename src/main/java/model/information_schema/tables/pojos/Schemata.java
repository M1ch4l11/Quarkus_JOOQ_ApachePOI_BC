/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata implements Serializable {

    private static final long serialVersionUID = 1L;

    private String catalogName;
    private String schemaName;
    private String schemaOwner;
    private String defaultCharacterSetCatalog;
    private String defaultCharacterSetSchema;
    private String defaultCharacterSetName;
    private String sqlPath;

    public Schemata() {}

    public Schemata(Schemata value) {
        this.catalogName = value.catalogName;
        this.schemaName = value.schemaName;
        this.schemaOwner = value.schemaOwner;
        this.defaultCharacterSetCatalog = value.defaultCharacterSetCatalog;
        this.defaultCharacterSetSchema = value.defaultCharacterSetSchema;
        this.defaultCharacterSetName = value.defaultCharacterSetName;
        this.sqlPath = value.sqlPath;
    }

    public Schemata(
        String catalogName,
        String schemaName,
        String schemaOwner,
        String defaultCharacterSetCatalog,
        String defaultCharacterSetSchema,
        String defaultCharacterSetName,
        String sqlPath
    ) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.schemaOwner = schemaOwner;
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog;
        this.defaultCharacterSetSchema = defaultCharacterSetSchema;
        this.defaultCharacterSetName = defaultCharacterSetName;
        this.sqlPath = sqlPath;
    }

    /**
     * Getter for <code>information_schema.schemata.catalog_name</code>.
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * Setter for <code>information_schema.schemata.catalog_name</code>.
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * Getter for <code>information_schema.schemata.schema_name</code>.
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Setter for <code>information_schema.schemata.schema_name</code>.
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * Getter for <code>information_schema.schemata.schema_owner</code>.
     */
    public String getSchemaOwner() {
        return this.schemaOwner;
    }

    /**
     * Setter for <code>information_schema.schemata.schema_owner</code>.
     */
    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public String getDefaultCharacterSetCatalog() {
        return this.defaultCharacterSetCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public void setDefaultCharacterSetCatalog(String defaultCharacterSetCatalog) {
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public String getDefaultCharacterSetSchema() {
        return this.defaultCharacterSetSchema;
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public void setDefaultCharacterSetSchema(String defaultCharacterSetSchema) {
        this.defaultCharacterSetSchema = defaultCharacterSetSchema;
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_name</code>.
     */
    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_name</code>.
     */
    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    /**
     * Getter for <code>information_schema.schemata.sql_path</code>.
     */
    public String getSqlPath() {
        return this.sqlPath;
    }

    /**
     * Setter for <code>information_schema.schemata.sql_path</code>.
     */
    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Schemata other = (Schemata) obj;
        if (this.catalogName == null) {
            if (other.catalogName != null)
                return false;
        }
        else if (!this.catalogName.equals(other.catalogName))
            return false;
        if (this.schemaName == null) {
            if (other.schemaName != null)
                return false;
        }
        else if (!this.schemaName.equals(other.schemaName))
            return false;
        if (this.schemaOwner == null) {
            if (other.schemaOwner != null)
                return false;
        }
        else if (!this.schemaOwner.equals(other.schemaOwner))
            return false;
        if (this.defaultCharacterSetCatalog == null) {
            if (other.defaultCharacterSetCatalog != null)
                return false;
        }
        else if (!this.defaultCharacterSetCatalog.equals(other.defaultCharacterSetCatalog))
            return false;
        if (this.defaultCharacterSetSchema == null) {
            if (other.defaultCharacterSetSchema != null)
                return false;
        }
        else if (!this.defaultCharacterSetSchema.equals(other.defaultCharacterSetSchema))
            return false;
        if (this.defaultCharacterSetName == null) {
            if (other.defaultCharacterSetName != null)
                return false;
        }
        else if (!this.defaultCharacterSetName.equals(other.defaultCharacterSetName))
            return false;
        if (this.sqlPath == null) {
            if (other.sqlPath != null)
                return false;
        }
        else if (!this.sqlPath.equals(other.sqlPath))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.catalogName == null) ? 0 : this.catalogName.hashCode());
        result = prime * result + ((this.schemaName == null) ? 0 : this.schemaName.hashCode());
        result = prime * result + ((this.schemaOwner == null) ? 0 : this.schemaOwner.hashCode());
        result = prime * result + ((this.defaultCharacterSetCatalog == null) ? 0 : this.defaultCharacterSetCatalog.hashCode());
        result = prime * result + ((this.defaultCharacterSetSchema == null) ? 0 : this.defaultCharacterSetSchema.hashCode());
        result = prime * result + ((this.defaultCharacterSetName == null) ? 0 : this.defaultCharacterSetName.hashCode());
        result = prime * result + ((this.sqlPath == null) ? 0 : this.sqlPath.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schemata (");

        sb.append(catalogName);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(schemaOwner);
        sb.append(", ").append(defaultCharacterSetCatalog);
        sb.append(", ").append(defaultCharacterSetSchema);
        sb.append(", ").append(defaultCharacterSetName);
        sb.append(", ").append(sqlPath);

        sb.append(")");
        return sb.toString();
    }
}
