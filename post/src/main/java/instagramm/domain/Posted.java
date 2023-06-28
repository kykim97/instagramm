package instagramm.domain;

import instagramm.domain.*;
import instagramm.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Posted extends AbstractEvent {

    private Long id;
    private User user;
    private Photo photo;
    private Date date;
    private Likes like;
    private Tags tag;
    private Comment comment;

    public Posted(Post aggregate) {
        super(aggregate);
    }

    public Posted() {
        super();
    }
}
