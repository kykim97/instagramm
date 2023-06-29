package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.PostApplication;
import untitled.domain.Posted;

@Entity
@Table(name = "Post_table")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Photo photo;

    @Embedded
    private Likes likes;

    @Embedded
    private Tags tag;

    @Embedded
    @AttributeOverride(
        name = "comment",
        column = @Column(name = "commentComment", nullable = true)
    )
    private Comment comment;

    @Embedded
    private User user;

    @PostPersist
    public void onPostPersist() {
        Posted posted = new Posted(this);
        posted.publishAfterCommit();
    }

    public static PostRepository repository() {
        PostRepository postRepository = PostApplication.applicationContext.getBean(
            PostRepository.class
        );
        return postRepository;
    }
}
