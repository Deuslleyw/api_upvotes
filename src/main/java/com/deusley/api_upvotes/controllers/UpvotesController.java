package com.deusley.api_upvotes.controllers;

import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.dto.UpvotesDTO;
import com.deusley.api_upvotes.services.UpvotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/curtir")
public class UpvotesController {

    @Autowired
    private UpvotesService service;

    @PostMapping
    public PostDTO saveUpvotes(@RequestBody UpvotesDTO dto){

        PostDTO dtoP = service.saveUpvotes(dto);
        return dtoP;
    }
}


