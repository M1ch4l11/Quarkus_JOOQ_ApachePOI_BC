/*
 * This file is generated by jOOQ.
 */
package model.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqlImplementationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String implementationInfoId;
    private String implementationInfoName;
    private Integer integerValue;
    private String characterValue;
    private String comments;

    public SqlImplementationInfo() {}

    public SqlImplementationInfo(SqlImplementationInfo value) {
        this.implementationInfoId = value.implementationInfoId;
        this.implementationInfoName = value.implementationInfoName;
        this.integerValue = value.integerValue;
        this.characterValue = value.characterValue;
        this.comments = value.comments;
    }

    public SqlImplementationInfo(
        String implementationInfoId,
        String implementationInfoName,
        Integer integerValue,
        String characterValue,
        String comments
    ) {
        this.implementationInfoId = implementationInfoId;
        this.implementationInfoName = implementationInfoName;
        this.integerValue = integerValue;
        this.characterValue = characterValue;
        this.comments = comments;
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public String getImplementationInfoId() {
        return this.implementationInfoId;
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public void setImplementationInfoId(String implementationInfoId) {
        this.implementationInfoId = implementationInfoId;
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public String getImplementationInfoName() {
        return this.implementationInfoName;
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public void setImplementationInfoName(String implementationInfoName) {
        this.implementationInfoName = implementationInfoName;
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public String getCharacterValue() {
        return this.characterValue;
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public void setCharacterValue(String characterValue) {
        this.characterValue = characterValue;
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SqlImplementationInfo other = (SqlImplementationInfo) obj;
        if (this.implementationInfoId == null) {
            if (other.implementationInfoId != null)
                return false;
        }
        else if (!this.implementationInfoId.equals(other.implementationInfoId))
            return false;
        if (this.implementationInfoName == null) {
            if (other.implementationInfoName != null)
                return false;
        }
        else if (!this.implementationInfoName.equals(other.implementationInfoName))
            return false;
        if (this.integerValue == null) {
            if (other.integerValue != null)
                return false;
        }
        else if (!this.integerValue.equals(other.integerValue))
            return false;
        if (this.characterValue == null) {
            if (other.characterValue != null)
                return false;
        }
        else if (!this.characterValue.equals(other.characterValue))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.implementationInfoId == null) ? 0 : this.implementationInfoId.hashCode());
        result = prime * result + ((this.implementationInfoName == null) ? 0 : this.implementationInfoName.hashCode());
        result = prime * result + ((this.integerValue == null) ? 0 : this.integerValue.hashCode());
        result = prime * result + ((this.characterValue == null) ? 0 : this.characterValue.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlImplementationInfo (");

        sb.append(implementationInfoId);
        sb.append(", ").append(implementationInfoName);
        sb.append(", ").append(integerValue);
        sb.append(", ").append(characterValue);
        sb.append(", ").append(comments);

        sb.append(")");
        return sb.toString();
    }
}
