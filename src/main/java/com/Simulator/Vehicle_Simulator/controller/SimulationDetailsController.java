package com.Simulator.Vehicle_Simulator.controller;

import com.Simulator.Vehicle_Simulator.dto.SimulationDetailsDto;
import com.Simulator.Vehicle_Simulator.service.SimulationDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/simulation-details")
@RequiredArgsConstructor
public class SimulationDetailsController {

    private final SimulationDetailsService service;

    @PostMapping
    public SimulationDetailsDto create(@RequestBody SimulationDetailsDto dto) {
        return service.create(dto);
    }



}
