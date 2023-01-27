package com.deusley.api_upvotes.repositories;

import com.deusley.api_upvotes.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {


}
