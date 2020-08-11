package com.example.mongodemo.travelplan;

import lombok.Data;

@Data
public class TravelPlanRequest {
    private String name;
    private String to;
    private String from;

    public TravelPlanModel toModel(){return TravelPlanModel.builder()
            .from(this.from)
            .to(this.to)
            .name(this.name)
            .build();
    }
}
