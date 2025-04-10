package project.hotelreservationsystem;

import java.util.Date;

// Concrete subclass of Customer representing a regular customer
public class RegularCustomer extends Customer {

    public RegularCustomer(String name, String email) {
        super(name, email);
    }

    // Implementing the abstract method from Customer class
    @Override
    public void bookReservation(Room room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(room, this, checkInDate, checkOutDate);
        System.out.println("Reservation booked for " + this.getName());
    }
}
