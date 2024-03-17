package CustomModels;

public class Filter {
    private String columnName;
    private String firstCondition;
    private String firstConditionValue;
    private String secondCondition;
    private String secondConditionValue;

    public Filter() {
    }

    public Filter(String columnName, String firstCondition, String firstConditionValue, String secondCondition, String secondConditionValue) {
        this.columnName = columnName;
        this.firstCondition = firstCondition;
        this.firstConditionValue = firstConditionValue;
        this.secondCondition = secondCondition;
        this.secondConditionValue = secondConditionValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getFirstCondition() {
        return firstCondition;
    }

    public String getFirstConditionValue() {
        return firstConditionValue;
    }

    public String getSecondCondition() {
        return secondCondition;
    }

    public String getSecondConditionValue() {
        return secondConditionValue;
    }
}
