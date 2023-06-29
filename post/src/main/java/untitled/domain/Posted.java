package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Posted extends AbstractEvent {

    private Long id;
    private Photo photo;
    private Likes likes;
    private Tags tag;
    private Comment comment;
    private User user;

    public Posted(Post aggregate) {
        super(aggregate);
    }

    public Posted() {
        super();
    }
}
