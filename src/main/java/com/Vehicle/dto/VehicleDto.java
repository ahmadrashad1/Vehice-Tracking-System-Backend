package com.Vehicle.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleDto {

    private Long id;

    @NotBlank(message = "License plate is required")
    @Size(max = 20, message = "License plate must not exceed 20 characters")
    private String licensePlate;

    @NotBlank(message = "Model is required")
    @Size(max = 50, message = "Model name must not exceed 50 characters")
    private String model;

    @NotBlank(message = "Brand is required")
    @Size(max = 50, message = "Brand name must not exceed 50 characters")
    private String brand;

    @NotBlank(message = "Type is required")
    @Size(max = 30, message = "Vehicle type must not exceed 30 characters")
    private String type;


    private float speed;

    @NotBlank(message = "Type is required")
    @Size(max = 30, message = "Vehicle type must not exceed 30 characters")
    private String Status;




}
