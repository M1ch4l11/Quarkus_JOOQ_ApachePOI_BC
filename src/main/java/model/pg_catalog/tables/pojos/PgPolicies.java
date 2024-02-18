/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPolicies implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String tablename;
    private String policyname;
    private String permissive;
    private String[] roles;
    private String cmd;
    private String qual;
    private String withCheck;

    public PgPolicies() {}

    public PgPolicies(PgPolicies value) {
        this.schemaname = value.schemaname;
        this.tablename = value.tablename;
        this.policyname = value.policyname;
        this.permissive = value.permissive;
        this.roles = value.roles;
        this.cmd = value.cmd;
        this.qual = value.qual;
        this.withCheck = value.withCheck;
    }

    public PgPolicies(
        String schemaname,
        String tablename,
        String policyname,
        String permissive,
        String[] roles,
        String cmd,
        String qual,
        String withCheck
    ) {
        this.schemaname = schemaname;
        this.tablename = tablename;
        this.policyname = policyname;
        this.permissive = permissive;
        this.roles = roles;
        this.cmd = cmd;
        this.qual = qual;
        this.withCheck = withCheck;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.tablename</code>.
     */
    public String getTablename() {
        return this.tablename;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.tablename</code>.
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.policyname</code>.
     */
    public String getPolicyname() {
        return this.policyname;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.policyname</code>.
     */
    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.permissive</code>.
     */
    public String getPermissive() {
        return this.permissive;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.permissive</code>.
     */
    public void setPermissive(String permissive) {
        this.permissive = permissive;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.roles</code>.
     */
    public String[] getRoles() {
        return this.roles;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.roles</code>.
     */
    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.cmd</code>.
     */
    public String getCmd() {
        return this.cmd;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.cmd</code>.
     */
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.qual</code>.
     */
    public String getQual() {
        return this.qual;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.qual</code>.
     */
    public void setQual(String qual) {
        this.qual = qual;
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.with_check</code>.
     */
    public String getWithCheck() {
        return this.withCheck;
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.with_check</code>.
     */
    public void setWithCheck(String withCheck) {
        this.withCheck = withCheck;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPolicies other = (PgPolicies) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.tablename == null) {
            if (other.tablename != null)
                return false;
        }
        else if (!this.tablename.equals(other.tablename))
            return false;
        if (this.policyname == null) {
            if (other.policyname != null)
                return false;
        }
        else if (!this.policyname.equals(other.policyname))
            return false;
        if (this.permissive == null) {
            if (other.permissive != null)
                return false;
        }
        else if (!this.permissive.equals(other.permissive))
            return false;
        if (this.roles == null) {
            if (other.roles != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.roles, other.roles))
            return false;
        if (this.cmd == null) {
            if (other.cmd != null)
                return false;
        }
        else if (!this.cmd.equals(other.cmd))
            return false;
        if (this.qual == null) {
            if (other.qual != null)
                return false;
        }
        else if (!this.qual.equals(other.qual))
            return false;
        if (this.withCheck == null) {
            if (other.withCheck != null)
                return false;
        }
        else if (!this.withCheck.equals(other.withCheck))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.tablename == null) ? 0 : this.tablename.hashCode());
        result = prime * result + ((this.policyname == null) ? 0 : this.policyname.hashCode());
        result = prime * result + ((this.permissive == null) ? 0 : this.permissive.hashCode());
        result = prime * result + ((this.roles == null) ? 0 : Arrays.deepHashCode(this.roles));
        result = prime * result + ((this.cmd == null) ? 0 : this.cmd.hashCode());
        result = prime * result + ((this.qual == null) ? 0 : this.qual.hashCode());
        result = prime * result + ((this.withCheck == null) ? 0 : this.withCheck.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPolicies (");

        sb.append(schemaname);
        sb.append(", ").append(tablename);
        sb.append(", ").append(policyname);
        sb.append(", ").append(permissive);
        sb.append(", ").append(Arrays.deepToString(roles));
        sb.append(", ").append(cmd);
        sb.append(", ").append(qual);
        sb.append(", ").append(withCheck);

        sb.append(")");
        return sb.toString();
    }
}
