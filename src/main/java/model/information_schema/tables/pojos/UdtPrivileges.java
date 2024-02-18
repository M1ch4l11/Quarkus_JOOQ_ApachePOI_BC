/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UdtPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grantor;
    private String grantee;
    private String udtCatalog;
    private String udtSchema;
    private String udtName;
    private String privilegeType;
    private String isGrantable;

    public UdtPrivileges() {}

    public UdtPrivileges(UdtPrivileges value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public UdtPrivileges(
        String grantor,
        String grantee,
        String udtCatalog,
        String udtSchema,
        String udtName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.grantor</code>.
     */
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.grantor</code>.
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.grantee</code>.
     */
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.grantee</code>.
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public String getUdtSchema() {
        return this.udtSchema;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.udt_name</code>.
     */
    public String getUdtName() {
        return this.udtName;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.udt_name</code>.
     */
    public void setUdtName(String udtName) {
        this.udtName = udtName;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * Getter for <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public String getIsGrantable() {
        return this.isGrantable;
    }

    /**
     * Setter for <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UdtPrivileges other = (UdtPrivileges) obj;
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
        if (this.udtCatalog == null) {
            if (other.udtCatalog != null)
                return false;
        }
        else if (!this.udtCatalog.equals(other.udtCatalog))
            return false;
        if (this.udtSchema == null) {
            if (other.udtSchema != null)
                return false;
        }
        else if (!this.udtSchema.equals(other.udtSchema))
            return false;
        if (this.udtName == null) {
            if (other.udtName != null)
                return false;
        }
        else if (!this.udtName.equals(other.udtName))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.udtCatalog == null) ? 0 : this.udtCatalog.hashCode());
        result = prime * result + ((this.udtSchema == null) ? 0 : this.udtSchema.hashCode());
        result = prime * result + ((this.udtName == null) ? 0 : this.udtName.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UdtPrivileges (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}