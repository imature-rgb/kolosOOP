/*
Wykonaj poniższe czynności:
Zdefiniuj klasę Vehicle, która posiada następujące pola: brand, model i yearOfProduction.
Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
Rok produkcji (yearOfProduction) nie powinien być większy od aktualnego roku. W przypadku podania wartości większej, ustaw rok produkcji na aktualny rok.
Pola brand i model nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
Dodaj metodę toString(), która zwraca informacje o pojeździe w formacie: "Vehicle: [brand] [model], Year: [yearOfProduction].".
Dodaj metodę equals(), która porównuje dwa pojazdy na podstawie ich pól brand, model i yearOfProduction.
Dodaj metodę hashCode(), która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą equals()
*/

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2015);
        Vehicle vehicle2 = new Vehicle(null, "Model S", 2025); // Некорректный год
        Vehicle vehicle3 = new Vehicle("", "", 2010);         // Пустые brand и model
        Vehicle vehicle4 = new Vehicle("Toyota", "Corolla", 2015);

        // Вывод объектов
        System.out.println(vehicle1); // Vehicle: Toyota Corolla, Year: 2015.
        System.out.println(vehicle2); // Vehicle:  Model S, Year: 2024.
        System.out.println(vehicle3); // Vehicle:  , Year: 2010.

        // Проверка equals
        System.out.println(vehicle1.equals(vehicle4)); // true
        System.out.println(vehicle1.equals(vehicle2)); // false

        // Проверка hashCode
        System.out.println(vehicle1.hashCode() == vehicle4.hashCode()); // true
        System.out.println(vehicle1.hashCode() == vehicle2.hashCode()); // false
    }
}

import java.time.Year;
import java.util.Objects;

public class Vehicle{
    private String brand;
    private String model;
    private int year;

    Vehicle(String brand, String model, int year){
        if(year > Year.now().getValue()){
            this.year = Year.now().getValue();
        }
        else {
            this.year = year;
        }
        if(brand == null||brand == ""){
            this.brand = "";
        }
        else{this.brand = brand;}
        if(model == null||model == ""){
            this.model = "";
        }
        else{this.model = model;}
    }
    @Override
    public String toString(){
        return "Vehicle:" + brand +" "+ model + ", year=" + year;
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }
        @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

}

