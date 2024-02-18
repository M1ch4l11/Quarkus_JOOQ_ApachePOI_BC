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
public class PgEventTrigger implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String evtname;
    private String evtevent;
    private Long evtowner;
    private Long evtfoid;
    private String evtenabled;
    private String[] evttags;

    public PgEventTrigger() {}

    public PgEventTrigger(PgEventTrigger value) {
        this.oid = value.oid;
        this.evtname = value.evtname;
        this.evtevent = value.evtevent;
        this.evtowner = value.evtowner;
        this.evtfoid = value.evtfoid;
        this.evtenabled = value.evtenabled;
        this.evttags = value.evttags;
    }

    public PgEventTrigger(
        Long oid,
        String evtname,
        String evtevent,
        Long evtowner,
        Long evtfoid,
        String evtenabled,
        String[] evttags
    ) {
        this.oid = oid;
        this.evtname = evtname;
        this.evtevent = evtevent;
        this.evtowner = evtowner;
        this.evtfoid = evtfoid;
        this.evtenabled = evtenabled;
        this.evttags = evttags;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public String getEvtname() {
        return this.evtname;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public void setEvtname(String evtname) {
        this.evtname = evtname;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public String getEvtevent() {
        return this.evtevent;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public void setEvtevent(String evtevent) {
        this.evtevent = evtevent;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public Long getEvtowner() {
        return this.evtowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public void setEvtowner(Long evtowner) {
        this.evtowner = evtowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public Long getEvtfoid() {
        return this.evtfoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public void setEvtfoid(Long evtfoid) {
        this.evtfoid = evtfoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public String getEvtenabled() {
        return this.evtenabled;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public void setEvtenabled(String evtenabled) {
        this.evtenabled = evtenabled;
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public String[] getEvttags() {
        return this.evttags;
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public void setEvttags(String[] evttags) {
        this.evttags = evttags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgEventTrigger other = (PgEventTrigger) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.evtname == null) {
            if (other.evtname != null)
                return false;
        }
        else if (!this.evtname.equals(other.evtname))
            return false;
        if (this.evtevent == null) {
            if (other.evtevent != null)
                return false;
        }
        else if (!this.evtevent.equals(other.evtevent))
            return false;
        if (this.evtowner == null) {
            if (other.evtowner != null)
                return false;
        }
        else if (!this.evtowner.equals(other.evtowner))
            return false;
        if (this.evtfoid == null) {
            if (other.evtfoid != null)
                return false;
        }
        else if (!this.evtfoid.equals(other.evtfoid))
            return false;
        if (this.evtenabled == null) {
            if (other.evtenabled != null)
                return false;
        }
        else if (!this.evtenabled.equals(other.evtenabled))
            return false;
        if (this.evttags == null) {
            if (other.evttags != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.evttags, other.evttags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.evtname == null) ? 0 : this.evtname.hashCode());
        result = prime * result + ((this.evtevent == null) ? 0 : this.evtevent.hashCode());
        result = prime * result + ((this.evtowner == null) ? 0 : this.evtowner.hashCode());
        result = prime * result + ((this.evtfoid == null) ? 0 : this.evtfoid.hashCode());
        result = prime * result + ((this.evtenabled == null) ? 0 : this.evtenabled.hashCode());
        result = prime * result + ((this.evttags == null) ? 0 : Arrays.deepHashCode(this.evttags));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgEventTrigger (");

        sb.append(oid);
        sb.append(", ").append(evtname);
        sb.append(", ").append(evtevent);
        sb.append(", ").append(evtowner);
        sb.append(", ").append(evtfoid);
        sb.append(", ").append(evtenabled);
        sb.append(", ").append(Arrays.deepToString(evttags));

        sb.append(")");
        return sb.toString();
    }
}