/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleTableGrants implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grantor;
    private String grantee;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String privilegeType;
    private String isGrantable;
    private String withHierarchy;

    public RoleTableGrants() {}

    public RoleTableGrants(RoleTableGrants value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
        this.withHierarchy = value.withHierarchy;
    }

    public RoleTableGrants(
        String grantor,
        String grantee,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String privilegeType,
        String isGrantable,
        String withHierarchy
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
        this.withHierarchy = withHierarchy;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.grantor</code>.
     */
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.grantor</code>.
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.grantee</code>.
     */
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.grantee</code>.
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.table_catalog</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.table_catalog</code>.
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.table_schema</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.table_schema</code>.
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.table_name</code>.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.privilege_type</code>.
     */
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.is_grantable</code>.
     */
    public String getIsGrantable() {
        return this.isGrantable;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.is_grantable</code>.
     */
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    public String getWithHierarchy() {
        return this.withHierarchy;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    public void setWithHierarchy(String withHierarchy) {
        this.withHierarchy = withHierarchy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RoleTableGrants other = (RoleTableGrants) obj;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
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
        if (this.privilegeType == null) {
            if (other.privilegeType != null)
                return false;
        }
        else if (!this.privilegeType.equals(other.privilegeType))
            return false;
        if (this.isGrantable == null) {
            if (other.isGrantable != null)
                return false;
        }
        else if (!this.isGrantable.equals(other.isGrantable))
            return false;
        if (this.withHierarchy == null) {
            if (other.withHierarchy != null)
                return false;
        }
        else if (!this.withHierarchy.equals(other.withHierarchy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        result = prime * result + ((this.withHierarchy == null) ? 0 : this.withHierarchy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleTableGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);
        sb.append(", ").append(withHierarchy);

        sb.append(")");
        return sb.toString();
    }
}
