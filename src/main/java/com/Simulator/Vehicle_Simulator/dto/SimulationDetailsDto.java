package com.Simulator.Vehicle_Simulator.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimulationDetailsDto {

    private Long id;
    private Long vehicleId;
    private Float avgSpeed;
    private Float latitude;
    private Float longitude;

    private Float heading;
    private String status;
    private LocalDateTime timestamp;
    private Float fuelLevel;
    private Boolean engineStatus;
    private Double distanceTravelled;


}
