public class Movie {

    private final String title;
    private final int episode;
    private final String opening;
    private final String director;
    private final String producer;
    private final String date;

    public Movie(MovieFromSWAPI myMovieFromSWAPI) {
        this.title = myMovieFromSWAPI.title();
        this.episode = myMovieFromSWAPI.episode_id();
        this.opening = myMovieFromSWAPI.opening_crawl();
        this.director = myMovieFromSWAPI.director();
        this.producer = myMovieFromSWAPI.producer();
        this.date = myMovieFromSWAPI.release_date();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", episode=" + episode +
                ", opening='" + opening + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
