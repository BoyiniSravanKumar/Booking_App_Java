package org.mavenProject;

public class BookingDetails {
    private String name;
    private String bookingType;
    private int numberOfPeople;
    private int numberOfDaysStay;
    private String bookingId;

    // Default constructor
    public BookingDetails() {
    }

    // Parameterized constructor
    public BookingDetails(String name, String bookingType, int numberOfPeople, int numberOfDaysStay, String bookingId) {
        this.name = name;
        this.bookingType = bookingType;
        this.numberOfPeople = numberOfPeople;
        this.numberOfDaysStay = numberOfDaysStay;
        this.bookingId = bookingId;
    }

    // Getter and Setter methods for all declared
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfDaysStay() {
        return numberOfDaysStay;
    }

    public void setNumberOfDaysStay(int numberOfDaysStay) {
        this.numberOfDaysStay = numberOfDaysStay;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "name='" + name + '\'' +
                ", bookingType='" + bookingType + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", numberOfDaysStay=" + numberOfDaysStay +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }
}
