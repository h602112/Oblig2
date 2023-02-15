package hvl.dat109;

import hvl.dat109.factory.CarFactory;
import hvl.dat109.factory.Factory;
import hvl.dat109.model.*;

import java.time.LocalDateTime;
import java.util.*;

public class UserInterface {
    static Factory f = new Factory();
    private static List<CarCategory> carCategories = f.carCategoriesFactory();
    private static List<RentalOffice> rentalOffices = f.rentalOfficesFactory();
    static CarFactory cF = new CarFactory();
    static Scanner sc = new Scanner(System.in);
    private static List<Car> cars = cF.carFactory();

    public static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til Bilutleie" + "\nFor hvilket utlånskontor ønsker du å se vår bilpark?");
        for(int i = 0; i < f.carCategoriesFactory().size(); i++) {
            System.out.println(rentalOffices.get(i).getOfficeNumber() + ": " + rentalOffices.get(i).getAddress().getCity());
        }
        Integer locationChoice = sc.nextInt();
        reservation(locationChoice);
    }

    public static void reservation(Integer locationNumber) {




        displayCars(locationNumber);


        Integer carChoiceIndex = sc.nextInt();

        System.out.println(cars.get(carChoiceIndex).toString());
        System.out.println("Ønsker du å reservere denne bilen? Ja/Nei");
        String choice = sc.next();
        choice = choice.toLowerCase();

        Car pickedCar = cars.get(carChoiceIndex);
        if (choice.equals("ja")) {
            Customer customer = Reservation.askForCustomerData();
            System.out.println("Hvor mangen dager ønsker du å reservere bilen for?");
            Integer numOfDays = sc.nextInt();
            Reservation res = new Reservation(pickedCar.getRentalOffice().getAddress(), LocalDateTime.now(),
                    pickedCar.getRentalOffice(), numOfDays,
                    customer);
            pickedCar.setAvailable(false);
            System.out.println("Takk! Her er din reservasjon: \n" + res.toString());
        } else if (choice == "nei"){
            reservation(locationNumber);
        }
    }
    public static void displayCars(Integer locationNumber) {
        System.out.println("Hvilken bilklasse ønsker du å se?");
        System.out.println("A: Liten bil" + "\nB: Mellomstor bil" + "\nC: Stor bil" + "\nD: Stasjonsvogn");
        String categoryChoice = sc.nextLine();

        RentalGroup rg = RentalGroup.A;
        switch (categoryChoice) {
            case "A":
                rg = RentalGroup.A;
                break;
            case "B":
                rg = RentalGroup.B;
                break;
            case "C":
                rg = RentalGroup.C;
                break;
            case "D":
                rg = RentalGroup.D;
                break;
        }


        System.out.println("Velg bil som kan være interessant?");
        for(int i = 0; i < cF.carFactory().size(); i++) {
            if (rg == cars.get(i).getCarCategory().getRentalgroup()
                    && Objects.equals(locationNumber, cars.get(i).getRentalOffice().getOfficeNumber())
                    && cars.get(i).getAvailable()) {
                System.out.println(i + " " + cars.get(i).getBrand() + " " + cars.get(i).getType());
            }
        }

    }
}
