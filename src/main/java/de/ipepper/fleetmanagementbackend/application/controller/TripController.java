package de.ipepper.fleetmanagementbackend.application.controller;

import de.ipepper.fleetmanagementbackend.application.model.*;
import de.ipepper.fleetmanagementbackend.datasource.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/trip")
@RequiredArgsConstructor
public class TripController {

	private final TripService tripService;

	@PostMapping
	public ResponseEntity<Trip> scheduleTrip(@RequestBody Trip trip) {
		throw new UnsupportedOperationException("Implement Controller scheduleTrip Feature");
	}

	@GetMapping("/{id}")
	public ResponseEntity<Trip> getTrip(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller getTrip Feature");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Trip> updateTrip(@PathVariable String id, @RequestBody Trip trip) {
		throw new UnsupportedOperationException("Implement Controller updateTrip Feature");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> cancelTrip(@PathVariable String id) {
		throw new UnsupportedOperationException("Implement Controller cancelTrip Feature");
	}

}
