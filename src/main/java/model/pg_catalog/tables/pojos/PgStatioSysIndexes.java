/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatioSysIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private Long indexrelid;
    private String schemaname;
    private String relname;
    private String indexrelname;
    private Long idxBlksRead;
    private Long idxBlksHit;

    public PgStatioSysIndexes() {}

    public PgStatioSysIndexes(PgStatioSysIndexes value) {
        this.relid = value.relid;
        this.indexrelid = value.indexrelid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.indexrelname = value.indexrelname;
        this.idxBlksRead = value.idxBlksRead;
        this.idxBlksHit = value.idxBlksHit;
    }

    public PgStatioSysIndexes(
        Long relid,
        Long indexrelid,
        String schemaname,
        String relname,
        String indexrelname,
        Long idxBlksRead,
        Long idxBlksHit
    ) {
        this.relid = relid;
        this.indexrelid = indexrelid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.indexrelname = indexrelname;
        this.idxBlksRead = idxBlksRead;
        this.idxBlksHit = idxBlksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public void setRelid(Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return this.indexrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public void setRelname(String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return this.indexrelname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public Long getIdxBlksRead() {
        return this.idxBlksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public void setIdxBlksRead(Long idxBlksRead) {
        this.idxBlksRead = idxBlksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public Long getIdxBlksHit() {
        return this.idxBlksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(Long idxBlksHit) {
        this.idxBlksHit = idxBlksHit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatioSysIndexes other = (PgStatioSysIndexes) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.indexrelid == null) {
            if (other.indexrelid != null)
                return false;
        }
        else if (!this.indexrelid.equals(other.indexrelid))
            return false;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.relname == null) {
            if (other.relname != null)
                return false;
        }
        else if (!this.relname.equals(other.relname))
            return false;
        if (this.indexrelname == null) {
            if (other.indexrelname != null)
                return false;
        }
        else if (!this.indexrelname.equals(other.indexrelname))
            return false;
        if (this.idxBlksRead == null) {
            if (other.idxBlksRead != null)
                return false;
        }
        else if (!this.idxBlksRead.equals(other.idxBlksRead))
            return false;
        if (this.idxBlksHit == null) {
            if (other.idxBlksHit != null)
                return false;
        }
        else if (!this.idxBlksHit.equals(other.idxBlksHit))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.indexrelid == null) ? 0 : this.indexrelid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.indexrelname == null) ? 0 : this.indexrelname.hashCode());
        result = prime * result + ((this.idxBlksRead == null) ? 0 : this.idxBlksRead.hashCode());
        result = prime * result + ((this.idxBlksHit == null) ? 0 : this.idxBlksHit.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioSysIndexes (");

        sb.append(relid);
        sb.append(", ").append(indexrelid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(indexrelname);
        sb.append(", ").append(idxBlksRead);
        sb.append(", ").append(idxBlksHit);

        sb.append(")");
        return sb.toString();
    }
}
