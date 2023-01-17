package com.deusley.api_upvotes.domain;


import lombok.*;

import javax.persistence.*;

@Embeddable
@Entity
@ToString
@Builder
@Data
@Setter
@Getter
@Table(name = "tb_posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 35)
    private String titulo;

    @Column(name = "descricao", length = 380)
    private String descricao;

    @Column(name = "curtidas")
    private Integer curtidas;

    public Post(Long id, String titulo, String descricao, Integer curtidas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curtidas = curtidas;
    }
}
