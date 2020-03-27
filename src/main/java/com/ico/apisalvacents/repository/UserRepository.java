package com.ico.apisalvacents.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ico.apisalvacents.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
