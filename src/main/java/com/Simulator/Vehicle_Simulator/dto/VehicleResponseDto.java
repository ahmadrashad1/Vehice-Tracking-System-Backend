package com.Simulator.Vehicle_Simulator.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleResponseDto {

    VehicleDto vehicleDto;
    String message;

}
