/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgExtensionUpdatePaths implements Serializable {

    private static final long serialVersionUID = 1L;

    private String source;
    private String target;
    private String path;

    public PgExtensionUpdatePaths() {}

    public PgExtensionUpdatePaths(PgExtensionUpdatePaths value) {
        this.source = value.source;
        this.target = value.target;
        this.path = value.path;
    }

    public PgExtensionUpdatePaths(
        String source,
        String target,
        String path
    ) {
        this.source = source;
        this.target = target;
        this.path = path;
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgExtensionUpdatePaths other = (PgExtensionUpdatePaths) obj;
        if (this.source == null) {
            if (other.source != null)
                return false;
        }
        else if (!this.source.equals(other.source))
            return false;
        if (this.target == null) {
            if (other.target != null)
                return false;
        }
        else if (!this.target.equals(other.target))
            return false;
        if (this.path == null) {
            if (other.path != null)
                return false;
        }
        else if (!this.path.equals(other.path))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.source == null) ? 0 : this.source.hashCode());
        result = prime * result + ((this.target == null) ? 0 : this.target.hashCode());
        result = prime * result + ((this.path == null) ? 0 : this.path.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgExtensionUpdatePaths (");

        sb.append(source);
        sb.append(", ").append(target);
        sb.append(", ").append(path);

        sb.append(")");
        return sb.toString();
    }
}