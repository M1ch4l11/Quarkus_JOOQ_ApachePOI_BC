/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGssapi implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Boolean gssAuthenticated;
    private String principal;
    private Boolean encrypted;

    public PgStatGssapi() {}

    public PgStatGssapi(PgStatGssapi value) {
        this.pid = value.pid;
        this.gssAuthenticated = value.gssAuthenticated;
        this.principal = value.principal;
        this.encrypted = value.encrypted;
    }

    public PgStatGssapi(
        Integer pid,
        Boolean gssAuthenticated,
        String principal,
        Boolean encrypted
    ) {
        this.pid = pid;
        this.gssAuthenticated = gssAuthenticated;
        this.principal = principal;
        this.encrypted = encrypted;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    public Boolean getGssAuthenticated() {
        return this.gssAuthenticated;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    public void setGssAuthenticated(Boolean gssAuthenticated) {
        this.gssAuthenticated = gssAuthenticated;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    public String getPrincipal() {
        return this.principal;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatGssapi other = (PgStatGssapi) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.gssAuthenticated == null) {
            if (other.gssAuthenticated != null)
                return false;
        }
        else if (!this.gssAuthenticated.equals(other.gssAuthenticated))
            return false;
        if (this.principal == null) {
            if (other.principal != null)
                return false;
        }
        else if (!this.principal.equals(other.principal))
            return false;
        if (this.encrypted == null) {
            if (other.encrypted != null)
                return false;
        }
        else if (!this.encrypted.equals(other.encrypted))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.gssAuthenticated == null) ? 0 : this.gssAuthenticated.hashCode());
        result = prime * result + ((this.principal == null) ? 0 : this.principal.hashCode());
        result = prime * result + ((this.encrypted == null) ? 0 : this.encrypted.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatGssapi (");

        sb.append(pid);
        sb.append(", ").append(gssAuthenticated);
        sb.append(", ").append(principal);
        sb.append(", ").append(encrypted);

        sb.append(")");
        return sb.toString();
    }
}