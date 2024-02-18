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
public class PgConstraint implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String conname;
    private Long connamespace;
    private String contype;
    private Boolean condeferrable;
    private Boolean condeferred;
    private Boolean convalidated;
    private Long conrelid;
    private Long contypid;
    private Long conindid;
    private Long conparentid;
    private Long confrelid;
    private String confupdtype;
    private String confdeltype;
    private String confmatchtype;
    private Boolean conislocal;
    private Integer coninhcount;
    private Boolean connoinherit;
    private Short[] conkey;
    private Short[] confkey;
    private Long[] conpfeqop;
    private Long[] conppeqop;
    private Long[] conffeqop;
    private Long[] conexclop;
    private Object conbin;

    public PgConstraint() {}

    public PgConstraint(PgConstraint value) {
        this.oid = value.oid;
        this.conname = value.conname;
        this.connamespace = value.connamespace;
        this.contype = value.contype;
        this.condeferrable = value.condeferrable;
        this.condeferred = value.condeferred;
        this.convalidated = value.convalidated;
        this.conrelid = value.conrelid;
        this.contypid = value.contypid;
        this.conindid = value.conindid;
        this.conparentid = value.conparentid;
        this.confrelid = value.confrelid;
        this.confupdtype = value.confupdtype;
        this.confdeltype = value.confdeltype;
        this.confmatchtype = value.confmatchtype;
        this.conislocal = value.conislocal;
        this.coninhcount = value.coninhcount;
        this.connoinherit = value.connoinherit;
        this.conkey = value.conkey;
        this.confkey = value.confkey;
        this.conpfeqop = value.conpfeqop;
        this.conppeqop = value.conppeqop;
        this.conffeqop = value.conffeqop;
        this.conexclop = value.conexclop;
        this.conbin = value.conbin;
    }

    public PgConstraint(
        Long oid,
        String conname,
        Long connamespace,
        String contype,
        Boolean condeferrable,
        Boolean condeferred,
        Boolean convalidated,
        Long conrelid,
        Long contypid,
        Long conindid,
        Long conparentid,
        Long confrelid,
        String confupdtype,
        String confdeltype,
        String confmatchtype,
        Boolean conislocal,
        Integer coninhcount,
        Boolean connoinherit,
        Short[] conkey,
        Short[] confkey,
        Long[] conpfeqop,
        Long[] conppeqop,
        Long[] conffeqop,
        Long[] conexclop,
        Object conbin
    ) {
        this.oid = oid;
        this.conname = conname;
        this.connamespace = connamespace;
        this.contype = contype;
        this.condeferrable = condeferrable;
        this.condeferred = condeferred;
        this.convalidated = convalidated;
        this.conrelid = conrelid;
        this.contypid = contypid;
        this.conindid = conindid;
        this.conparentid = conparentid;
        this.confrelid = confrelid;
        this.confupdtype = confupdtype;
        this.confdeltype = confdeltype;
        this.confmatchtype = confmatchtype;
        this.conislocal = conislocal;
        this.coninhcount = coninhcount;
        this.connoinherit = connoinherit;
        this.conkey = conkey;
        this.confkey = confkey;
        this.conpfeqop = conpfeqop;
        this.conppeqop = conppeqop;
        this.conffeqop = conffeqop;
        this.conexclop = conexclop;
        this.conbin = conbin;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conname</code>.
     */
    public String getConname() {
        return this.conname;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conname</code>.
     */
    public void setConname(String conname) {
        this.conname = conname;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.connamespace</code>.
     */
    public Long getConnamespace() {
        return this.connamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.connamespace</code>.
     */
    public void setConnamespace(Long connamespace) {
        this.connamespace = connamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.contype</code>.
     */
    public String getContype() {
        return this.contype;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.contype</code>.
     */
    public void setContype(String contype) {
        this.contype = contype;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.condeferrable</code>.
     */
    public Boolean getCondeferrable() {
        return this.condeferrable;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.condeferrable</code>.
     */
    public void setCondeferrable(Boolean condeferrable) {
        this.condeferrable = condeferrable;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.condeferred</code>.
     */
    public Boolean getCondeferred() {
        return this.condeferred;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.condeferred</code>.
     */
    public void setCondeferred(Boolean condeferred) {
        this.condeferred = condeferred;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.convalidated</code>.
     */
    public Boolean getConvalidated() {
        return this.convalidated;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.convalidated</code>.
     */
    public void setConvalidated(Boolean convalidated) {
        this.convalidated = convalidated;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conrelid</code>.
     */
    public Long getConrelid() {
        return this.conrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conrelid</code>.
     */
    public void setConrelid(Long conrelid) {
        this.conrelid = conrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.contypid</code>.
     */
    public Long getContypid() {
        return this.contypid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.contypid</code>.
     */
    public void setContypid(Long contypid) {
        this.contypid = contypid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conindid</code>.
     */
    public Long getConindid() {
        return this.conindid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conindid</code>.
     */
    public void setConindid(Long conindid) {
        this.conindid = conindid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conparentid</code>.
     */
    public Long getConparentid() {
        return this.conparentid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conparentid</code>.
     */
    public void setConparentid(Long conparentid) {
        this.conparentid = conparentid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confrelid</code>.
     */
    public Long getConfrelid() {
        return this.confrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confrelid</code>.
     */
    public void setConfrelid(Long confrelid) {
        this.confrelid = confrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confupdtype</code>.
     */
    public String getConfupdtype() {
        return this.confupdtype;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confupdtype</code>.
     */
    public void setConfupdtype(String confupdtype) {
        this.confupdtype = confupdtype;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confdeltype</code>.
     */
    public String getConfdeltype() {
        return this.confdeltype;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confdeltype</code>.
     */
    public void setConfdeltype(String confdeltype) {
        this.confdeltype = confdeltype;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confmatchtype</code>.
     */
    public String getConfmatchtype() {
        return this.confmatchtype;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confmatchtype</code>.
     */
    public void setConfmatchtype(String confmatchtype) {
        this.confmatchtype = confmatchtype;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conislocal</code>.
     */
    public Boolean getConislocal() {
        return this.conislocal;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conislocal</code>.
     */
    public void setConislocal(Boolean conislocal) {
        this.conislocal = conislocal;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.coninhcount</code>.
     */
    public Integer getConinhcount() {
        return this.coninhcount;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.coninhcount</code>.
     */
    public void setConinhcount(Integer coninhcount) {
        this.coninhcount = coninhcount;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.connoinherit</code>.
     */
    public Boolean getConnoinherit() {
        return this.connoinherit;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.connoinherit</code>.
     */
    public void setConnoinherit(Boolean connoinherit) {
        this.connoinherit = connoinherit;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conkey</code>.
     */
    public Short[] getConkey() {
        return this.conkey;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conkey</code>.
     */
    public void setConkey(Short[] conkey) {
        this.conkey = conkey;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confkey</code>.
     */
    public Short[] getConfkey() {
        return this.confkey;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confkey</code>.
     */
    public void setConfkey(Short[] confkey) {
        this.confkey = confkey;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conpfeqop</code>.
     */
    public Long[] getConpfeqop() {
        return this.conpfeqop;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conpfeqop</code>.
     */
    public void setConpfeqop(Long[] conpfeqop) {
        this.conpfeqop = conpfeqop;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conppeqop</code>.
     */
    public Long[] getConppeqop() {
        return this.conppeqop;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conppeqop</code>.
     */
    public void setConppeqop(Long[] conppeqop) {
        this.conppeqop = conppeqop;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conffeqop</code>.
     */
    public Long[] getConffeqop() {
        return this.conffeqop;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conffeqop</code>.
     */
    public void setConffeqop(Long[] conffeqop) {
        this.conffeqop = conffeqop;
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conexclop</code>.
     */
    public Long[] getConexclop() {
        return this.conexclop;
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conexclop</code>.
     */
    public void setConexclop(Long[] conexclop) {
        this.conexclop = conexclop;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getConbin() {
        return this.conbin;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setConbin(Object conbin) {
        this.conbin = conbin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgConstraint other = (PgConstraint) obj;
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
        if (this.contype == null) {
            if (other.contype != null)
                return false;
        }
        else if (!this.contype.equals(other.contype))
            return false;
        if (this.condeferrable == null) {
            if (other.condeferrable != null)
                return false;
        }
        else if (!this.condeferrable.equals(other.condeferrable))
            return false;
        if (this.condeferred == null) {
            if (other.condeferred != null)
                return false;
        }
        else if (!this.condeferred.equals(other.condeferred))
            return false;
        if (this.convalidated == null) {
            if (other.convalidated != null)
                return false;
        }
        else if (!this.convalidated.equals(other.convalidated))
            return false;
        if (this.conrelid == null) {
            if (other.conrelid != null)
                return false;
        }
        else if (!this.conrelid.equals(other.conrelid))
            return false;
        if (this.contypid == null) {
            if (other.contypid != null)
                return false;
        }
        else if (!this.contypid.equals(other.contypid))
            return false;
        if (this.conindid == null) {
            if (other.conindid != null)
                return false;
        }
        else if (!this.conindid.equals(other.conindid))
            return false;
        if (this.conparentid == null) {
            if (other.conparentid != null)
                return false;
        }
        else if (!this.conparentid.equals(other.conparentid))
            return false;
        if (this.confrelid == null) {
            if (other.confrelid != null)
                return false;
        }
        else if (!this.confrelid.equals(other.confrelid))
            return false;
        if (this.confupdtype == null) {
            if (other.confupdtype != null)
                return false;
        }
        else if (!this.confupdtype.equals(other.confupdtype))
            return false;
        if (this.confdeltype == null) {
            if (other.confdeltype != null)
                return false;
        }
        else if (!this.confdeltype.equals(other.confdeltype))
            return false;
        if (this.confmatchtype == null) {
            if (other.confmatchtype != null)
                return false;
        }
        else if (!this.confmatchtype.equals(other.confmatchtype))
            return false;
        if (this.conislocal == null) {
            if (other.conislocal != null)
                return false;
        }
        else if (!this.conislocal.equals(other.conislocal))
            return false;
        if (this.coninhcount == null) {
            if (other.coninhcount != null)
                return false;
        }
        else if (!this.coninhcount.equals(other.coninhcount))
            return false;
        if (this.connoinherit == null) {
            if (other.connoinherit != null)
                return false;
        }
        else if (!this.connoinherit.equals(other.connoinherit))
            return false;
        if (this.conkey == null) {
            if (other.conkey != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.conkey, other.conkey))
            return false;
        if (this.confkey == null) {
            if (other.confkey != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.confkey, other.confkey))
            return false;
        if (this.conpfeqop == null) {
            if (other.conpfeqop != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.conpfeqop, other.conpfeqop))
            return false;
        if (this.conppeqop == null) {
            if (other.conppeqop != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.conppeqop, other.conppeqop))
            return false;
        if (this.conffeqop == null) {
            if (other.conffeqop != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.conffeqop, other.conffeqop))
            return false;
        if (this.conexclop == null) {
            if (other.conexclop != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.conexclop, other.conexclop))
            return false;
        if (this.conbin == null) {
            if (other.conbin != null)
                return false;
        }
        else if (!this.conbin.equals(other.conbin))
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
        result = prime * result + ((this.contype == null) ? 0 : this.contype.hashCode());
        result = prime * result + ((this.condeferrable == null) ? 0 : this.condeferrable.hashCode());
        result = prime * result + ((this.condeferred == null) ? 0 : this.condeferred.hashCode());
        result = prime * result + ((this.convalidated == null) ? 0 : this.convalidated.hashCode());
        result = prime * result + ((this.conrelid == null) ? 0 : this.conrelid.hashCode());
        result = prime * result + ((this.contypid == null) ? 0 : this.contypid.hashCode());
        result = prime * result + ((this.conindid == null) ? 0 : this.conindid.hashCode());
        result = prime * result + ((this.conparentid == null) ? 0 : this.conparentid.hashCode());
        result = prime * result + ((this.confrelid == null) ? 0 : this.confrelid.hashCode());
        result = prime * result + ((this.confupdtype == null) ? 0 : this.confupdtype.hashCode());
        result = prime * result + ((this.confdeltype == null) ? 0 : this.confdeltype.hashCode());
        result = prime * result + ((this.confmatchtype == null) ? 0 : this.confmatchtype.hashCode());
        result = prime * result + ((this.conislocal == null) ? 0 : this.conislocal.hashCode());
        result = prime * result + ((this.coninhcount == null) ? 0 : this.coninhcount.hashCode());
        result = prime * result + ((this.connoinherit == null) ? 0 : this.connoinherit.hashCode());
        result = prime * result + ((this.conkey == null) ? 0 : Arrays.deepHashCode(this.conkey));
        result = prime * result + ((this.confkey == null) ? 0 : Arrays.deepHashCode(this.confkey));
        result = prime * result + ((this.conpfeqop == null) ? 0 : Arrays.deepHashCode(this.conpfeqop));
        result = prime * result + ((this.conppeqop == null) ? 0 : Arrays.deepHashCode(this.conppeqop));
        result = prime * result + ((this.conffeqop == null) ? 0 : Arrays.deepHashCode(this.conffeqop));
        result = prime * result + ((this.conexclop == null) ? 0 : Arrays.deepHashCode(this.conexclop));
        result = prime * result + ((this.conbin == null) ? 0 : this.conbin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgConstraint (");

        sb.append(oid);
        sb.append(", ").append(conname);
        sb.append(", ").append(connamespace);
        sb.append(", ").append(contype);
        sb.append(", ").append(condeferrable);
        sb.append(", ").append(condeferred);
        sb.append(", ").append(convalidated);
        sb.append(", ").append(conrelid);
        sb.append(", ").append(contypid);
        sb.append(", ").append(conindid);
        sb.append(", ").append(conparentid);
        sb.append(", ").append(confrelid);
        sb.append(", ").append(confupdtype);
        sb.append(", ").append(confdeltype);
        sb.append(", ").append(confmatchtype);
        sb.append(", ").append(conislocal);
        sb.append(", ").append(coninhcount);
        sb.append(", ").append(connoinherit);
        sb.append(", ").append(Arrays.deepToString(conkey));
        sb.append(", ").append(Arrays.deepToString(confkey));
        sb.append(", ").append(Arrays.deepToString(conpfeqop));
        sb.append(", ").append(Arrays.deepToString(conppeqop));
        sb.append(", ").append(Arrays.deepToString(conffeqop));
        sb.append(", ").append(Arrays.deepToString(conexclop));
        sb.append(", ").append(conbin);

        sb.append(")");
        return sb.toString();
    }
}
