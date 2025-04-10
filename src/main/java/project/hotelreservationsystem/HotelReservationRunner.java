package project.hotelreservationsystem;

import java.util.Date;
import java.util.Calendar;

public class HotelReservationRunner {

    public static void main(String[] args) {

        // Creating room instances
        Room singleRoom1 = new SingleRoom(101, true, 100.0);
        Room doubleRoom1 = new DoubleRoom(102, true, 150.0);

        // Creating a customer
        Customer customer1 = new RegularCustomer("John Doe", "john.doe@example.com");

        // Set the check-in and check-out dates with a 2-day duration
        Calendar checkInCalendar = Calendar.getInstance();
        checkInCalendar.set(2025, Calendar.APRIL, 10); // April 10, 2025
        Date checkInDate = checkInCalendar.getTime();

        Calendar checkOutCalendar = Calendar.getInstance();
        checkOutCalendar.set(2025, Calendar.APRIL, 12); // April 12, 2025
        Date checkOutDate = checkOutCalendar.getTime();

        // Booking a reservation
        customer1.bookReservation(singleRoom1, checkInDate, checkOutDate);

        // Generating an invoice
        Reservation reservation = new Reservation(singleRoom1, customer1, checkInDate, checkOutDate);
        Invoice invoice = new Invoice(reservation);
        invoice.displayInvoiceDetails();

        // Applying a discount and displaying the updated invoice
        invoice.applyDiscount(10); // 10% discount
        invoice.displayInvoiceDetails();
    }
}

/**
 * Explanation: The HotelReservationRunner class is the main runner to
 * demonstrate the OOP concepts used in the project. It creates rooms,
 * customers, reservations, and invoices, showcasing Polymorphism (overridden
 * methods), Inheritance (rooms and customers), and Encapsulation (protecting
 * details with getters and setters).
 */

/**
 * Reservation booked for John Doe
 * Invoice for: John Doe
 * Room: SingleRoom
 * Total Amount: $200.0
 * Discount applied. New total amount: $180.0
 * Invoice for: John Doe
 * Room: SingleRoom
 * Total Amount: $180.0
 */