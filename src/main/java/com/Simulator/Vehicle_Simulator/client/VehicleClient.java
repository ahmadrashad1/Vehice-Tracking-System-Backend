package com.Simulator.Vehicle_Simulator.client;

import com.Simulator.Vehicle_Simulator.dto.VehicleDto;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
//@RequiredArgsConstructor
public class VehicleClient {

    private final RestTemplate restTemplate;

    public VehicleClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String assetsBaseUrl = "http://localhost:8080/api/vehicles";

    public VehicleDto getVehicleById(Long id) {
        try {
            return restTemplate.getForObject(assetsBaseUrl + "/" + id, VehicleDto.class);
        } catch (HttpClientErrorException.NotFound e) {
            return null;
        }
    }

//    public List<VehicleDto> getAllVehicles() {
//        VehicleDto[] vehicles = restTemplate.getForObject(assetsBaseUrl, VehicleDto[].class);
//        assert vehicles != null;
//        return Arrays.asList(vehicles);
//    }



}
