package CustomModels;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Pagination {
    private SearchFilter searchFilter;
    private PaginationFilter paginationFilter;

    public Pagination() {
    }

    public Pagination(SearchFilter searchFilter, PaginationFilter paginationFilter) {
        this.searchFilter = searchFilter;
        this.paginationFilter = paginationFilter;
    }

    public SearchFilter getSearchFilter() {
        return searchFilter;
    }

    public PaginationFilter getPaginationFilter() {
        return paginationFilter;
    }
}
