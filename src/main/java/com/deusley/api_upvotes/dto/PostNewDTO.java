package com.deusley.api_upvotes.dto;


import com.deusley.api_upvotes.domain.Post;


public class PostNewDTO {

    private Long id;
    private String titulo;
    private String descricao;


    public PostNewDTO() {
    }

    public PostNewDTO(Long id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public PostNewDTO(Post post) {
        id = post.getId();
        titulo = post.getTitulo();
        descricao = post.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}