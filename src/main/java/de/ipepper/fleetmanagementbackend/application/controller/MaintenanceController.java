package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/maintenance")
@RequiredArgsConstructor
public class MaintenanceController {

	private final MaintenanceService maintenanceService;


	@PostMapping
	public ResponseEntity<MaintenanceRecord> addMaintenanceRecord(@RequestBody MaintenanceRecord record) {

		throw new UnsupportedOperationException("Implement Controller addMaintenanceRecord Feature");
	}

	@GetMapping("/{id}")
	public ResponseEntity<MaintenanceRecord> getMaintenanceRecord(@PathVariable String id) {

		throw new UnsupportedOperationException("Implement Controller getMaintenanceRecord Feature");
	}

	@PutMapping("/{id}")
	public ResponseEntity<MaintenanceRecord> updateMaintenanceRecord(@PathVariable String id, @RequestBody MaintenanceRecord record) {

		throw new UnsupportedOperationException("Implement Controller updateMaintenanceRecord Feature");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMaintenanceRecord(@PathVariable String id) {

		throw new UnsupportedOperationException("Implement Controller deleteMaintenanceRecord Feature");
	}



}
