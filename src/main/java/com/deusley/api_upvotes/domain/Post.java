package com.deusley.api_upvotes.domain;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Embeddable
@Entity
@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "id.post")
    private Set<Upvotes> upvotes = new HashSet<>();

    }
