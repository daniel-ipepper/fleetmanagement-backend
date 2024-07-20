package de.ipepper.fleetmanagementbackend.datasource.service;

import de.ipepper.fleetmanagementbackend.application.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class MaintenanceService {

	public void addMaintenanceRecord(final MaintenanceRecord record) {
		throw new UnsupportedOperationException("Implement AddMaintenanceRecord Feature");
	}

	public MaintenanceRecord getMaintenanceRecord(final String id) {
		throw new UnsupportedOperationException("Implement GetMaintenanceRecord Feature");
	}

	public void updateMaintenanceRecord(final MaintenanceRecord record) {
		throw new UnsupportedOperationException("Implement UpdateMaintenanceRecord Feature");
	}

	public void deleteMaintenanceRecord(final String id) {
		throw new UnsupportedOperationException("Implement DeleteMaintenanceRecord Feature");
	}

	public List<MaintenanceRecord> getMaintenanceRecordsForVehicle(final String vehicleId) {
		throw new UnsupportedOperationException("Implement GetMaintenanceRecordsForVehicle Feature");
	}

}
