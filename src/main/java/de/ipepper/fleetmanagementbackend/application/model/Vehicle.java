package de.ipepper.fleetmanagementbackend.application.model;

import de.ipepper.fleetmanagementbackend.application.types.*;
import lombok.*;

import java.util.*;

@Data
public class Vehicle {

	private String id;

	private String make;

	private String model;

	private int year;

	private String licensePlate;

	private VehicleStatus status;

	private List<MaintenanceRecord> maintenanceRecords;

	private List<Trip> tripHistory;

}
