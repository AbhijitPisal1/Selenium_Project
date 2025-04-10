package project.hotelreservationsystem;

import java.util.Date;

// Class representing a Reservation for a room in the hotel.
public class Reservation {
	private Room room;
	private Customer customer;
	private Date checkInDate;
	private Date checkOutDate;
	private boolean isCancelled;

	// Constructor to initialize reservation details
	public Reservation(Room room, Customer customer, Date checkInDate, Date checkOutDate) {
		this.room = room;
		this.customer = customer;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.isCancelled = false;
	}

	// Getters and Setters (Encapsulation)
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	// Method to cancel the reservation
	public void cancelReservation() {
		isCancelled = true;
		System.out.println("Reservation cancelled.");
	}

	// Method to modify the reservation dates
	public void modifyReservation(Date newCheckInDate, Date newCheckOutDate) {
        this.checkInDate = newCheckInDate;
        this.checkOutDate = newCheckOutDate;
        System.out.println("Reservation modified.");
    }
}

/**
 * Explanation: The Reservation class represents a customer's reservation. It
 * contains information like the reserved room, customer, check-in/check-out
 * dates, and a flag for cancellation. Methods for modifying and canceling
 * reservations are also included. Encapsulation is used to protect sensitive
 * reservation data.
 */