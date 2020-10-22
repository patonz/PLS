import java.util.*;

public class Temp {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        ciclo1(); // methodo


    }


    private static void ciclo1(){
        System.out.println("inserisci due stringhe");
        String s1 = keyboard.nextLine();
        String s2 = keyboard.nextLine();

        for(int i = 0; i <( s1.length()>=s2.length() ? s1.length(): s2.length()); i++ ){
            try{
                System.out.println(s1.charAt(i));
                
            } catch(IndexOutOfBoundsException e) {
                System.out.println(" ");
            }
            try{
                System.out.println(s2.charAt(i));
            }catch(IndexOutOfBoundsException e){
                System.out.println(" ");
            }
            
        }
    }

}
