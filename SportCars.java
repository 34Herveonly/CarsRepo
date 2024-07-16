public class SportCars {
    public void pricesRanges() {
        System.out.println("We Have Affordable Prices.");
    }
}

class Lamborghini extends SportCars {
    public void pricesRanges() {
        System.out.println("The price tag of a Lambo begins from $200k.");
    }
}

class Ferrari extends SportCars {
    public void pricesRanges() {
        System.out.println("Ferrari depends on the Model.");
    }
}

class RollsRoyce extends SportCars {
    public void pricesRanges() {
        System.out.println("The price of RollsRoyce begins at $400K.");
    }
}

class Main {
    public static void main(String[] args) {
        SportCars myCar = new SportCars();
        SportCars myLambo = new Lamborghini();
        SportCars myFerrari = new Ferrari();
        SportCars myRollsRoyce = new RollsRoyce();

        myCar.pricesRanges();
        myLambo.pricesRanges();
        myFerrari.pricesRanges();
        myRollsRoyce.pricesRanges();
    }
}
