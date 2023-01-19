package com.deusley.api_upvotes.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Embeddable
@Entity
@Table(name = "tb_post")
public class Post {

    @OneToMany(mappedBy = "id.post")
    private Set<Upvotes> upvotes = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 35)
    private String titulo;

    @Column(name = "descricao", length = 380)
    private String descricao;

    @Column(name = "curtidas")
    private Integer curtidas;

    public Post(){}

    public Post(Long id, String titulo, String descricao, Integer curtidas) {
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
    public Set<Upvotes> getUvotes() {
        return upvotes;
}

    public Set<Upvotes> getUpvotes() {
        return upvotes;
    }
}