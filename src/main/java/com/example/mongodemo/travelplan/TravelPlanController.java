package com.example.mongodemo.travelplan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class TravelPlanController {

    private final TravelPlanService travelPlanService;

    public TravelPlanController(TravelPlanService travelPlanService){this.travelPlanService = travelPlanService;}

    @PostMapping("/travelPlan")
    public ResponseEntity addTravelPlan(@RequestBody TravelPlanRequest request){
        log.info("Request: {}", request);
        travelPlanService.save(request.toModel());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getPlans")
    public List<TravelPlanModel> getAllModels(){return travelPlanService.findAll();}

}
