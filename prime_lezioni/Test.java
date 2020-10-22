import java.util.*;

public class Test {

    public static void main(String[] args) {

        int tentativi = 3;
        boolean shouldLogin = true;
        boolean isAdmin = false;
        while (tentativi > 0 && shouldLogin) {
            // scanner

          
            System.out.println("Inserisci una password!");
            Scanner scanTastiera2 = new Scanner(System.in);

            String input = scanTastiera2.nextLine();

            if(input.equals("admin")){
                System.out.println("Sei un admin, fai quello che vuoi"); 
                isAdmin = true;
                shouldLogin = false;
            } else {
                System.out.println();
                switch (input) {
                    case "ciao":
                        System.out.println("benvenuto/a");
                        shouldLogin = false;
                        tentativi = 3;
                        break;
                    case "mamma":
                        System.out.println("benvenuto/a");
                        break;
                    case "nonloso":
                        System.out.println("benvenuto/a");
                        break;
                    default:
                        System.out.println("password errata");
                        tentativi--;
                        System.out.println("tentativi rimasti: "+ tentativi);
                        System.out.println();
                }
            }
            
            if(!shouldLogin){
                if(isAdmin){
                    System.out.println("Sei un admin");
                } else {
                    System.out.println("Sei un utente normale");
                }
            }
           
            
            
        }



        System.out.println("Ha loggato un admin?");
        if(isAdmin){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
        
    }

}