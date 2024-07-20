package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor
public class VehiclesController {

	private final VehicleService vehicleService;


	@GetMapping
	public ResponseEntity<List<Vehicle>> getAllVehicles() {
		throw new UnsupportedOperationException("Implement Controller getAllVehicles Feature");
	}

}
