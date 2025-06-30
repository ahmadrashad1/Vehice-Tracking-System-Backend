package com.Vehicle.service;

import com.Vehicle.dto.VehicleDto;
import com.Vehicle.entity.Vehicle;
import com.Vehicle.mapper.VehicleMapper;
import com.Vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    @Autowired
    private VehicleMapper mapper;


    public VehicleDto create(VehicleDto dto) {
        if (dto.getLicensePlate() == null || dto.getLicensePlate().isBlank()) {
            throw new IllegalArgumentException("License plate is required");
        }
        Vehicle vehicle = mapper.toEntity(dto);
        return mapper.toDto(repository.save(vehicle));
    }



    public VehicleDto update(Long id, VehicleDto dto) {

        Optional<Vehicle> optional = repository.findById(id);
        if (optional.isPresent()) {
            Vehicle v = optional.get();
            v.setLicensePlate(dto.getLicensePlate());
            v.setModel(dto.getModel());
            v.setBrand(dto.getBrand());
            v.setType(dto.getType());
            return mapper.toDto(repository.save(v));
        }
        return null;
    }

    public boolean delete(Long id) {
        if (id == null) throw new IllegalArgumentException("ID cannot be null");
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }




    public VehicleDto getById(Long id) {
        if (id == null) throw new IllegalArgumentException("ID cannot be null");
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }


    public List<VehicleDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
