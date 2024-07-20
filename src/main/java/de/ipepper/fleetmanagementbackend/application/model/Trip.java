package de.ipepper.fleetmanagementbackend.application.model;

import de.ipepper.fleetmanagementbackend.application.types.*;

import javax.xml.stream.*;
import java.time.*;

public class Trip {

	private String id;

	private Vehicle vehicle;

	private Driver driver;

	private LocalDateTime startTime;

	private LocalDateTime endTime;

	private Location startLocation;

	private Location endLocation;

	private TripStatus status;

}
