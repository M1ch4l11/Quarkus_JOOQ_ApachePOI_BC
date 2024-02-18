/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAm implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String amname;
    private String amhandler;
    private String amtype;

    public PgAm() {}

    public PgAm(PgAm value) {
        this.oid = value.oid;
        this.amname = value.amname;
        this.amhandler = value.amhandler;
        this.amtype = value.amtype;
    }

    public PgAm(
        Long oid,
        String amname,
        String amhandler,
        String amtype
    ) {
        this.oid = oid;
        this.amname = amname;
        this.amhandler = amhandler;
        this.amtype = amtype;
    }

    /**
     * Getter for <code>pg_catalog.pg_am.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_am.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amname</code>.
     */
    public String getAmname() {
        return this.amname;
    }

    /**
     * Setter for <code>pg_catalog.pg_am.amname</code>.
     */
    public void setAmname(String amname) {
        this.amname = amname;
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amhandler</code>.
     */
    public String getAmhandler() {
        return this.amhandler;
    }

    /**
     * Setter for <code>pg_catalog.pg_am.amhandler</code>.
     */
    public void setAmhandler(String amhandler) {
        this.amhandler = amhandler;
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amtype</code>.
     */
    public String getAmtype() {
        return this.amtype;
    }

    /**
     * Setter for <code>pg_catalog.pg_am.amtype</code>.
     */
    public void setAmtype(String amtype) {
        this.amtype = amtype;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAm other = (PgAm) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.amname == null) {
            if (other.amname != null)
                return false;
        }
        else if (!this.amname.equals(other.amname))
            return false;
        if (this.amhandler == null) {
            if (other.amhandler != null)
                return false;
        }
        else if (!this.amhandler.equals(other.amhandler))
            return false;
        if (this.amtype == null) {
            if (other.amtype != null)
                return false;
        }
        else if (!this.amtype.equals(other.amtype))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.amname == null) ? 0 : this.amname.hashCode());
        result = prime * result + ((this.amhandler == null) ? 0 : this.amhandler.hashCode());
        result = prime * result + ((this.amtype == null) ? 0 : this.amtype.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAm (");

        sb.append(oid);
        sb.append(", ").append(amname);
        sb.append(", ").append(amhandler);
        sb.append(", ").append(amtype);

        sb.append(")");
        return sb.toString();
    }
}
