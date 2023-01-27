package com.deusley.api_upvotes.services;

import com.deusley.api_upvotes.domain.Post;

import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


@Service
public class PostService {

    @Autowired
    private PostRepository rep;

    @Transactional(readOnly = true)
    public Page<PostDTO> findAll(Pageable pageable) {
        Page<Post> result = rep.findAll(pageable);
        Page<PostDTO> page = result.map(p -> new PostDTO(p));
        return page;

    }

    public Post postar(Post obj) {
        obj.setId(null);
        return rep.save(obj);

    }

    public void curtir(Long id) {
        var post = rep.findById(id).get();

        Integer curtidas = 0;
        if( Objects.nonNull( post.getCurtidas())){
            curtidas = post.getCurtidas() + 1;
        }else{
            curtidas = 1;
        }


        post.setCurtidas(curtidas);
        rep.save(post);
    }


    private void atualizaPostagem(Post updatePost, Post objPost) {
        updatePost.setTitulo(objPost.getTitulo());
        updatePost.setDescricao(objPost.getDescricao());

    }
}