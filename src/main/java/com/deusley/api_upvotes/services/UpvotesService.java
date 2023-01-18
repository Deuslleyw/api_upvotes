package com.deusley.api_upvotes.services;

import com.deusley.api_upvotes.domain.Post;
import com.deusley.api_upvotes.domain.Upvotes;
import com.deusley.api_upvotes.dto.UpvotesDTO;
import com.deusley.api_upvotes.repositories.PostRepository;
import com.deusley.api_upvotes.repositories.UpvotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UpvotesService {

    @Autowired
    private PostRepository rep;

    @Autowired
    private UpvotesRepository uprep;

    @Transactional
    public void curtir(UpvotesDTO updto){

        Post post = rep.findById(updto.getPostId()).get();

        Upvotes upvotes = new Upvotes();
        upvotes.setPost(post);
        upvotes.setValue(updto.getCurtidas());


        upvotes = uprep.save(upvotes);


        }

    }