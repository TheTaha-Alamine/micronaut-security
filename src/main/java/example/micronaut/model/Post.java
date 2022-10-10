package example.micronaut.model;

import com.mongodb.lang.Nullable;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Post {

    @NonNull
    @NotBlank
    private int userId;

    @Nullable
    private String title;

    @Nullable
    private String body;

    public Post(){

    }

    public Post(int userId, @Nullable String title, @Nullable String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public Post setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    public Post setTitle(@Nullable String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getBody() {
        return body;
    }

    public Post setBody(@Nullable String body) {
        this.body = body;
        return this;
    }
}
