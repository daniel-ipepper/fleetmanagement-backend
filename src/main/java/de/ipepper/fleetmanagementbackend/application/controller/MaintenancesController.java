package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/maintenances")
@RequiredArgsConstructor
public class MaintenancesController {

	private final MaintenanceService maintenanceService;

	@GetMapping("/vehicle/{vehicleId}")
	public ResponseEntity<List<MaintenanceRecord>> getMaintenanceRecordsForVehicle(@PathVariable String vehicleId) {
		throw new UnsupportedOperationException("Implement Controller getMaintenanceRecordsForVehicle Feature");
	}
}
