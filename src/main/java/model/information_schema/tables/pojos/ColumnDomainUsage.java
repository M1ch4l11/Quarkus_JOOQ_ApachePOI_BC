/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnDomainUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String domainCatalog;
    private String domainSchema;
    private String domainName;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;

    public ColumnDomainUsage() {}

    public ColumnDomainUsage(ColumnDomainUsage value) {
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
    }

    public ColumnDomainUsage(
        String domainCatalog,
        String domainSchema,
        String domainName,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName
    ) {
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public String getDomainSchema() {
        return this.domainSchema;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ColumnDomainUsage other = (ColumnDomainUsage) obj;
        if (this.domainCatalog == null) {
            if (other.domainCatalog != null)
                return false;
        }
        else if (!this.domainCatalog.equals(other.domainCatalog))
            return false;
        if (this.domainSchema == null) {
            if (other.domainSchema != null)
                return false;
        }
        else if (!this.domainSchema.equals(other.domainSchema))
            return false;
        if (this.domainName == null) {
            if (other.domainName != null)
                return false;
        }
        else if (!this.domainName.equals(other.domainName))
            return false;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.domainCatalog == null) ? 0 : this.domainCatalog.hashCode());
        result = prime * result + ((this.domainSchema == null) ? 0 : this.domainSchema.hashCode());
        result = prime * result + ((this.domainName == null) ? 0 : this.domainName.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnDomainUsage (");

        sb.append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);

        sb.append(")");
        return sb.toString();
    }
}
