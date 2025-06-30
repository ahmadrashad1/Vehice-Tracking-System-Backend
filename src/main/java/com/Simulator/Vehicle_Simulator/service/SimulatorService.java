package com.Simulator.Vehicle_Simulator.service;

import com.Simulator.Vehicle_Simulator.client.VehicleClient;
//import com.Simulator.dto.AssetManagementDto;
//import com.Simulator.dto.LocationUpdateRequest;
import com.Simulator.Vehicle_Simulator.controller.SimulatorController;
import com.Simulator.Vehicle_Simulator.dto.SimulationDetailsDto;
import com.Simulator.Vehicle_Simulator.dto.VehicleDto;
import com.Simulator.Vehicle_Simulator.repository.SimulationDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SimulatorService {
    private final SimulationDetailsRepository repository;

    private final VehicleClient vehicleClient;

    private final Random random = new Random();

    public void runSimulation() {

    }


    public VehicleDto GetVehicle(Long id) {

        return vehicleClient.getVehicleById(id);

    }

//    public List<VehicleDto> getAllVehicles() {
//        return  vehicleClient.getAllVehicles();
//    }



}
