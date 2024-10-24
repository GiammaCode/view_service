package io.swagger.repository;

import io.swagger.model.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//this interface allows connections with mongoDB
@Repository
public interface ViewRepository extends MongoRepository<View, Integer> {
}
