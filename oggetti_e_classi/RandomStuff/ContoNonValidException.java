import java.util.InputMismatchException;

public class ContoNonValidException extends Exception {

    public ContoNonValidException(String message) {
        super(message);
        System.out.println(message);

    }

}