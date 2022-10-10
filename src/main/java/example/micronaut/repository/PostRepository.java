package example.micronaut.repository;

import example.micronaut.model.Post;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

@MongoRepository
public interface PostRepository extends CrudRepository<PostRepository, Integer> {

    @NotNull
    Post findPostsbyId(@NotNull int Id);
}
