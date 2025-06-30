package com.Simulator.Vehicle_Simulator.service;

import com.Simulator.Vehicle_Simulator.client.VehicleClient;
import com.Simulator.Vehicle_Simulator.dto.SimulationDetailsDto;
import com.Simulator.Vehicle_Simulator.dto.VehicleDto;
import com.Simulator.Vehicle_Simulator.entity.SimulationDetails;
import com.Simulator.Vehicle_Simulator.repository.SimulationDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SimulationDetailsService {

    private final SimulationDetailsRepository repository;
    private final VehicleClient v;

    public SimulationDetailsDto create(SimulationDetailsDto dto) {

        VehicleDto vehicle = v.getVehicleById(dto.getVehicleId());
        if(vehicle == null){
            return null;
        }


        SimulationDetails entity = mapToEntity(dto);
        return mapToDto(repository.save(entity));

    }

    public List<SimulationDetailsDto> getAll() {
        return repository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public SimulationDetailsDto getById(Long id) {
        return repository.findById(id)
                .map(this::mapToDto)
                .orElse(null);
    }


    // Mapping methods
    private SimulationDetailsDto mapToDto(SimulationDetails entity) {
        return SimulationDetailsDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .avgSpeed(entity.getAvgSpeed())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .heading(entity.getHeading())
                .status(entity.getStatus())
                .timestamp(entity.getTimestamp())
                .fuelLevel(entity.getFuelLevel())
                .engineStatus(entity.getEngineStatus())
                .distanceTravelled(entity.getDistanceTravelled())
                .build();
    }

    private SimulationDetails mapToEntity(SimulationDetailsDto dto) {
        return SimulationDetails.builder()
                .id(dto.getId())
                .vehicleId(dto.getVehicleId())
                .avgSpeed(dto.getAvgSpeed())
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .heading(dto.getHeading())
                .status(dto.getStatus())
                .timestamp(dto.getTimestamp())
                .fuelLevel(dto.getFuelLevel())
                .engineStatus(dto.getEngineStatus())
                .distanceTravelled(dto.getDistanceTravelled())
                .build();
    }


}
