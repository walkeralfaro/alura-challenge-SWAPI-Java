import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    public static String FetchHTTP(String uriMovie) {
        String movie = "sw_movie";

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uriMovie))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (NullPointerException e) {
            System.err.println("Se produjo una NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Se produjo una IOException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Se produjo una InterruptedException: " + e.getMessage());
        }

        return movie;
    }
}
