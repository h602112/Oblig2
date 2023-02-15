package hvl.dat109.model;

public class RentalOffice {

    private Integer officeNumber;
    private Address address;
    private long phoneNumber;

    public RentalOffice(Integer officeNumber, Address address, long phoneNumber) {
        this.officeNumber = officeNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Integer officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "RentalOffice{" +
                "officeNumber=" + officeNumber +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
