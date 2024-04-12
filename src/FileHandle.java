import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

    public static void WritingFile(String movie, String movieTitle) {
        try(FileWriter writing = new FileWriter(movieTitle + ".json")) {
            writing.write(movie);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
