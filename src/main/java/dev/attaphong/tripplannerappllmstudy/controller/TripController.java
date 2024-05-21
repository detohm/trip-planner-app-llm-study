package dev.attaphong.tripplannerappllmstudy.controller;

import dev.attaphong.tripplannerappllmstudy.dto.PlanRequestDTO;
import dev.attaphong.tripplannerappllmstudy.dto.TripDTO;
import dev.attaphong.tripplannerappllmstudy.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trip")
public class TripController {

    private final TripService tripService;
    TripController(TripService tripService){
        this.tripService = tripService;
    }

    @PostMapping("/plan")
    ResponseEntity<TripDTO> plan(@RequestBody PlanRequestDTO planRequestDTO){
        TripDTO tripDTO = tripService.plan(planRequestDTO);
        return new ResponseEntity<>(tripDTO, HttpStatus.OK);
    }
}
