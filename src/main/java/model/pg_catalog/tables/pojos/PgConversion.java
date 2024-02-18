/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgConversion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String conname;
    private Long connamespace;
    private Long conowner;
    private Integer conforencoding;
    private Integer contoencoding;
    private String conproc;
    private Boolean condefault;

    public PgConversion() {}

    public PgConversion(PgConversion value) {
        this.oid = value.oid;
        this.conname = value.conname;
        this.connamespace = value.connamespace;
        this.conowner = value.conowner;
        this.conforencoding = value.conforencoding;
        this.contoencoding = value.contoencoding;
        this.conproc = value.conproc;
        this.condefault = value.condefault;
    }

    public PgConversion(
        Long oid,
        String conname,
        Long connamespace,
        Long conowner,
        Integer conforencoding,
        Integer contoencoding,
        String conproc,
        Boolean condefault
    ) {
        this.oid = oid;
        this.conname = conname;
        this.connamespace = connamespace;
        this.conowner = conowner;
        this.conforencoding = conforencoding;
        this.contoencoding = contoencoding;
        this.conproc = conproc;
        this.condefault = condefault;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public String getConname() {
        return this.conname;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public void setConname(String conname) {
        this.conname = conname;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public Long getConnamespace() {
        return this.connamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public void setConnamespace(Long connamespace) {
        this.connamespace = connamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public Long getConowner() {
        return this.conowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public void setConowner(Long conowner) {
        this.conowner = conowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public Integer getConforencoding() {
        return this.conforencoding;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public void setConforencoding(Integer conforencoding) {
        this.conforencoding = conforencoding;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public Integer getContoencoding() {
        return this.contoencoding;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public void setContoencoding(Integer contoencoding) {
        this.contoencoding = contoencoding;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public String getConproc() {
        return this.conproc;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public void setConproc(String conproc) {
        this.conproc = conproc;
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public Boolean getCondefault() {
        return this.condefault;
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public void setCondefault(Boolean condefault) {
        this.condefault = condefault;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgConversion other = (PgConversion) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.conname == null) {
            if (other.conname != null)
                return false;
        }
        else if (!this.conname.equals(other.conname))
            return false;
        if (this.connamespace == null) {
            if (other.connamespace != null)
                return false;
        }
        else if (!this.connamespace.equals(other.connamespace))
            return false;
        if (this.conowner == null) {
            if (other.conowner != null)
                return false;
        }
        else if (!this.conowner.equals(other.conowner))
            return false;
        if (this.conforencoding == null) {
            if (other.conforencoding != null)
                return false;
        }
        else if (!this.conforencoding.equals(other.conforencoding))
            return false;
        if (this.contoencoding == null) {
            if (other.contoencoding != null)
                return false;
        }
        else if (!this.contoencoding.equals(other.contoencoding))
            return false;
        if (this.conproc == null) {
            if (other.conproc != null)
                return false;
        }
        else if (!this.conproc.equals(other.conproc))
            return false;
        if (this.condefault == null) {
            if (other.condefault != null)
                return false;
        }
        else if (!this.condefault.equals(other.condefault))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.conname == null) ? 0 : this.conname.hashCode());
        result = prime * result + ((this.connamespace == null) ? 0 : this.connamespace.hashCode());
        result = prime * result + ((this.conowner == null) ? 0 : this.conowner.hashCode());
        result = prime * result + ((this.conforencoding == null) ? 0 : this.conforencoding.hashCode());
        result = prime * result + ((this.contoencoding == null) ? 0 : this.contoencoding.hashCode());
        result = prime * result + ((this.conproc == null) ? 0 : this.conproc.hashCode());
        result = prime * result + ((this.condefault == null) ? 0 : this.condefault.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgConversion (");

        sb.append(oid);
        sb.append(", ").append(conname);
        sb.append(", ").append(connamespace);
        sb.append(", ").append(conowner);
        sb.append(", ").append(conforencoding);
        sb.append(", ").append(contoencoding);
        sb.append(", ").append(conproc);
        sb.append(", ").append(condefault);

        sb.append(")");
        return sb.toString();
    }
}
