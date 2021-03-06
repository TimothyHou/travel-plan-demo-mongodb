package com.example.mongodemo.travelplan;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface TravelPlanRepository extends MongoRepository<TravelPlanModel, String> {
}
