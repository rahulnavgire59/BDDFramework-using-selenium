package pojo_classes;

public class Jresp {

    public String body;
    public int userId;
        public int id;
        public String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Jresp() {
    }

    @Override
    public String toString() {
        return "Jresp{" +
                "body='" + body + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public Jresp(String body, int userId, int id, String title) {
        this.body = body;
        this.userId = userId;
        this.id = id;
        this.title = title;
    }
}
