/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foreignTableCatalog;
    private String foreignTableSchema;
    private String foreignTableName;
    private String foreignServerCatalog;
    private String foreignServerName;

    public ForeignTables() {}

    public ForeignTables(ForeignTables value) {
        this.foreignTableCatalog = value.foreignTableCatalog;
        this.foreignTableSchema = value.foreignTableSchema;
        this.foreignTableName = value.foreignTableName;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
    }

    public ForeignTables(
        String foreignTableCatalog,
        String foreignTableSchema,
        String foreignTableName,
        String foreignServerCatalog,
        String foreignServerName
    ) {
        this.foreignTableCatalog = foreignTableCatalog;
        this.foreignTableSchema = foreignTableSchema;
        this.foreignTableName = foreignTableName;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_catalog</code>.
     */
    public String getForeignTableCatalog() {
        return this.foreignTableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_catalog</code>.
     */
    public void setForeignTableCatalog(String foreignTableCatalog) {
        this.foreignTableCatalog = foreignTableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_schema</code>.
     */
    public String getForeignTableSchema() {
        return this.foreignTableSchema;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_schema</code>.
     */
    public void setForeignTableSchema(String foreignTableSchema) {
        this.foreignTableSchema = foreignTableSchema;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_name</code>.
     */
    public String getForeignTableName() {
        return this.foreignTableName;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_name</code>.
     */
    public void setForeignTableName(String foreignTableName) {
        this.foreignTableName = foreignTableName;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return this.foreignServerCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return this.foreignServerName;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_server_name</code>.
     */
    public void setForeignServerName(String foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ForeignTables other = (ForeignTables) obj;
        if (this.foreignTableCatalog == null) {
            if (other.foreignTableCatalog != null)
                return false;
        }
        else if (!this.foreignTableCatalog.equals(other.foreignTableCatalog))
            return false;
        if (this.foreignTableSchema == null) {
            if (other.foreignTableSchema != null)
                return false;
        }
        else if (!this.foreignTableSchema.equals(other.foreignTableSchema))
            return false;
        if (this.foreignTableName == null) {
            if (other.foreignTableName != null)
                return false;
        }
        else if (!this.foreignTableName.equals(other.foreignTableName))
            return false;
        if (this.foreignServerCatalog == null) {
            if (other.foreignServerCatalog != null)
                return false;
        }
        else if (!this.foreignServerCatalog.equals(other.foreignServerCatalog))
            return false;
        if (this.foreignServerName == null) {
            if (other.foreignServerName != null)
                return false;
        }
        else if (!this.foreignServerName.equals(other.foreignServerName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.foreignTableCatalog == null) ? 0 : this.foreignTableCatalog.hashCode());
        result = prime * result + ((this.foreignTableSchema == null) ? 0 : this.foreignTableSchema.hashCode());
        result = prime * result + ((this.foreignTableName == null) ? 0 : this.foreignTableName.hashCode());
        result = prime * result + ((this.foreignServerCatalog == null) ? 0 : this.foreignServerCatalog.hashCode());
        result = prime * result + ((this.foreignServerName == null) ? 0 : this.foreignServerName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignTables (");

        sb.append(foreignTableCatalog);
        sb.append(", ").append(foreignTableSchema);
        sb.append(", ").append(foreignTableName);
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);

        sb.append(")");
        return sb.toString();
    }
}