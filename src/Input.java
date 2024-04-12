import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static String inputMenu() {
        String inputMessage = "Ingresa una película de SW [1-6]: ";
        String errorMessage = "ERROR: ingrese un episodio válido";
        int episodeNumber = Input.inputNumber(inputMessage, errorMessage);
        return "https://swapi.dev/api/films/" + episodeNumber;
    }

    public static int inputNumber(String inputMessage, String errorMessage) {
        Scanner keyboard = new Scanner(System.in);
        int valueInput;
        while (true) {
            System.out.println(inputMessage);
            try {
                valueInput = keyboard.nextInt();
                if (valueInput > 6) {
                    throw new InputMismatchException();
                }
                keyboard.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                keyboard.nextLine();
            }
        }
        return valueInput;
    }
}
