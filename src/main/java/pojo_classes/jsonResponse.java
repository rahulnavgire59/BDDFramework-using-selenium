package pojo_classes;

public class jsonResponse {
    private  int userId;
    private String title;
    private String body;

    public jsonResponse(int userId, int id, String title, String body) {
        this.userId = userId;
//        this.id = id;
        this.title = title;
        this.body = body;
    }

    public jsonResponse() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "jsonResponse{" +

                "title='" + title + '\'' +
                ",body='" + body + '\'' +
                ",userId=" + userId +'\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
