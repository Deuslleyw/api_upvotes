package com.deusley.api_upvotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class UpvotesPK implements Serializable {
    private static final long serialVersionUID= 1L;

    @ManyToOne
    @JoinColumn( name = "upvotes_id")
    private Post post;

    public UpvotesPK(){}

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
