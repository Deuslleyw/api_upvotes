package com.deusley.api_upvotes.dto;


import com.deusley.api_upvotes.domain.Post;


public class PostDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private Integer curtidas;

    public PostDTO() {
    }

    public PostDTO(Long id, String titulo, String descricao, Integer curtidas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curtidas = curtidas;
    }

    public PostDTO(Post post) {
        id = post.getId();
        titulo = post.getTitulo();
        descricao = post.getDescricao();
        curtidas = post.getCurtidas();
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

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }
}