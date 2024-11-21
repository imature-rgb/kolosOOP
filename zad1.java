/*
Używając metody charAt, napisz statyczną metodę, która sprawdza, czy dany napis zaczyna się i kończy tym samym znakiem. Stwórz przypadek testowy.
*/

public class FirstOrLastArgs{
    public static boolean gowno (String input){
        if(input == null || input.length()==0){
            return false;
        }
        if(input.charAt(0) == input.charAt(input.length()-1)){
            return true;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(FirstOrLastArgs.gowno("ww"));
    }
}