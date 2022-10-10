package example.micronaut.controller;

import example.micronaut.service.PostService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

@Controller("/posts")
@ExecuteOn(TaskExecutors.IO)
public class PostController {

    @Inject
    private PostService postService;

    @Post("/")
    public example.micronaut.model.Post savePost(int id) {
        return postService.save(id);
    }
}
