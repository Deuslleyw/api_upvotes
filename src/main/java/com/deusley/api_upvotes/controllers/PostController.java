package com.deusley.api_upvotes.controllers;

import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/postagens")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping
    public Page<PostDTO> findAll(Pageable pageable){
        return service.findAll(pageable);

    }


}
//test = ok