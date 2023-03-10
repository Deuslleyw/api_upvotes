package com.deusley.api_upvotes.controllers;

import com.deusley.api_upvotes.domain.Post;
import com.deusley.api_upvotes.dto.PostNewDTO;
import com.deusley.api_upvotes.dto.PostDTO;
import com.deusley.api_upvotes.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping (value = "api/v1/postagens")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping
    public Page<PostDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public ResponseEntity<PostNewDTO> postar(@RequestBody Post obj) {
        obj = service.postar(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PatchMapping("/curtir/{id}")
    public ResponseEntity<Void> curtir(@PathVariable Long id) {

        service.curtir(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "edit/{id}")
    public ResponseEntity<Post> update(@PathVariable Long id, @RequestBody Post obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();


    }
}