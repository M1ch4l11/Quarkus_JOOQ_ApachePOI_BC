/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShseclabel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long objoid;
    private Long classoid;
    private String provider;
    private String label;

    public PgShseclabel() {}

    public PgShseclabel(PgShseclabel value) {
        this.objoid = value.objoid;
        this.classoid = value.classoid;
        this.provider = value.provider;
        this.label = value.label;
    }

    public PgShseclabel(
        Long objoid,
        Long classoid,
        String provider,
        String label
    ) {
        this.objoid = objoid;
        this.classoid = classoid;
        this.provider = provider;
        this.label = label;
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public Long getObjoid() {
        return this.objoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public Long getClassoid() {
        return this.classoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Getter for <code>pg_catalog.pg_shseclabel.label</code>.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for <code>pg_catalog.pg_shseclabel.label</code>.
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
        final PgShseclabel other = (PgShseclabel) obj;
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
        result = prime * result + ((this.provider == null) ? 0 : this.provider.hashCode());
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShseclabel (");

        sb.append(objoid);
        sb.append(", ").append(classoid);
        sb.append(", ").append(provider);
        sb.append(", ").append(label);

        sb.append(")");
        return sb.toString();
    }
}
