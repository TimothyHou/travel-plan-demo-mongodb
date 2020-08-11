package com.example.mongodemo.travelplan;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelPlanService {
    private final TravelPlanRepository travelPlanRepository;

    public TravelPlanService(TravelPlanRepository travelPlanRepository){this.travelPlanRepository = travelPlanRepository;}

    public TravelPlanModel save(TravelPlanModel travelPlanModel){return travelPlanRepository.save(travelPlanModel);}

    public List<TravelPlanModel> findAll() {return travelPlanRepository.findAll();}
}
