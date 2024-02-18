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
public class PgAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long attrelid;
    private String attname;
    private Long atttypid;
    private Integer attstattarget;
    private Short attlen;
    private Short attnum;
    private Integer attndims;
    private Integer attcacheoff;
    private Integer atttypmod;
    private Boolean attbyval;
    private String attalign;
    private String attstorage;
    private String attcompression;
    private Boolean attnotnull;
    private Boolean atthasdef;
    private Boolean atthasmissing;
    private String attidentity;
    private String attgenerated;
    private Boolean attisdropped;
    private Boolean attislocal;
    private Integer attinhcount;
    private Long attcollation;
    private String[] attacl;
    private String[] attoptions;
    private String[] attfdwoptions;
    private Object[] attmissingval;

    public PgAttribute() {}

    public PgAttribute(PgAttribute value) {
        this.attrelid = value.attrelid;
        this.attname = value.attname;
        this.atttypid = value.atttypid;
        this.attstattarget = value.attstattarget;
        this.attlen = value.attlen;
        this.attnum = value.attnum;
        this.attndims = value.attndims;
        this.attcacheoff = value.attcacheoff;
        this.atttypmod = value.atttypmod;
        this.attbyval = value.attbyval;
        this.attalign = value.attalign;
        this.attstorage = value.attstorage;
        this.attcompression = value.attcompression;
        this.attnotnull = value.attnotnull;
        this.atthasdef = value.atthasdef;
        this.atthasmissing = value.atthasmissing;
        this.attidentity = value.attidentity;
        this.attgenerated = value.attgenerated;
        this.attisdropped = value.attisdropped;
        this.attislocal = value.attislocal;
        this.attinhcount = value.attinhcount;
        this.attcollation = value.attcollation;
        this.attacl = value.attacl;
        this.attoptions = value.attoptions;
        this.attfdwoptions = value.attfdwoptions;
        this.attmissingval = value.attmissingval;
    }

    public PgAttribute(
        Long attrelid,
        String attname,
        Long atttypid,
        Integer attstattarget,
        Short attlen,
        Short attnum,
        Integer attndims,
        Integer attcacheoff,
        Integer atttypmod,
        Boolean attbyval,
        String attalign,
        String attstorage,
        String attcompression,
        Boolean attnotnull,
        Boolean atthasdef,
        Boolean atthasmissing,
        String attidentity,
        String attgenerated,
        Boolean attisdropped,
        Boolean attislocal,
        Integer attinhcount,
        Long attcollation,
        String[] attacl,
        String[] attoptions,
        String[] attfdwoptions,
        Object[] attmissingval
    ) {
        this.attrelid = attrelid;
        this.attname = attname;
        this.atttypid = atttypid;
        this.attstattarget = attstattarget;
        this.attlen = attlen;
        this.attnum = attnum;
        this.attndims = attndims;
        this.attcacheoff = attcacheoff;
        this.atttypmod = atttypmod;
        this.attbyval = attbyval;
        this.attalign = attalign;
        this.attstorage = attstorage;
        this.attcompression = attcompression;
        this.attnotnull = attnotnull;
        this.atthasdef = atthasdef;
        this.atthasmissing = atthasmissing;
        this.attidentity = attidentity;
        this.attgenerated = attgenerated;
        this.attisdropped = attisdropped;
        this.attislocal = attislocal;
        this.attinhcount = attinhcount;
        this.attcollation = attcollation;
        this.attacl = attacl;
        this.attoptions = attoptions;
        this.attfdwoptions = attfdwoptions;
        this.attmissingval = attmissingval;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public Long getAttrelid() {
        return this.attrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public void setAttrelid(Long attrelid) {
        this.attrelid = attrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public String getAttname() {
        return this.attname;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public void setAttname(String attname) {
        this.attname = attname;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public Long getAtttypid() {
        return this.atttypid;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public void setAtttypid(Long atttypid) {
        this.atttypid = atttypid;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public Integer getAttstattarget() {
        return this.attstattarget;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public void setAttstattarget(Integer attstattarget) {
        this.attstattarget = attstattarget;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public Short getAttlen() {
        return this.attlen;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public void setAttlen(Short attlen) {
        this.attlen = attlen;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public Short getAttnum() {
        return this.attnum;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public void setAttnum(Short attnum) {
        this.attnum = attnum;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public Integer getAttndims() {
        return this.attndims;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public void setAttndims(Integer attndims) {
        this.attndims = attndims;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public Integer getAttcacheoff() {
        return this.attcacheoff;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public void setAttcacheoff(Integer attcacheoff) {
        this.attcacheoff = attcacheoff;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public Integer getAtttypmod() {
        return this.atttypmod;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public void setAtttypmod(Integer atttypmod) {
        this.atttypmod = atttypmod;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public Boolean getAttbyval() {
        return this.attbyval;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public void setAttbyval(Boolean attbyval) {
        this.attbyval = attbyval;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public String getAttalign() {
        return this.attalign;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public void setAttalign(String attalign) {
        this.attalign = attalign;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public String getAttstorage() {
        return this.attstorage;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public void setAttstorage(String attstorage) {
        this.attstorage = attstorage;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcompression</code>.
     */
    public String getAttcompression() {
        return this.attcompression;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcompression</code>.
     */
    public void setAttcompression(String attcompression) {
        this.attcompression = attcompression;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public Boolean getAttnotnull() {
        return this.attnotnull;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public void setAttnotnull(Boolean attnotnull) {
        this.attnotnull = attnotnull;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public Boolean getAtthasdef() {
        return this.atthasdef;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public void setAtthasdef(Boolean atthasdef) {
        this.atthasdef = atthasdef;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atthasmissing</code>.
     */
    public Boolean getAtthasmissing() {
        return this.atthasmissing;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atthasmissing</code>.
     */
    public void setAtthasmissing(Boolean atthasmissing) {
        this.atthasmissing = atthasmissing;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public String getAttidentity() {
        return this.attidentity;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public void setAttidentity(String attidentity) {
        this.attidentity = attidentity;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attgenerated</code>.
     */
    public String getAttgenerated() {
        return this.attgenerated;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attgenerated</code>.
     */
    public void setAttgenerated(String attgenerated) {
        this.attgenerated = attgenerated;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public Boolean getAttisdropped() {
        return this.attisdropped;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public void setAttisdropped(Boolean attisdropped) {
        this.attisdropped = attisdropped;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public Boolean getAttislocal() {
        return this.attislocal;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public void setAttislocal(Boolean attislocal) {
        this.attislocal = attislocal;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public Integer getAttinhcount() {
        return this.attinhcount;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public void setAttinhcount(Integer attinhcount) {
        this.attinhcount = attinhcount;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public Long getAttcollation() {
        return this.attcollation;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public void setAttcollation(Long attcollation) {
        this.attcollation = attcollation;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public String[] getAttacl() {
        return this.attacl;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public void setAttacl(String[] attacl) {
        this.attacl = attacl;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public String[] getAttoptions() {
        return this.attoptions;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public void setAttoptions(String[] attoptions) {
        this.attoptions = attoptions;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public String[] getAttfdwoptions() {
        return this.attfdwoptions;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public void setAttfdwoptions(String[] attfdwoptions) {
        this.attfdwoptions = attfdwoptions;
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attmissingval</code>.
     */
    public Object[] getAttmissingval() {
        return this.attmissingval;
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attmissingval</code>.
     */
    public void setAttmissingval(Object[] attmissingval) {
        this.attmissingval = attmissingval;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAttribute other = (PgAttribute) obj;
        if (this.attrelid == null) {
            if (other.attrelid != null)
                return false;
        }
        else if (!this.attrelid.equals(other.attrelid))
            return false;
        if (this.attname == null) {
            if (other.attname != null)
                return false;
        }
        else if (!this.attname.equals(other.attname))
            return false;
        if (this.atttypid == null) {
            if (other.atttypid != null)
                return false;
        }
        else if (!this.atttypid.equals(other.atttypid))
            return false;
        if (this.attstattarget == null) {
            if (other.attstattarget != null)
                return false;
        }
        else if (!this.attstattarget.equals(other.attstattarget))
            return false;
        if (this.attlen == null) {
            if (other.attlen != null)
                return false;
        }
        else if (!this.attlen.equals(other.attlen))
            return false;
        if (this.attnum == null) {
            if (other.attnum != null)
                return false;
        }
        else if (!this.attnum.equals(other.attnum))
            return false;
        if (this.attndims == null) {
            if (other.attndims != null)
                return false;
        }
        else if (!this.attndims.equals(other.attndims))
            return false;
        if (this.attcacheoff == null) {
            if (other.attcacheoff != null)
                return false;
        }
        else if (!this.attcacheoff.equals(other.attcacheoff))
            return false;
        if (this.atttypmod == null) {
            if (other.atttypmod != null)
                return false;
        }
        else if (!this.atttypmod.equals(other.atttypmod))
            return false;
        if (this.attbyval == null) {
            if (other.attbyval != null)
                return false;
        }
        else if (!this.attbyval.equals(other.attbyval))
            return false;
        if (this.attalign == null) {
            if (other.attalign != null)
                return false;
        }
        else if (!this.attalign.equals(other.attalign))
            return false;
        if (this.attstorage == null) {
            if (other.attstorage != null)
                return false;
        }
        else if (!this.attstorage.equals(other.attstorage))
            return false;
        if (this.attcompression == null) {
            if (other.attcompression != null)
                return false;
        }
        else if (!this.attcompression.equals(other.attcompression))
            return false;
        if (this.attnotnull == null) {
            if (other.attnotnull != null)
                return false;
        }
        else if (!this.attnotnull.equals(other.attnotnull))
            return false;
        if (this.atthasdef == null) {
            if (other.atthasdef != null)
                return false;
        }
        else if (!this.atthasdef.equals(other.atthasdef))
            return false;
        if (this.atthasmissing == null) {
            if (other.atthasmissing != null)
                return false;
        }
        else if (!this.atthasmissing.equals(other.atthasmissing))
            return false;
        if (this.attidentity == null) {
            if (other.attidentity != null)
                return false;
        }
        else if (!this.attidentity.equals(other.attidentity))
            return false;
        if (this.attgenerated == null) {
            if (other.attgenerated != null)
                return false;
        }
        else if (!this.attgenerated.equals(other.attgenerated))
            return false;
        if (this.attisdropped == null) {
            if (other.attisdropped != null)
                return false;
        }
        else if (!this.attisdropped.equals(other.attisdropped))
            return false;
        if (this.attislocal == null) {
            if (other.attislocal != null)
                return false;
        }
        else if (!this.attislocal.equals(other.attislocal))
            return false;
        if (this.attinhcount == null) {
            if (other.attinhcount != null)
                return false;
        }
        else if (!this.attinhcount.equals(other.attinhcount))
            return false;
        if (this.attcollation == null) {
            if (other.attcollation != null)
                return false;
        }
        else if (!this.attcollation.equals(other.attcollation))
            return false;
        if (this.attacl == null) {
            if (other.attacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.attacl, other.attacl))
            return false;
        if (this.attoptions == null) {
            if (other.attoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.attoptions, other.attoptions))
            return false;
        if (this.attfdwoptions == null) {
            if (other.attfdwoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.attfdwoptions, other.attfdwoptions))
            return false;
        if (this.attmissingval == null) {
            if (other.attmissingval != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.attmissingval, other.attmissingval))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.attrelid == null) ? 0 : this.attrelid.hashCode());
        result = prime * result + ((this.attname == null) ? 0 : this.attname.hashCode());
        result = prime * result + ((this.atttypid == null) ? 0 : this.atttypid.hashCode());
        result = prime * result + ((this.attstattarget == null) ? 0 : this.attstattarget.hashCode());
        result = prime * result + ((this.attlen == null) ? 0 : this.attlen.hashCode());
        result = prime * result + ((this.attnum == null) ? 0 : this.attnum.hashCode());
        result = prime * result + ((this.attndims == null) ? 0 : this.attndims.hashCode());
        result = prime * result + ((this.attcacheoff == null) ? 0 : this.attcacheoff.hashCode());
        result = prime * result + ((this.atttypmod == null) ? 0 : this.atttypmod.hashCode());
        result = prime * result + ((this.attbyval == null) ? 0 : this.attbyval.hashCode());
        result = prime * result + ((this.attalign == null) ? 0 : this.attalign.hashCode());
        result = prime * result + ((this.attstorage == null) ? 0 : this.attstorage.hashCode());
        result = prime * result + ((this.attcompression == null) ? 0 : this.attcompression.hashCode());
        result = prime * result + ((this.attnotnull == null) ? 0 : this.attnotnull.hashCode());
        result = prime * result + ((this.atthasdef == null) ? 0 : this.atthasdef.hashCode());
        result = prime * result + ((this.atthasmissing == null) ? 0 : this.atthasmissing.hashCode());
        result = prime * result + ((this.attidentity == null) ? 0 : this.attidentity.hashCode());
        result = prime * result + ((this.attgenerated == null) ? 0 : this.attgenerated.hashCode());
        result = prime * result + ((this.attisdropped == null) ? 0 : this.attisdropped.hashCode());
        result = prime * result + ((this.attislocal == null) ? 0 : this.attislocal.hashCode());
        result = prime * result + ((this.attinhcount == null) ? 0 : this.attinhcount.hashCode());
        result = prime * result + ((this.attcollation == null) ? 0 : this.attcollation.hashCode());
        result = prime * result + ((this.attacl == null) ? 0 : Arrays.deepHashCode(this.attacl));
        result = prime * result + ((this.attoptions == null) ? 0 : Arrays.deepHashCode(this.attoptions));
        result = prime * result + ((this.attfdwoptions == null) ? 0 : Arrays.deepHashCode(this.attfdwoptions));
        result = prime * result + ((this.attmissingval == null) ? 0 : Arrays.deepHashCode(this.attmissingval));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAttribute (");

        sb.append(attrelid);
        sb.append(", ").append(attname);
        sb.append(", ").append(atttypid);
        sb.append(", ").append(attstattarget);
        sb.append(", ").append(attlen);
        sb.append(", ").append(attnum);
        sb.append(", ").append(attndims);
        sb.append(", ").append(attcacheoff);
        sb.append(", ").append(atttypmod);
        sb.append(", ").append(attbyval);
        sb.append(", ").append(attalign);
        sb.append(", ").append(attstorage);
        sb.append(", ").append(attcompression);
        sb.append(", ").append(attnotnull);
        sb.append(", ").append(atthasdef);
        sb.append(", ").append(atthasmissing);
        sb.append(", ").append(attidentity);
        sb.append(", ").append(attgenerated);
        sb.append(", ").append(attisdropped);
        sb.append(", ").append(attislocal);
        sb.append(", ").append(attinhcount);
        sb.append(", ").append(attcollation);
        sb.append(", ").append(Arrays.deepToString(attacl));
        sb.append(", ").append(Arrays.deepToString(attoptions));
        sb.append(", ").append(Arrays.deepToString(attfdwoptions));
        sb.append(", ").append(Arrays.deepToString(attmissingval));

        sb.append(")");
        return sb.toString();
    }
}
