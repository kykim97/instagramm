package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostRepository
    extends PagingAndSortingRepository<Post, Long> {}
