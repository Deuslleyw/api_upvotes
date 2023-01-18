package com.deusley.api_upvotes.repositories;

import com.deusley.api_upvotes.domain.Upvotes;
import com.deusley.api_upvotes.domain.UpvotesPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpvotesRepository extends JpaRepository<Upvotes, UpvotesPK> {

}


