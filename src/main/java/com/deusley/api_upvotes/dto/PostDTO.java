package com.deusley.api_upvotes.dto;


import com.deusley.api_upvotes.domain.Post;
import lombok.*;

@Data
@ToString
@Builder
@Setter
@Getter
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
}