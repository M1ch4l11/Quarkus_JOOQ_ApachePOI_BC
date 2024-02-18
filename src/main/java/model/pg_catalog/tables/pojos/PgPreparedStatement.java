/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPreparedStatement implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String statement;
    private OffsetDateTime prepareTime;
    private Object[] parameterTypes;
    private Boolean fromSql;
    private Long genericPlans;
    private Long customPlans;

    public PgPreparedStatement() {}

    public PgPreparedStatement(PgPreparedStatement value) {
        this.name = value.name;
        this.statement = value.statement;
        this.prepareTime = value.prepareTime;
        this.parameterTypes = value.parameterTypes;
        this.fromSql = value.fromSql;
        this.genericPlans = value.genericPlans;
        this.customPlans = value.customPlans;
    }

    public PgPreparedStatement(
        String name,
        String statement,
        OffsetDateTime prepareTime,
        Object[] parameterTypes,
        Boolean fromSql,
        Long genericPlans,
        Long customPlans
    ) {
        this.name = name;
        this.statement = statement;
        this.prepareTime = prepareTime;
        this.parameterTypes = parameterTypes;
        this.fromSql = fromSql;
        this.genericPlans = genericPlans;
        this.customPlans = customPlans;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public String getStatement() {
        return this.statement;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public OffsetDateTime getPrepareTime() {
        return this.prepareTime;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public void setPrepareTime(OffsetDateTime prepareTime) {
        this.prepareTime = prepareTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public Object[] getParameterTypes() {
        return this.parameterTypes;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public void setParameterTypes(Object[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public Boolean getFromSql() {
        return this.fromSql;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public void setFromSql(Boolean fromSql) {
        this.fromSql = fromSql;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.generic_plans</code>.
     */
    public Long getGenericPlans() {
        return this.genericPlans;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.generic_plans</code>.
     */
    public void setGenericPlans(Long genericPlans) {
        this.genericPlans = genericPlans;
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.custom_plans</code>.
     */
    public Long getCustomPlans() {
        return this.customPlans;
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.custom_plans</code>.
     */
    public void setCustomPlans(Long customPlans) {
        this.customPlans = customPlans;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPreparedStatement other = (PgPreparedStatement) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.statement == null) {
            if (other.statement != null)
                return false;
        }
        else if (!this.statement.equals(other.statement))
            return false;
        if (this.prepareTime == null) {
            if (other.prepareTime != null)
                return false;
        }
        else if (!this.prepareTime.equals(other.prepareTime))
            return false;
        if (this.parameterTypes == null) {
            if (other.parameterTypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.parameterTypes, other.parameterTypes))
            return false;
        if (this.fromSql == null) {
            if (other.fromSql != null)
                return false;
        }
        else if (!this.fromSql.equals(other.fromSql))
            return false;
        if (this.genericPlans == null) {
            if (other.genericPlans != null)
                return false;
        }
        else if (!this.genericPlans.equals(other.genericPlans))
            return false;
        if (this.customPlans == null) {
            if (other.customPlans != null)
                return false;
        }
        else if (!this.customPlans.equals(other.customPlans))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.statement == null) ? 0 : this.statement.hashCode());
        result = prime * result + ((this.prepareTime == null) ? 0 : this.prepareTime.hashCode());
        result = prime * result + ((this.parameterTypes == null) ? 0 : Arrays.deepHashCode(this.parameterTypes));
        result = prime * result + ((this.fromSql == null) ? 0 : this.fromSql.hashCode());
        result = prime * result + ((this.genericPlans == null) ? 0 : this.genericPlans.hashCode());
        result = prime * result + ((this.customPlans == null) ? 0 : this.customPlans.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPreparedStatement (");

        sb.append(name);
        sb.append(", ").append(statement);
        sb.append(", ").append(prepareTime);
        sb.append(", ").append(Arrays.deepToString(parameterTypes));
        sb.append(", ").append(fromSql);
        sb.append(", ").append(genericPlans);
        sb.append(", ").append(customPlans);

        sb.append(")");
        return sb.toString();
    }
}
