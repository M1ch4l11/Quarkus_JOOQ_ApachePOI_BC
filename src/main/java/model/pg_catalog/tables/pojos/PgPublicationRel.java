/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPublicationRel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long prpubid;
    private Long prrelid;

    public PgPublicationRel() {}

    public PgPublicationRel(PgPublicationRel value) {
        this.oid = value.oid;
        this.prpubid = value.prpubid;
        this.prrelid = value.prrelid;
    }

    public PgPublicationRel(
        Long oid,
        Long prpubid,
        Long prrelid
    ) {
        this.oid = oid;
        this.prpubid = prpubid;
        this.prrelid = prrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public Long getPrpubid() {
        return this.prpubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public void setPrpubid(Long prpubid) {
        this.prpubid = prpubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public Long getPrrelid() {
        return this.prrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public void setPrrelid(Long prrelid) {
        this.prrelid = prrelid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPublicationRel other = (PgPublicationRel) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.prpubid == null) {
            if (other.prpubid != null)
                return false;
        }
        else if (!this.prpubid.equals(other.prpubid))
            return false;
        if (this.prrelid == null) {
            if (other.prrelid != null)
                return false;
        }
        else if (!this.prrelid.equals(other.prrelid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.prpubid == null) ? 0 : this.prpubid.hashCode());
        result = prime * result + ((this.prrelid == null) ? 0 : this.prrelid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPublicationRel (");

        sb.append(oid);
        sb.append(", ").append(prpubid);
        sb.append(", ").append(prrelid);

        sb.append(")");
        return sb.toString();
    }
}
