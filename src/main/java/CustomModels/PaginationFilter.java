package CustomModels;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PaginationFilter {
    private int currentPage;
    private int totalPage;
    private int rows;

    public PaginationFilter() {
    }

    public PaginationFilter(int currentPage, int totalPage, int rows) {
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.rows = rows;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getRows() {
        return rows;
    }
}
