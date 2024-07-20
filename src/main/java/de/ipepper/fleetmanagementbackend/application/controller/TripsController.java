package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/trips")
@RequiredArgsConstructor
public class TripsController {

	private final TripService tripService;

	@GetMapping
	public ResponseEntity<List<Trip>> getAllTrips() {
		throw new UnsupportedOperationException("Implement Controller getAllTrips Feature");
	}

}
