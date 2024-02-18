/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String tmplname;
    private Long tmplnamespace;
    private String tmplinit;
    private String tmpllexize;

    public PgTsTemplate() {}

    public PgTsTemplate(PgTsTemplate value) {
        this.oid = value.oid;
        this.tmplname = value.tmplname;
        this.tmplnamespace = value.tmplnamespace;
        this.tmplinit = value.tmplinit;
        this.tmpllexize = value.tmpllexize;
    }

    public PgTsTemplate(
        Long oid,
        String tmplname,
        Long tmplnamespace,
        String tmplinit,
        String tmpllexize
    ) {
        this.oid = oid;
        this.tmplname = tmplname;
        this.tmplnamespace = tmplnamespace;
        this.tmplinit = tmplinit;
        this.tmpllexize = tmpllexize;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public String getTmplname() {
        return this.tmplname;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public void setTmplname(String tmplname) {
        this.tmplname = tmplname;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public Long getTmplnamespace() {
        return this.tmplnamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public void setTmplnamespace(Long tmplnamespace) {
        this.tmplnamespace = tmplnamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public String getTmplinit() {
        return this.tmplinit;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public void setTmplinit(String tmplinit) {
        this.tmplinit = tmplinit;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public String getTmpllexize() {
        return this.tmpllexize;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public void setTmpllexize(String tmpllexize) {
        this.tmpllexize = tmpllexize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTsTemplate other = (PgTsTemplate) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.tmplname == null) {
            if (other.tmplname != null)
                return false;
        }
        else if (!this.tmplname.equals(other.tmplname))
            return false;
        if (this.tmplnamespace == null) {
            if (other.tmplnamespace != null)
                return false;
        }
        else if (!this.tmplnamespace.equals(other.tmplnamespace))
            return false;
        if (this.tmplinit == null) {
            if (other.tmplinit != null)
                return false;
        }
        else if (!this.tmplinit.equals(other.tmplinit))
            return false;
        if (this.tmpllexize == null) {
            if (other.tmpllexize != null)
                return false;
        }
        else if (!this.tmpllexize.equals(other.tmpllexize))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.tmplname == null) ? 0 : this.tmplname.hashCode());
        result = prime * result + ((this.tmplnamespace == null) ? 0 : this.tmplnamespace.hashCode());
        result = prime * result + ((this.tmplinit == null) ? 0 : this.tmplinit.hashCode());
        result = prime * result + ((this.tmpllexize == null) ? 0 : this.tmpllexize.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsTemplate (");

        sb.append(oid);
        sb.append(", ").append(tmplname);
        sb.append(", ").append(tmplnamespace);
        sb.append(", ").append(tmplinit);
        sb.append(", ").append(tmpllexize);

        sb.append(")");
        return sb.toString();
    }
}
