package example.micronaut.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static io.micronaut.http.HttpHeaders.ACCEPT;
import static io.micronaut.http.HttpHeaders.USER_AGENT;

@Client("${clients.placeholder}")
@Header(name = USER_AGENT, value = "Micronaut HTTP client")
@Header(name = ACCEPT, value = "application/json")
public interface JsonPlaceholder {

    @Get("/posts")
    Optional<Map<String, String>> getPosts();

    @Get("/posts/{id}")
    Optional<Map<String, String>> getPostById(int id);
}
