package com.Simulator.Vehicle_Simulator;

import com.Simulator.Vehicle_Simulator.dto.SimulationDetailsDto;
import com.Simulator.Vehicle_Simulator.service.SimulationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleSimulatorApplication {

	public static void main(String[] args) {


		SpringApplication.run(VehicleSimulatorApplication.class, args);


	}

}
