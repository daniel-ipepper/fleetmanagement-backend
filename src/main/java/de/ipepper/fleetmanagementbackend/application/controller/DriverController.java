package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/driver")
@RequiredArgsConstructor
public class DriverController {

	private final DriverService driverService;

	@PostMapping
	public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
		throw new UnsupportedOperationException("Implement Controller addDriver Feature");
	}

	@GetMapping("/{id}")
	public ResponseEntity<Driver> getDriver(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller getDriver Feature");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Driver> updateDriver(@PathVariable String id, @RequestBody Driver driver) {
		throw new UnsupportedOperationException("Implement Controller updateDriver Feature");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDriver(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller deleteDriver Feature");
	}

}
