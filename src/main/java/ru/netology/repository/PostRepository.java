package ru.netology.repository;

import ru.netology.model.Post;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

// Stub
public class PostRepository {
    public List<Post> all() {
        if (!all().isEmpty()) {
            return all();
        }
        return Collections.emptyList();
    }

    public Optional<Post> getById(long id) {
        if (getById(id).isPresent()) {
            return getById(id);
        }
        return Optional.empty();
    }

    public Post save(Post post) {
        if (post.getId() == 0) {
            long i = 0;
            all().add(post);
            i++;

        }
        if (post.getId() != 0) {

            if (all().contains(post.getId())) {
                all().set((int) post.getId(), post);

            }
        }
        return post;
    }

    public void removeById(long id) {
        if (getById(id).isPresent())
            all().remove(id);
    }
}
