package CustomModels;

public class SearchFilter {

    private String columnNameFirst;
    private String columnNameSecond;
    private String firstCondition;
    private String firstConditionValue;

    private String secondCondition;
    private String secondConditionValue;

    public SearchFilter() {
    }

    public SearchFilter(String columnNameFirst, String columnNameSecond, String firstCondition, String firstConditionValue, String secondCondition, String secondConditionValue) {
        this.columnNameFirst = columnNameFirst;
        this.columnNameSecond = columnNameSecond;
        this.firstCondition = firstCondition;
        this.firstConditionValue = firstConditionValue;
        this.secondCondition = secondCondition;
        this.secondConditionValue = secondConditionValue;
    }

    public String getSecondCondition() {
        return secondCondition;
    }

    public String getSecondConditionValue() {
        return secondConditionValue;
    }

    public String getColumnNameFirst() {
        return columnNameFirst;
    }

    public String getColumnNameSecond() {
        return columnNameSecond;
    }

    public String getFirstCondition() {
        return firstCondition;
    }

    public String getFirstConditionValue() {
        return firstConditionValue;
    }
}
