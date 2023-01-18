package com.deusley.api_upvotes.controllers;

import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.dto.UpvotesDTO;
import com.deusley.api_upvotes.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/curtir")
public class UpvotesController {

    @Autowired
    private PostService service;

    @PostMapping
    public PostDTO curtir(@RequestBody UpvotesDTO upDTO){
        return null;

    }
}
