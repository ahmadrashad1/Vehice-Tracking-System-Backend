package com.Vehicle.mapper;

import com.Vehicle.dto.VehicleDto;
import com.Vehicle.entity.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleMapper {

    public VehicleDto toDto(Vehicle vehicle) {
        return VehicleDto.builder()
                .id(vehicle.getId())
                .licensePlate(vehicle.getLicensePlate())
                .model(vehicle.getModel())
                .brand(vehicle.getBrand())
                .type(vehicle.getType())
                .speed(vehicle.getSpeed())
                .Status(vehicle.getStatus())
                .build();
    }

    public Vehicle toEntity(VehicleDto dto) {
        return Vehicle.builder()
                .id(dto.getId())
                .licensePlate(dto.getLicensePlate())
                .model(dto.getModel())
                .brand(dto.getBrand())
                .type(dto.getType())
                .speed(dto.getSpeed())
                .Status(dto.getStatus())
                .build();
    }
}
