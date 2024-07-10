package com.planner.planner.domain.controller;

import com.planner.planner.domain.entity.TripEntity;
import com.planner.planner.domain.request.TripRequestPayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripController {

    public ResponseEntity<String> createTrip(@RequestBody TripRequestPayload payload) {
        TripEntity newTrip = new TripEntity(payload);
        return ResponseEntity.ok("Trip created");
    }

}
