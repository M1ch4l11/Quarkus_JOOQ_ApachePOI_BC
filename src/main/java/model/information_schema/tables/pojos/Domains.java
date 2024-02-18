/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains implements Serializable {

    private static final long serialVersionUID = 1L;

    private String domainCatalog;
    private String domainSchema;
    private String domainName;
    private String dataType;
    private Integer characterMaximumLength;
    private Integer characterOctetLength;
    private String characterSetCatalog;
    private String characterSetSchema;
    private String characterSetName;
    private String collationCatalog;
    private String collationSchema;
    private String collationName;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String intervalType;
    private Integer intervalPrecision;
    private String domainDefault;
    private String udtCatalog;
    private String udtSchema;
    private String udtName;
    private String scopeCatalog;
    private String scopeSchema;
    private String scopeName;
    private Integer maximumCardinality;
    private String dtdIdentifier;

    public Domains() {}

    public Domains(Domains value) {
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.domainDefault = value.domainDefault;
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.scopeCatalog = value.scopeCatalog;
        this.scopeSchema = value.scopeSchema;
        this.scopeName = value.scopeName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
    }

    public Domains(
        String domainCatalog,
        String domainSchema,
        String domainName,
        String dataType,
        Integer characterMaximumLength,
        Integer characterOctetLength,
        String characterSetCatalog,
        String characterSetSchema,
        String characterSetName,
        String collationCatalog,
        String collationSchema,
        String collationName,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String intervalType,
        Integer intervalPrecision,
        String domainDefault,
        String udtCatalog,
        String udtSchema,
        String udtName,
        String scopeCatalog,
        String scopeSchema,
        String scopeName,
        Integer maximumCardinality,
        String dtdIdentifier
    ) {
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.domainDefault = domainDefault;
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeName = scopeName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
    }

    /**
     * Getter for <code>information_schema.domains.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    /**
     * Setter for <code>information_schema.domains.domain_catalog</code>.
     */
    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    /**
     * Getter for <code>information_schema.domains.domain_schema</code>.
     */
    public String getDomainSchema() {
        return this.domainSchema;
    }

    /**
     * Setter for <code>information_schema.domains.domain_schema</code>.
     */
    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    /**
     * Getter for <code>information_schema.domains.domain_name</code>.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Setter for <code>information_schema.domains.domain_name</code>.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Getter for <code>information_schema.domains.data_type</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for <code>information_schema.domains.data_type</code>.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Setter for
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    /**
     * Getter for
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Setter for
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    /**
     * Getter for <code>information_schema.domains.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Setter for <code>information_schema.domains.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    /**
     * Getter for <code>information_schema.domains.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Setter for <code>information_schema.domains.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    /**
     * Getter for <code>information_schema.domains.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Setter for <code>information_schema.domains.character_set_name</code>.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * Getter for <code>information_schema.domains.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Setter for <code>information_schema.domains.collation_catalog</code>.
     */
    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    /**
     * Getter for <code>information_schema.domains.collation_schema</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Setter for <code>information_schema.domains.collation_schema</code>.
     */
    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    /**
     * Getter for <code>information_schema.domains.collation_name</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Setter for <code>information_schema.domains.collation_name</code>.
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * Getter for <code>information_schema.domains.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Setter for <code>information_schema.domains.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * Getter for
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Setter for
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    /**
     * Getter for <code>information_schema.domains.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Setter for <code>information_schema.domains.numeric_scale</code>.
     */
    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * Getter for <code>information_schema.domains.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Setter for <code>information_schema.domains.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    /**
     * Getter for <code>information_schema.domains.interval_type</code>.
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Setter for <code>information_schema.domains.interval_type</code>.
     */
    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    /**
     * Getter for <code>information_schema.domains.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Setter for <code>information_schema.domains.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    /**
     * Getter for <code>information_schema.domains.domain_default</code>.
     */
    public String getDomainDefault() {
        return this.domainDefault;
    }

    /**
     * Setter for <code>information_schema.domains.domain_default</code>.
     */
    public void setDomainDefault(String domainDefault) {
        this.domainDefault = domainDefault;
    }

    /**
     * Getter for <code>information_schema.domains.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    /**
     * Setter for <code>information_schema.domains.udt_catalog</code>.
     */
    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    /**
     * Getter for <code>information_schema.domains.udt_schema</code>.
     */
    public String getUdtSchema() {
        return this.udtSchema;
    }

    /**
     * Setter for <code>information_schema.domains.udt_schema</code>.
     */
    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    /**
     * Getter for <code>information_schema.domains.udt_name</code>.
     */
    public String getUdtName() {
        return this.udtName;
    }

    /**
     * Setter for <code>information_schema.domains.udt_name</code>.
     */
    public void setUdtName(String udtName) {
        this.udtName = udtName;
    }

    /**
     * Getter for <code>information_schema.domains.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return this.scopeCatalog;
    }

    /**
     * Setter for <code>information_schema.domains.scope_catalog</code>.
     */
    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    /**
     * Getter for <code>information_schema.domains.scope_schema</code>.
     */
    public String getScopeSchema() {
        return this.scopeSchema;
    }

    /**
     * Setter for <code>information_schema.domains.scope_schema</code>.
     */
    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    /**
     * Getter for <code>information_schema.domains.scope_name</code>.
     */
    public String getScopeName() {
        return this.scopeName;
    }

    /**
     * Setter for <code>information_schema.domains.scope_name</code>.
     */
    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * Getter for <code>information_schema.domains.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Setter for <code>information_schema.domains.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    /**
     * Getter for <code>information_schema.domains.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Setter for <code>information_schema.domains.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Domains other = (Domains) obj;
        if (this.domainCatalog == null) {
            if (other.domainCatalog != null)
                return false;
        }
        else if (!this.domainCatalog.equals(other.domainCatalog))
            return false;
        if (this.domainSchema == null) {
            if (other.domainSchema != null)
                return false;
        }
        else if (!this.domainSchema.equals(other.domainSchema))
            return false;
        if (this.domainName == null) {
            if (other.domainName != null)
                return false;
        }
        else if (!this.domainName.equals(other.domainName))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.characterMaximumLength == null) {
            if (other.characterMaximumLength != null)
                return false;
        }
        else if (!this.characterMaximumLength.equals(other.characterMaximumLength))
            return false;
        if (this.characterOctetLength == null) {
            if (other.characterOctetLength != null)
                return false;
        }
        else if (!this.characterOctetLength.equals(other.characterOctetLength))
            return false;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.datetimePrecision == null) {
            if (other.datetimePrecision != null)
                return false;
        }
        else if (!this.datetimePrecision.equals(other.datetimePrecision))
            return false;
        if (this.intervalType == null) {
            if (other.intervalType != null)
                return false;
        }
        else if (!this.intervalType.equals(other.intervalType))
            return false;
        if (this.intervalPrecision == null) {
            if (other.intervalPrecision != null)
                return false;
        }
        else if (!this.intervalPrecision.equals(other.intervalPrecision))
            return false;
        if (this.domainDefault == null) {
            if (other.domainDefault != null)
                return false;
        }
        else if (!this.domainDefault.equals(other.domainDefault))
            return false;
        if (this.udtCatalog == null) {
            if (other.udtCatalog != null)
                return false;
        }
        else if (!this.udtCatalog.equals(other.udtCatalog))
            return false;
        if (this.udtSchema == null) {
            if (other.udtSchema != null)
                return false;
        }
        else if (!this.udtSchema.equals(other.udtSchema))
            return false;
        if (this.udtName == null) {
            if (other.udtName != null)
                return false;
        }
        else if (!this.udtName.equals(other.udtName))
            return false;
        if (this.scopeCatalog == null) {
            if (other.scopeCatalog != null)
                return false;
        }
        else if (!this.scopeCatalog.equals(other.scopeCatalog))
            return false;
        if (this.scopeSchema == null) {
            if (other.scopeSchema != null)
                return false;
        }
        else if (!this.scopeSchema.equals(other.scopeSchema))
            return false;
        if (this.scopeName == null) {
            if (other.scopeName != null)
                return false;
        }
        else if (!this.scopeName.equals(other.scopeName))
            return false;
        if (this.maximumCardinality == null) {
            if (other.maximumCardinality != null)
                return false;
        }
        else if (!this.maximumCardinality.equals(other.maximumCardinality))
            return false;
        if (this.dtdIdentifier == null) {
            if (other.dtdIdentifier != null)
                return false;
        }
        else if (!this.dtdIdentifier.equals(other.dtdIdentifier))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.domainCatalog == null) ? 0 : this.domainCatalog.hashCode());
        result = prime * result + ((this.domainSchema == null) ? 0 : this.domainSchema.hashCode());
        result = prime * result + ((this.domainName == null) ? 0 : this.domainName.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.characterMaximumLength == null) ? 0 : this.characterMaximumLength.hashCode());
        result = prime * result + ((this.characterOctetLength == null) ? 0 : this.characterOctetLength.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.datetimePrecision == null) ? 0 : this.datetimePrecision.hashCode());
        result = prime * result + ((this.intervalType == null) ? 0 : this.intervalType.hashCode());
        result = prime * result + ((this.intervalPrecision == null) ? 0 : this.intervalPrecision.hashCode());
        result = prime * result + ((this.domainDefault == null) ? 0 : this.domainDefault.hashCode());
        result = prime * result + ((this.udtCatalog == null) ? 0 : this.udtCatalog.hashCode());
        result = prime * result + ((this.udtSchema == null) ? 0 : this.udtSchema.hashCode());
        result = prime * result + ((this.udtName == null) ? 0 : this.udtName.hashCode());
        result = prime * result + ((this.scopeCatalog == null) ? 0 : this.scopeCatalog.hashCode());
        result = prime * result + ((this.scopeSchema == null) ? 0 : this.scopeSchema.hashCode());
        result = prime * result + ((this.scopeName == null) ? 0 : this.scopeName.hashCode());
        result = prime * result + ((this.maximumCardinality == null) ? 0 : this.maximumCardinality.hashCode());
        result = prime * result + ((this.dtdIdentifier == null) ? 0 : this.dtdIdentifier.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Domains (");

        sb.append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(domainDefault);
        sb.append(", ").append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(scopeCatalog);
        sb.append(", ").append(scopeSchema);
        sb.append(", ").append(scopeName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);

        sb.append(")");
        return sb.toString();
    }
}