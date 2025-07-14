package pojo_classes;

import java.util.ArrayList;
import java.util.Date;

public class Root{
    public String searchId;
    public Query query;
    public ArrayList<Result> results;
    public Pagination pagination;

    public Root(Date timestamp, Pagination pagination, ArrayList<Result> results, Query query, String searchId) {
        this.timestamp = timestamp;
        this.pagination = pagination;
        this.results = results;
        this.query = query;
        this.searchId = searchId;
    }

    @Override
    public String toString() {
        return "Root{" +
                "searchId='" + searchId + '\'' +
                ", query=" + query +
                ", results=" + results +
                ", pagination=" + pagination +
                ", timestamp=" + timestamp +
                '}';
    }

    public Root() {
    }

    public Date timestamp;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}