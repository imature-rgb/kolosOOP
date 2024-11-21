/*
Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis z zamienioną pierwszą i ostatnią literą. Stwórz przypadek testowy.
*/

public class FirstOrLastArgs{
    public static String  gowno (String input){
        if(input == null || input.length()==0){
            return "Error";
        }
        return ""+ input.charAt(input.length()-1) + input.substring(1,input.length()-1)+input.charAt(0);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(FirstOrLastArgs.gowno("wewe"));
    }
}
