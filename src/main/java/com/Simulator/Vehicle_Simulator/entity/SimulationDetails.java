package com.Simulator.Vehicle_Simulator.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Table(name = "simulation_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SimulationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
