package com.deusley.api_upvotes.domain;


import lombok.*;

@ToString
@Builder
@Data
@Setter
@Getter
public class Post {

    private Long id;
    private String titulo;
    private String descricao;
    private Integer curtidas;

    public Post(Long id, String titulo, String descricao, Integer curtidas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curtidas = curtidas;
    }
}
