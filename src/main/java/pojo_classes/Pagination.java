package pojo_classes;

public class Pagination{
    public int page;
    public int perPage;
    public int totalResults;

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "page=" + page +
                ", perPage=" + perPage +
                ", totalResults=" + totalResults +
                '}';
    }

    public Pagination(int page, int perPage, int totalResults) {
        this.page = page;
        this.perPage = perPage;
        this.totalResults = totalResults;
    }

    public Pagination() {
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}