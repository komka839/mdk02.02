package prac7.task4;
import java.util.Arrays;
import java.util.ArrayList;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        int contentLength = (content == null) ? 0 : content.length();

        return "Post{title='" + title + "', content.length='" + contentLength + "', " +
                "tags=" + Arrays.toString(tags) + ", " +
                "comments=" + comments + "}";
    }
}
