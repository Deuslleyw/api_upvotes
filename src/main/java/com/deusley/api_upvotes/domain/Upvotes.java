package com.deusley.api_upvotes.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_upvotes")
public class Upvotes {

    @EmbeddedId
    private UpvotesPK id = new UpvotesPK();

    private Integer value;

    public Upvotes(){}


    public void setPost( Post post){
        id.setPost(post);
    }

    public UpvotesPK getId() {
        return id;
    }

    public void setId(UpvotesPK id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
