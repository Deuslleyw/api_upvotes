package com.deusley.api_upvotes.services;

import com.deusley.api_upvotes.domain.Post;
import com.deusley.api_upvotes.domain.Upvotes;
import com.deusley.api_upvotes.dto.PostDTO;
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
    private UpvotesRepository upvotesRepository;

    @Transactional
    public PostDTO saveUpvotes(UpvotesDTO dto){



        Post post = rep.findById(dto.getPostId()).get();

        Upvotes upvotes = new Upvotes();
        upvotes.setPost(post);
        upvotes.setValue(dto.getCurtidas());

        upvotes = upvotesRepository.saveAndFlush(upvotes);

        double sum = 0.0;
        for(Upvotes upvt : post.getUpvotes()) {
            sum = sum + upvt.getValue();
        }

        Integer avg = (int) (sum / post.getUpvotes().size());
        post.setCurtidas(avg);

        post = rep.save(post);

            return new PostDTO(post);
        }}