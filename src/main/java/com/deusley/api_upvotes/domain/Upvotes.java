package com.deusley.api_upvotes.domain;


public class Upvotes {

    private Post post;
    private Integer value;


    public Upvotes(){}


    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
