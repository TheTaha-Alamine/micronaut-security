package example.micronaut.service;

import example.micronaut.model.Post;

import java.util.List;

public interface PostService {

    Post getPostsById(int Id);

    Post save(int id);
}
