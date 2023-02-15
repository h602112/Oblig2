package hvl.dat109.model;

public class RentalCompany {
    private String name;
    private Integer phoneNumber;
    private String companyAddress;

    public RentalCompany(String name, Integer phoneNumber, String companyAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyAddress = companyAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
