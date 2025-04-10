package com.hotelreservationsystem;

// Class representing an Invoice generated for a customer after their stay.
public class Invoice {
	private Reservation reservation;
	private double totalAmount;

	// Constructor to initialize invoice details
	public Invoice(Reservation reservation) {
		this.reservation = reservation;
		this.totalAmount = calculateTotalAmount();
	}

	// Method to calculate total amount based on room type and stay duration
	private double calculateTotalAmount() {
		long stayDuration = (reservation.getCheckOutDate().getTime() - reservation.getCheckInDate().getTime())
				/ (1000 * 60 * 60 * 24);
		return stayDuration * reservation.getRoom().getPricePerNight();
	}

	// Method to apply a discount for frequent guests (Advanced Feature)
	public void applyDiscount(double discountRate) {
		totalAmount -= totalAmount * (discountRate / 100);
		System.out.println("Discount applied. New total amount: $" + totalAmount);
	}

	// Method to display invoice details
	public void displayInvoiceDetails() {
        System.out.println("Invoice for: " + reservation.getCustomer().getName());
        System.out.println("Room: " + reservation.getRoom().getClass().getSimpleName());
        System.out.println("Total Amount: $" + totalAmount);
    }
}

/**
 * Explanation: The Invoice class represents an invoice generated after the
 * customer’s stay. It calculates the total amount based on room price and stay
 * duration, and it provides a method to apply a discount for frequent guests
 * (Advanced Feature). Encapsulation is used to manage invoice details. 
 */