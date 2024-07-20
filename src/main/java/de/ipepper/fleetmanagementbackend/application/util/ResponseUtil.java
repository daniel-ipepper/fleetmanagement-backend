package de.ipepper.fleetmanagementbackend.application.util;

import org.springframework.http.*;

public class ResponseUtil {

	public static <T> ResponseEntity<T> createResponse(T body, HttpStatus status) {
		return new ResponseEntity<>(body, status);
	}

}
