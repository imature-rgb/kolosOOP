/*
Stwórz klasę Results (wyniki testu) z prywatnymi polami: firstName, lastName oraz results (jako tablica typu int).
Dodaj konstruktor, który przyjmuje firstName, lastName oraz rozmiar tablicy jako argumenty.
Dodaj metody dostępowe (gettery i settery) oraz metodę addResult(int index, int result),
która dodaje wynik testu na podanym indeksie.
Dodaj również metodę averageResult() do obliczania i zwracania średniego wyniku.
Dodaj metodę toString(), która zwraca informacje o uczniu,
jego wynikach oraz zawartość tablicy results w formacie:
"Results for [firstName] [lastName]: Average Score = [averageResult], Results: [result1, result2, ...]. ".
Ponadto dodaj metodę equals(), która porównuje dwa obiekty klasy Results
na podstawie ich pól firstName, lastName oraz zawartości tablicy results.
Dwa obiekty są uważane za identyczne, jeśli wszystkie pola i wyniki testów w tablicach są takie same.
Dodaj także metodę hashCode(), która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą equals()
*/

public class Main {
    public static void main(String[] args) {
        Results student1 = new Results("Anna", "Kowalska", 3);
        Results student2 = new Results("Anna", "Kowalska", 3);

        student1.addResult(0, 85);
        student1.addResult(1, 90);
        student1.addResult(2, 95);

        student2.addResult(0, 85);
        student2.addResult(1, 90);
        student2.addResult(2, 95);

        System.out.println(student1); // Results for Anna Kowalska: Average Score = 90.0, Results: [85, 90, 95]

        System.out.println(student1.equals(student2)); // true

        student2.addResult(1, 88);
        System.out.println(student1.equals(student2)); // false

        // HashCode
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String frstName;
    private String lastName;

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    private int[] results;

    public String getFrstName() {
        return frstName;
    }

    public void setFrstName(String frstName) {
        this.frstName = frstName;
    }

    Results(String frstName, String lastName, int size) {
        if(frstName == null || frstName.isEmpty()) {this.frstName = "";}
        else {this.frstName = frstName;}
        if(lastName == null || lastName.isEmpty()) {this.lastName = "";}
        else {this.lastName = lastName;}
        this.results = new int[size];

    }

    public void addResult(int index,int result) {
        if(index >= 0 && index < results.length) {results[index] = result;}
    }
    public double avgResults() {
        int sum = 0;
        for(int i: results){
            sum += i;
        }
        if(results.length == 0) {
            return 0;
        }
        else{return sum /results.length;}
    }
    @Override
    public String toString() {
        return "Results for "+ frstName + " "+ lastName+": Average Score ="+ avgResults()+", Results :"+ Arrays.toString(results);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results1 = (Results) o;
        return Objects.equals(frstName, results1.frstName) && Objects.equals(lastName, results1.lastName) && Objects.deepEquals(results, results1.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frstName, lastName, Arrays.hashCode(results));
    }
}
