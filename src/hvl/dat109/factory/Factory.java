package hvl.dat109.factory;

import hvl.dat109.model.*;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public List<RentalOffice> rentalOfficesFactory() {
        List<RentalOffice> rentalOffices = new ArrayList<>();
        rentalOffices.add(new RentalOffice(1, new Address("Gardemoen", 2061, "Edvard Munchs veg"), 99887766));
        rentalOffices.add(new RentalOffice(2, new Address("Oslo", 0101, "Carl Johan"), 99887765));
        rentalOffices.add(new RentalOffice(3, new Address("Trondheim", 7001, "Kongsgate"), 99887765));
        rentalOffices.add(new RentalOffice(4, new Address("Bergen", 5003, "Bryggen"), 99887765));

        return rentalOffices;
    }

    public List<CarCategory> carCategoriesFactory() {
        List<CarCategory> carCategories = new ArrayList<>();
        carCategories.add(new CarCategory(RentalGroup.A, 2500));
        carCategories.add(new CarCategory(RentalGroup.B, 3000));
        carCategories.add(new CarCategory(RentalGroup.C, 3500));
        carCategories.add(new CarCategory(RentalGroup.D, 4000));

        return carCategories;
    }
}


