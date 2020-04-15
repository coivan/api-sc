package com.ico.apisalvacents.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ico.apisalvacents.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
