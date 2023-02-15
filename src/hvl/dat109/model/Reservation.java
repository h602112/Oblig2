package hvl.dat109.model;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation {

    private Address address;
    private LocalDateTime date;
    private RentalOffice rentalOffice;
    private Integer numberOfDays;
    private Customer customer;

    public Reservation(Address address, LocalDateTime date, RentalOffice rentalOffice, Integer numberOfDays, Customer customer) {
        this.address = address;
        this.date = date;
        this.rentalOffice = rentalOffice;
        this.numberOfDays = numberOfDays;
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static Customer askForCustomerData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vi må registrere noe informasjon om deg.\nHva er fornavnet ditt?");
        String fornavn = sc.next();
        System.out.println("Hva er etternavnet ditt?");
        String etternavn = sc.next();
        System.out.println("Hva er mobilnummeret ditt?");
        Integer mobil = sc.nextInt();
        System.out.println("Vi trenger adressen din.\nPostnummer?");
        Integer postnummer = sc.nextInt();
        System.out.println("Poststed?");
        String poststed = sc.next();
        System.out.println("Gateadresse?");
        String gateAdresse = sc.next();
        System.out.println("Vi trenger kredittkort informasjon.\nKortnummer?");
        Long cnum = sc.nextLong();
        System.out.println("Utløpsdato?");
        String dato = sc.next();
        return new Customer(fornavn, etternavn, new Address(poststed,postnummer,gateAdresse), mobil);

    }

    @Override
    public String toString() {
        return "Reservation{" +
                "address=" + address +
                ", date=" + date +
                ", rentalOffice=" + rentalOffice +
                ", numberOfDays=" + numberOfDays +
                ", customer=" + customer +
                '}';
    }
}
