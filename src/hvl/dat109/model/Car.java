package hvl.dat109.model;

import java.util.Objects;

public class Car {
    private String regnr;
    private String brand;
    private String type;
    private String color;
    private Boolean available;
    private CarCategory carCategory;
    private RentalOffice rentalOffice;

    public Car() {
    }

    public Car(String regnr, String brand, String type, String color, Boolean available, CarCategory carCategory, RentalOffice rentalOffice) {
        this.regnr = regnr;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.available = available;
        this.carCategory = carCategory;
        this.rentalOffice = rentalOffice;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regnr, car.regnr) && Objects.equals(brand, car.brand) && Objects.equals(type, car.type);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regnr='" + regnr + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", available=" + available +
                ", carCategory=" + carCategory +
                '}';
    }
}
