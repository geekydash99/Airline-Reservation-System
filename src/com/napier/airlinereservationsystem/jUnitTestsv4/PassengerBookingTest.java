package com.napier.airlinereservation.jUnitTestsv4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.napier.airlinereservation.datatypes.Flight;
import com.napier.airlinereservation.datatypes.Passenger;
import com.napier.airlinereservation.datatypes.PassengerBooking;

public class PassengerBookingTest {

	@Test
	public void testSetPassenger() {
		PassengerBooking pb = new PassengerBooking();
		Passenger p1 = new Passenger();
		String id = "P001";
		p1.setPassengerID(id);
		pb.setPassenger(p1);

		String actual = pb.getPassenger().getPassengerID();
		String expected = id;

		assertTrue(actual == expected);

	}

	@Test
	public void testSetFlight() {
		PassengerBooking pb = new PassengerBooking();
		Flight f1 = new Flight();
		String id = "F001";
		f1.setFlightID(id);
		pb.setFlight(f1);

		String actual = pb.getFlight().getFlightID();
		String expected = id;

		assertTrue(actual == expected);
	}

}
