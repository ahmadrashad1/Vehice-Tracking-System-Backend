package com.Simulator.Vehicle_Simulator.dto;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleDto {
    private Long id;
    private String licensePlate;
    private String model;
    private String brand;
    private String type;
    private float speed;
    private String Status;

}
