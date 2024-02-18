/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSeclabel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long objoid;
    private Long classoid;
    private Integer objsubid;
    private String provider;
    private String label;

    public PgSeclabel() {}

    public PgSeclabel(PgSeclabel value) {
        this.objoid = value.objoid;
        this.classoid = value.classoid;
        this.objsubid = value.objsubid;
        this.provider = value.provider;
        this.label = value.label;
    }

    public PgSeclabel(
        Long objoid,
        Long classoid,
        Integer objsubid,
        String provider,
        String label
    ) {
        this.objoid = objoid;
        this.classoid = classoid;
        this.objsubid = objsubid;
        this.provider = provider;
        this.label = label;
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public Long getObjoid() {
        return this.objoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public Long getClassoid() {
        return this.classoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public Integer getObjsubid() {
        return this.objsubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.label</code>.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.label</code>.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgSeclabel other = (PgSeclabel) obj;
        if (this.objoid == null) {
            if (other.objoid != null)
                return false;
        }
        else if (!this.objoid.equals(other.objoid))
            return false;
        if (this.classoid == null) {
            if (other.classoid != null)
                return false;
        }
        else if (!this.classoid.equals(other.classoid))
            return false;
        if (this.objsubid == null) {
            if (other.objsubid != null)
                return false;
        }
        else if (!this.objsubid.equals(other.objsubid))
            return false;
        if (this.provider == null) {
            if (other.provider != null)
                return false;
        }
        else if (!this.provider.equals(other.provider))
            return false;
        if (this.label == null) {
            if (other.label != null)
                return false;
        }
        else if (!this.label.equals(other.label))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.objoid == null) ? 0 : this.objoid.hashCode());
        result = prime * result + ((this.classoid == null) ? 0 : this.classoid.hashCode());
        result = prime * result + ((this.objsubid == null) ? 0 : this.objsubid.hashCode());
        result = prime * result + ((this.provider == null) ? 0 : this.provider.hashCode());
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSeclabel (");

        sb.append(objoid);
        sb.append(", ").append(classoid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(provider);
        sb.append(", ").append(label);

        sb.append(")");
        return sb.toString();
    }
}
