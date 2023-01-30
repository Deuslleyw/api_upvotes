package com.deusley.api_upvotes.services;

import com.deusley.api_upvotes.domain.Post;

import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.exeptions.DatabaseException;
import com.deusley.api_upvotes.exeptions.ResourceNotFoundException;
import com.deusley.api_upvotes.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
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
        if (Objects.nonNull(post.getCurtidas())) {
            curtidas = post.getCurtidas() + 1;
        } else {
            curtidas = 1;
        }

        post.setCurtidas(curtidas);
        rep.save(post);
    }

    public Post update(Long id, Post obj) {
        try {
            Post entity = rep.getOne(id);
            updateData(entity, obj);
            return rep.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Post entity, Post obj) {

        entity.setTitulo(obj.getTitulo());
        entity.setDescricao(obj.getDescricao());

    }

    public void delete(Long id) {
        try {
            rep.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }

    }
}