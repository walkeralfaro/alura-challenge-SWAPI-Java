import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = Connection.FetchHTTP(Input.inputMenu());

        MovieFromSWAPI myMovieFromSWAPI = gson.fromJson(json, MovieFromSWAPI.class);
        Movie myMovie = new Movie(myMovieFromSWAPI);

        String movie = gson.toJson(myMovie);
        String movieTitle = myMovie.getTitle();

        System.out.println(myMovie);

        FileHandle.WritingFile(movie,movieTitle);

    }
}
