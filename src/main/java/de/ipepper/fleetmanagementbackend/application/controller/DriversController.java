package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriversController {

	private final DriverService driverService;

	@GetMapping
	public ResponseEntity<List<Driver>> getAllDrivers() {
		throw new UnsupportedOperationException("Implement Controller getAllDrivers Feature");
	}

}
