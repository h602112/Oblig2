package hvl.dat109.factory;

import hvl.dat109.model.Car;
import hvl.dat109.model.CarCategory;
import hvl.dat109.model.RentalOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarFactory {

    Factory f = new Factory();

    private List<CarCategory> carCategories = f.carCategoriesFactory();
    private List<RentalOffice> rentalOffices = f.rentalOfficesFactory();

    public List<Car> carFactory() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SU68594", "Ford", "Focus", "White", true, carCategories.get(0), rentalOffices.get(0)));
        cars.add(new Car("JT28917", "BMW", "3-serie", "Black", true, carCategories.get(1), rentalOffices.get(1)));
        cars.add(new Car("JI29073", "Toyota", "Auris", "White", true, carCategories.get(0), rentalOffices.get(2)));
        cars.add(new Car("EL12390", "Volvo", "XC60", "Black", true, carCategories.get(3), rentalOffices.get(3)));
        cars.add(new Car("TV21907", "Volvo", "V60", "White", true, carCategories.get(3), rentalOffices.get(0)));
        cars.add(new Car("TU21712", "VW", "Passat", "Black", true, carCategories.get(3), rentalOffices.get(1)));
        cars.add(new Car("TU23901", "VW", "Golf", "White", true, carCategories.get(1), rentalOffices.get(2)));
        cars.add(new Car("SU29021", "BMW", "3-serie", "Black", true, carCategories.get(1), rentalOffices.get(3)));
        cars.add(new Car("PA21900", "Ford", "Fiesta", "White", true, carCategories.get(0), rentalOffices.get(0)));
        cars.add(new Car("KU85940", "Suzuki", "Swift", "Black", true, carCategories.get(0), rentalOffices.get(1)));
        cars.add(new Car("EL29100", "KIA", "EV6", "White", true, carCategories.get(2), rentalOffices.get(2)));
        cars.add(new Car("PA43080", "Suzuki", "Swift", "Black", true, carCategories.get(0), rentalOffices.get(3)));
        cars.add(new Car("SU38201", "Skoda", "Superb", "White", true, carCategories.get(3), rentalOffices.get(0)));
        cars.add(new Car("JI21899", "Skoda", "Octavia", "Black", true, carCategories.get(3), rentalOffices.get(1)));
        cars.add(new Car("SU68512", "Ford", "F150", "White", true, carCategories.get(2), rentalOffices.get(2)));
        cars.add(new Car("SU68543", "Ford", "Explorer", "Black", true, carCategories.get(2), rentalOffices.get(3)));

        return cars;
    }



}
