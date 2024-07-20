package de.ipepper.fleetmanagementbackend.application.model;

import java.time.*;

public class MaintenanceRecord {

	private String id;

	private Vehicle vehicle;

	private LocalDateTime maintenanceDate;

	private String description;

	private String performedBy;
}
