package example.micronaut.service;

import example.micronaut.client.JsonPlaceholder;
import example.micronaut.model.Post;
import example.micronaut.repository.PostRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Map;

@Singleton
public class PostServiceImpl implements PostService{

    @Inject
    private PostRepository postRepository;

    @Inject
    private JsonPlaceholder placeholder;


    @Override
    public Post getPostsById(int id) {
        return postRepository.findPostsbyId(id);
    }

    @Override
    public Post save(int id) {
        Map<String, String> posty =  placeholder.getPostById(id)
                .orElseThrow(() -> new RuntimeException("this post is not found"));
        Post post = new Post();
        post.setBody(posty.get("body"))
                .setTitle(posty.get("title"))
                .setUserId(Integer.parseInt(posty.get("userId")));
        return post;
    }
}
