package de.ipepper.fleetmanagementbackend.datasource.service;

import de.ipepper.fleetmanagementbackend.application.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class TripService {

	public void scheduleTrip(final Trip trip) {
		throw new UnsupportedOperationException("Implement ScheduleTrip Feature");
	}

	public Trip getTrip(final String id) {
		throw new UnsupportedOperationException("Implement GetTrip Feature");
	}

	public void updateTrip(final Trip trip) {
		throw new UnsupportedOperationException("Implement UpdateTrip Feature");
	}

	public void cancelTrip(final String id) {
		throw new UnsupportedOperationException("Implement CancelTrip Feature");
	}

	public List<Trip> getTripsByDriver(final String driverId) {
		throw new UnsupportedOperationException("Implement GetTripsByDriver Feature");
	}

	public List<Trip> getTripsByVehicle(final String vehicleId) {
		throw new UnsupportedOperationException("Implement GetTripsByVehicle Feature");
	}

}
