package instagramm.domain;

import instagramm.PostApplication;
import instagramm.domain.Posted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Post_table")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private User user;

    @Embedded
    private Photo photo;

    @AttributeOverride(
        name = "date",
        column = @Column(name = "dateDate", nullable = true)
    )
    private Date date;

    @Embedded
    private Likes like;

    @Embedded
    private Tags tag;

    @Embedded
    private Comment comment;

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
