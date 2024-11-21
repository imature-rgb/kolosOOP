/*
Napisz klasę Book, która będzie zawierać trzy pola: title, author, publicationYear.
Następnie zaimplementuj dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych argumentów,
i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy.
W przypadku drugiego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól.
Sprawdź czy jesteś w stanie prawidłowo przypisać wartości do pól klasy używając słowa kluczowego this.
*/

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.printowanie();
        Book book2 = new Book("Gowno z dupy","Ja", (short) 2024);
        book2.printowanie();
    }
}
public class Book{
    private String title;
    private String author;
    private short publicationYear;

    public Book(){
        this.title = "unknown";
        this.author = "unknown";
        this.publicationYear = 0;
    }
    public Book(String title, String author, short publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void printowanie(){
        System.out.println("Nazwa:" + this.title);
        System.out.println("Autor:" + this.author);
        System.out.println("Rok publikacji" + this.publicationYear);
    }

}
