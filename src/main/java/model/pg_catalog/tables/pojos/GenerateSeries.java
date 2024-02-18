/*
 * This file is generated by jOOQ.
 */
package model.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSeries implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer generateSeries;

    public GenerateSeries() {}

    public GenerateSeries(GenerateSeries value) {
        this.generateSeries = value.generateSeries;
    }

    public GenerateSeries(
        Integer generateSeries
    ) {
        this.generateSeries = generateSeries;
    }

    /**
     * Getter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public Integer getGenerateSeries() {
        return this.generateSeries;
    }

    /**
     * Setter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public void setGenerateSeries(Integer generateSeries) {
        this.generateSeries = generateSeries;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GenerateSeries other = (GenerateSeries) obj;
        if (this.generateSeries == null) {
            if (other.generateSeries != null)
                return false;
        }
        else if (!this.generateSeries.equals(other.generateSeries))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.generateSeries == null) ? 0 : this.generateSeries.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GenerateSeries (");

        sb.append(generateSeries);

        sb.append(")");
        return sb.toString();
    }
}