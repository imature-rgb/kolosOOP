/*
Zdefiniuj klasę Car, która ma pola: brand, model i productionYear.
Klasa powinna zawierać dwa konstruktory: pierwszy przyjmujący wszystkie trzy parametry,
a drugi tylko markę i model. Drugi konstruktor powinien wywoływać pierwszy,
przekazując mu domyślną wartość productionYear jako aktualny rok.
*/

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Toyota","Corolla",2013);
    Car car2 = new Car("Toyota","Corolla");
    car1.printowanie();
    car2.printowanie();
    }
}

import java.time.Year;
public class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    Car(String brand, String model) {
        this(brand, model,Year.now().getValue());
    }

    public void printowanie(){
        System.out.println(brand + " " + model + " " + year);
    }
}
