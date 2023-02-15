package hvl.dat109.model;

public class CarCategory {
    private RentalGroup rentalgroup;
    private Integer price;

    public CarCategory(RentalGroup rentalgroup, Integer price) {
        this.rentalgroup = rentalgroup;
        this.price = price;
    }

    public RentalGroup getRentalgroup() {
        return rentalgroup;
    }

    public void setRentalgroup(RentalGroup rentalgroup) {
        this.rentalgroup = rentalgroup;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
