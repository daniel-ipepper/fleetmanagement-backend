package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/vehicle")
@RequiredArgsConstructor
public class VehicleController {

	private final VehicleService vehicleService;

	@PostMapping
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
		throw new UnsupportedOperationException("Implement Controller addVehicle Feature");
	}

	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> getVehicle(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller getVehicle Feature");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Vehicle> updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicle) {
		throw new UnsupportedOperationException("Implement Controller updateVehicle Feature");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteVehicle(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller deleteVehicle Feature");
	}

}
