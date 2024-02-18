/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShdepend implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long dbid;
    private Long classid;
    private Long objid;
    private Integer objsubid;
    private Long refclassid;
    private Long refobjid;
    private String deptype;

    public PgShdepend() {}

    public PgShdepend(PgShdepend value) {
        this.dbid = value.dbid;
        this.classid = value.classid;
        this.objid = value.objid;
        this.objsubid = value.objsubid;
        this.refclassid = value.refclassid;
        this.refobjid = value.refobjid;
        this.deptype = value.deptype;
    }

    public PgShdepend(
        Long dbid,
        Long classid,
        Long objid,
        Integer objsubid,
        Long refclassid,
        Long refobjid,
        String deptype
    ) {
        this.dbid = dbid;
        this.classid = classid;
        this.objid = objid;
        this.objsubid = objsubid;
        this.refclassid = refclassid;
        this.refobjid = refobjid;
        this.deptype = deptype;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public Long getDbid() {
        return this.dbid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public Long getClassid() {
        return this.classid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public void setClassid(Long classid) {
        this.classid = classid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public Long getObjid() {
        return this.objid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public void setObjid(Long objid) {
        this.objid = objid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public Integer getObjsubid() {
        return this.objsubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public Long getRefclassid() {
        return this.refclassid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public void setRefclassid(Long refclassid) {
        this.refclassid = refclassid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public Long getRefobjid() {
        return this.refobjid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public void setRefobjid(Long refobjid) {
        this.refobjid = refobjid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public String getDeptype() {
        return this.deptype;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public void setDeptype(String deptype) {
        this.deptype = deptype;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgShdepend other = (PgShdepend) obj;
        if (this.dbid == null) {
            if (other.dbid != null)
                return false;
        }
        else if (!this.dbid.equals(other.dbid))
            return false;
        if (this.classid == null) {
            if (other.classid != null)
                return false;
        }
        else if (!this.classid.equals(other.classid))
            return false;
        if (this.objid == null) {
            if (other.objid != null)
                return false;
        }
        else if (!this.objid.equals(other.objid))
            return false;
        if (this.objsubid == null) {
            if (other.objsubid != null)
                return false;
        }
        else if (!this.objsubid.equals(other.objsubid))
            return false;
        if (this.refclassid == null) {
            if (other.refclassid != null)
                return false;
        }
        else if (!this.refclassid.equals(other.refclassid))
            return false;
        if (this.refobjid == null) {
            if (other.refobjid != null)
                return false;
        }
        else if (!this.refobjid.equals(other.refobjid))
            return false;
        if (this.deptype == null) {
            if (other.deptype != null)
                return false;
        }
        else if (!this.deptype.equals(other.deptype))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.dbid == null) ? 0 : this.dbid.hashCode());
        result = prime * result + ((this.classid == null) ? 0 : this.classid.hashCode());
        result = prime * result + ((this.objid == null) ? 0 : this.objid.hashCode());
        result = prime * result + ((this.objsubid == null) ? 0 : this.objsubid.hashCode());
        result = prime * result + ((this.refclassid == null) ? 0 : this.refclassid.hashCode());
        result = prime * result + ((this.refobjid == null) ? 0 : this.refobjid.hashCode());
        result = prime * result + ((this.deptype == null) ? 0 : this.deptype.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShdepend (");

        sb.append(dbid);
        sb.append(", ").append(classid);
        sb.append(", ").append(objid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(refclassid);
        sb.append(", ").append(refobjid);
        sb.append(", ").append(deptype);

        sb.append(")");
        return sb.toString();
    }
}
