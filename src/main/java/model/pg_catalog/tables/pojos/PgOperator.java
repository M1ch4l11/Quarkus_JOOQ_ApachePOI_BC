/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOperator implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String oprname;
    private Long oprnamespace;
    private Long oprowner;
    private String oprkind;
    private Boolean oprcanmerge;
    private Boolean oprcanhash;
    private Long oprleft;
    private Long oprright;
    private Long oprresult;
    private Long oprcom;
    private Long oprnegate;
    private String oprcode;
    private String oprrest;
    private String oprjoin;

    public PgOperator() {}

    public PgOperator(PgOperator value) {
        this.oid = value.oid;
        this.oprname = value.oprname;
        this.oprnamespace = value.oprnamespace;
        this.oprowner = value.oprowner;
        this.oprkind = value.oprkind;
        this.oprcanmerge = value.oprcanmerge;
        this.oprcanhash = value.oprcanhash;
        this.oprleft = value.oprleft;
        this.oprright = value.oprright;
        this.oprresult = value.oprresult;
        this.oprcom = value.oprcom;
        this.oprnegate = value.oprnegate;
        this.oprcode = value.oprcode;
        this.oprrest = value.oprrest;
        this.oprjoin = value.oprjoin;
    }

    public PgOperator(
        Long oid,
        String oprname,
        Long oprnamespace,
        Long oprowner,
        String oprkind,
        Boolean oprcanmerge,
        Boolean oprcanhash,
        Long oprleft,
        Long oprright,
        Long oprresult,
        Long oprcom,
        Long oprnegate,
        String oprcode,
        String oprrest,
        String oprjoin
    ) {
        this.oid = oid;
        this.oprname = oprname;
        this.oprnamespace = oprnamespace;
        this.oprowner = oprowner;
        this.oprkind = oprkind;
        this.oprcanmerge = oprcanmerge;
        this.oprcanhash = oprcanhash;
        this.oprleft = oprleft;
        this.oprright = oprright;
        this.oprresult = oprresult;
        this.oprcom = oprcom;
        this.oprnegate = oprnegate;
        this.oprcode = oprcode;
        this.oprrest = oprrest;
        this.oprjoin = oprjoin;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprname</code>.
     */
    public String getOprname() {
        return this.oprname;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprname</code>.
     */
    public void setOprname(String oprname) {
        this.oprname = oprname;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public Long getOprnamespace() {
        return this.oprnamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public void setOprnamespace(Long oprnamespace) {
        this.oprnamespace = oprnamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public Long getOprowner() {
        return this.oprowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public void setOprowner(Long oprowner) {
        this.oprowner = oprowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public String getOprkind() {
        return this.oprkind;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public void setOprkind(String oprkind) {
        this.oprkind = oprkind;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public Boolean getOprcanmerge() {
        return this.oprcanmerge;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public void setOprcanmerge(Boolean oprcanmerge) {
        this.oprcanmerge = oprcanmerge;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public Boolean getOprcanhash() {
        return this.oprcanhash;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public void setOprcanhash(Boolean oprcanhash) {
        this.oprcanhash = oprcanhash;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public Long getOprleft() {
        return this.oprleft;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public void setOprleft(Long oprleft) {
        this.oprleft = oprleft;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprright</code>.
     */
    public Long getOprright() {
        return this.oprright;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprright</code>.
     */
    public void setOprright(Long oprright) {
        this.oprright = oprright;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public Long getOprresult() {
        return this.oprresult;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public void setOprresult(Long oprresult) {
        this.oprresult = oprresult;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public Long getOprcom() {
        return this.oprcom;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public void setOprcom(Long oprcom) {
        this.oprcom = oprcom;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public Long getOprnegate() {
        return this.oprnegate;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public void setOprnegate(Long oprnegate) {
        this.oprnegate = oprnegate;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public String getOprcode() {
        return this.oprcode;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public void setOprcode(String oprcode) {
        this.oprcode = oprcode;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public String getOprrest() {
        return this.oprrest;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public void setOprrest(String oprrest) {
        this.oprrest = oprrest;
    }

    /**
     * Getter for <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public String getOprjoin() {
        return this.oprjoin;
    }

    /**
     * Setter for <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public void setOprjoin(String oprjoin) {
        this.oprjoin = oprjoin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgOperator other = (PgOperator) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.oprname == null) {
            if (other.oprname != null)
                return false;
        }
        else if (!this.oprname.equals(other.oprname))
            return false;
        if (this.oprnamespace == null) {
            if (other.oprnamespace != null)
                return false;
        }
        else if (!this.oprnamespace.equals(other.oprnamespace))
            return false;
        if (this.oprowner == null) {
            if (other.oprowner != null)
                return false;
        }
        else if (!this.oprowner.equals(other.oprowner))
            return false;
        if (this.oprkind == null) {
            if (other.oprkind != null)
                return false;
        }
        else if (!this.oprkind.equals(other.oprkind))
            return false;
        if (this.oprcanmerge == null) {
            if (other.oprcanmerge != null)
                return false;
        }
        else if (!this.oprcanmerge.equals(other.oprcanmerge))
            return false;
        if (this.oprcanhash == null) {
            if (other.oprcanhash != null)
                return false;
        }
        else if (!this.oprcanhash.equals(other.oprcanhash))
            return false;
        if (this.oprleft == null) {
            if (other.oprleft != null)
                return false;
        }
        else if (!this.oprleft.equals(other.oprleft))
            return false;
        if (this.oprright == null) {
            if (other.oprright != null)
                return false;
        }
        else if (!this.oprright.equals(other.oprright))
            return false;
        if (this.oprresult == null) {
            if (other.oprresult != null)
                return false;
        }
        else if (!this.oprresult.equals(other.oprresult))
            return false;
        if (this.oprcom == null) {
            if (other.oprcom != null)
                return false;
        }
        else if (!this.oprcom.equals(other.oprcom))
            return false;
        if (this.oprnegate == null) {
            if (other.oprnegate != null)
                return false;
        }
        else if (!this.oprnegate.equals(other.oprnegate))
            return false;
        if (this.oprcode == null) {
            if (other.oprcode != null)
                return false;
        }
        else if (!this.oprcode.equals(other.oprcode))
            return false;
        if (this.oprrest == null) {
            if (other.oprrest != null)
                return false;
        }
        else if (!this.oprrest.equals(other.oprrest))
            return false;
        if (this.oprjoin == null) {
            if (other.oprjoin != null)
                return false;
        }
        else if (!this.oprjoin.equals(other.oprjoin))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.oprname == null) ? 0 : this.oprname.hashCode());
        result = prime * result + ((this.oprnamespace == null) ? 0 : this.oprnamespace.hashCode());
        result = prime * result + ((this.oprowner == null) ? 0 : this.oprowner.hashCode());
        result = prime * result + ((this.oprkind == null) ? 0 : this.oprkind.hashCode());
        result = prime * result + ((this.oprcanmerge == null) ? 0 : this.oprcanmerge.hashCode());
        result = prime * result + ((this.oprcanhash == null) ? 0 : this.oprcanhash.hashCode());
        result = prime * result + ((this.oprleft == null) ? 0 : this.oprleft.hashCode());
        result = prime * result + ((this.oprright == null) ? 0 : this.oprright.hashCode());
        result = prime * result + ((this.oprresult == null) ? 0 : this.oprresult.hashCode());
        result = prime * result + ((this.oprcom == null) ? 0 : this.oprcom.hashCode());
        result = prime * result + ((this.oprnegate == null) ? 0 : this.oprnegate.hashCode());
        result = prime * result + ((this.oprcode == null) ? 0 : this.oprcode.hashCode());
        result = prime * result + ((this.oprrest == null) ? 0 : this.oprrest.hashCode());
        result = prime * result + ((this.oprjoin == null) ? 0 : this.oprjoin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgOperator (");

        sb.append(oid);
        sb.append(", ").append(oprname);
        sb.append(", ").append(oprnamespace);
        sb.append(", ").append(oprowner);
        sb.append(", ").append(oprkind);
        sb.append(", ").append(oprcanmerge);
        sb.append(", ").append(oprcanhash);
        sb.append(", ").append(oprleft);
        sb.append(", ").append(oprright);
        sb.append(", ").append(oprresult);
        sb.append(", ").append(oprcom);
        sb.append(", ").append(oprnegate);
        sb.append(", ").append(oprcode);
        sb.append(", ").append(oprrest);
        sb.append(", ").append(oprjoin);

        sb.append(")");
        return sb.toString();
    }
}
