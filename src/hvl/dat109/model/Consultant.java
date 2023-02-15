package hvl.dat109.model;

public class Consultant {

    private String firstName;
    private String lastName;
    private RentalOffice rentalOffice;
    private Long phoneNumber;

    public Consultant(String firstName, String lastName, RentalOffice rentalOffice, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rentalOffice = rentalOffice;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
