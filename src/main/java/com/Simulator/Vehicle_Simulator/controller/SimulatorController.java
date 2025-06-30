package com.Simulator.Vehicle_Simulator.controller;


import com.Simulator.Vehicle_Simulator.dto.SimulationDetailsDto;
import com.Simulator.Vehicle_Simulator.dto.VehicleDto;
import com.Simulator.Vehicle_Simulator.dto.VehicleResponseDto;
import com.Simulator.Vehicle_Simulator.service.SimulationDetailsService;
import com.Simulator.Vehicle_Simulator.service.SimulatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/simulator")
@RequiredArgsConstructor
@CrossOrigin
public class SimulatorController {


    private final SimulatorService simulationService;


    @GetMapping("/get-vehicle")
    public ResponseEntity<VehicleResponseDto> GetVehicle(@RequestParam Long id) {
        VehicleDto dto = simulationService.GetVehicle(id);

        if (dto == null) {
            return ResponseEntity
                    .badRequest()
                    .body(new VehicleResponseDto(null, "Vehicle not found"));
        }

        return ResponseEntity
                .ok(new VehicleResponseDto(dto, "Successfully fetched vehicle"));
    }


//    @GetMapping("/All-vehicles")
//    public ResponseEntity<List<VehicleDto>> getAllVehicles() {
//        List<VehicleDto> vehicles = simulationService.getAllVehicles();
//        return ResponseEntity.ok(vehicles);
//    }


}
