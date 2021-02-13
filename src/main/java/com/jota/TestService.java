package com.jota;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestService {
    MongoOperations mongoTemplate;

    public TestService(MongoOperations mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public TestEntity create() {
        TestEntity entity = new TestEntity();
        entity.setName(UUID.randomUUID().toString());
        return mongoTemplate.save(entity);
    }
}
