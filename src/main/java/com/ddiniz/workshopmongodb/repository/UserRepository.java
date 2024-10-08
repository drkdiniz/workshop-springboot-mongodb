package com.ddiniz.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ddiniz.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
