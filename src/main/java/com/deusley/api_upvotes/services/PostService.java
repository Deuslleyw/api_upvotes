package com.deusley.api_upvotes.services;

import com.deusley.api_upvotes.domain.Post;
import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository rep;

    @Transactional(readOnly = true)
    public Page<PostDTO> findAll(Pageable pageable) {
        Page<Post> result = rep.findAll(pageable);
        Page<PostDTO> page = result.map( p -> new PostDTO(p));

        return page;


    }


}