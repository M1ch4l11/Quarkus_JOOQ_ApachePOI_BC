/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShdescription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long objoid;
    private Long classoid;
    private String description;

    public PgShdescription() {}

    public PgShdescription(PgShdescription value) {
        this.objoid = value.objoid;
        this.classoid = value.classoid;
        this.description = value.description;
    }

    public PgShdescription(
        Long objoid,
        Long classoid,
        String description
    ) {
        this.objoid = objoid;
        this.classoid = classoid;
        this.description = description;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.objoid</code>.
     */
    public Long getObjoid() {
        return this.objoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdescription.objoid</code>.
     */
    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.classoid</code>.
     */
    public Long getClassoid() {
        return this.classoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdescription.classoid</code>.
     */
    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_shdescription.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>pg_catalog.pg_shdescription.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgShdescription other = (PgShdescription) obj;
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
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.objoid == null) ? 0 : this.objoid.hashCode());
        result = prime * result + ((this.classoid == null) ? 0 : this.classoid.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShdescription (");

        sb.append(objoid);
        sb.append(", ").append(classoid);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
