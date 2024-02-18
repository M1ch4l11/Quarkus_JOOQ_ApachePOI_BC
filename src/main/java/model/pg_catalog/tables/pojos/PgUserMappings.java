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
public class PgUserMappings implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long umid;
    private Long srvid;
    private String srvname;
    private Long umuser;
    private String usename;
    private String[] umoptions;

    public PgUserMappings() {}

    public PgUserMappings(PgUserMappings value) {
        this.umid = value.umid;
        this.srvid = value.srvid;
        this.srvname = value.srvname;
        this.umuser = value.umuser;
        this.usename = value.usename;
        this.umoptions = value.umoptions;
    }

    public PgUserMappings(
        Long umid,
        Long srvid,
        String srvname,
        Long umuser,
        String usename,
        String[] umoptions
    ) {
        this.umid = umid;
        this.srvid = srvid;
        this.srvname = srvname;
        this.umuser = umuser;
        this.usename = usename;
        this.umoptions = umoptions;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public Long getUmid() {
        return this.umid;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public void setUmid(Long umid) {
        this.umid = umid;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public Long getSrvid() {
        return this.srvid;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public void setSrvid(Long srvid) {
        this.srvid = srvid;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public String getSrvname() {
        return this.srvname;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public Long getUmuser() {
        return this.umuser;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public void setUmuser(Long umuser) {
        this.umuser = umuser;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public String getUsename() {
        return this.usename;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public void setUsename(String usename) {
        this.usename = usename;
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public String[] getUmoptions() {
        return this.umoptions;
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public void setUmoptions(String[] umoptions) {
        this.umoptions = umoptions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgUserMappings other = (PgUserMappings) obj;
        if (this.umid == null) {
            if (other.umid != null)
                return false;
        }
        else if (!this.umid.equals(other.umid))
            return false;
        if (this.srvid == null) {
            if (other.srvid != null)
                return false;
        }
        else if (!this.srvid.equals(other.srvid))
            return false;
        if (this.srvname == null) {
            if (other.srvname != null)
                return false;
        }
        else if (!this.srvname.equals(other.srvname))
            return false;
        if (this.umuser == null) {
            if (other.umuser != null)
                return false;
        }
        else if (!this.umuser.equals(other.umuser))
            return false;
        if (this.usename == null) {
            if (other.usename != null)
                return false;
        }
        else if (!this.usename.equals(other.usename))
            return false;
        if (this.umoptions == null) {
            if (other.umoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.umoptions, other.umoptions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.umid == null) ? 0 : this.umid.hashCode());
        result = prime * result + ((this.srvid == null) ? 0 : this.srvid.hashCode());
        result = prime * result + ((this.srvname == null) ? 0 : this.srvname.hashCode());
        result = prime * result + ((this.umuser == null) ? 0 : this.umuser.hashCode());
        result = prime * result + ((this.usename == null) ? 0 : this.usename.hashCode());
        result = prime * result + ((this.umoptions == null) ? 0 : Arrays.deepHashCode(this.umoptions));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgUserMappings (");

        sb.append(umid);
        sb.append(", ").append(srvid);
        sb.append(", ").append(srvname);
        sb.append(", ").append(umuser);
        sb.append(", ").append(usename);
        sb.append(", ").append(Arrays.deepToString(umoptions));

        sb.append(")");
        return sb.toString();
    }
}
