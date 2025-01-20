import java.util.ArrayList;
import java.util.List;

public class LambdaPractice03 {
    public static void main(String[] args) {
        Movie0231 m1 = new Movie0231("Koi Mil Gaya", 150);
        Movie0231 m2 = new Movie0231("Fight Club", 90);
        Movie0231 m3 = new Movie0231("Kai Po Che", 140);
        Movie0231 m4 = new Movie0231("Diamond Thief", 120);

        List<Movie0231> listOfMovies = new ArrayList<>();
        listOfMovies.add(m1);
        listOfMovies.add(m2);
        listOfMovies.add(m3);
        listOfMovies.add(m4);

        System.out.println("Print Movies before sorting:");
        listOfMovies.forEach(System.out::println);

        // sort the movie names using Lambda Expressions
        listOfMovies.sort((o1, o2) -> o1.getMovieName().compareTo(o2.getMovieName()));

        System.out.println("Print Movies after sorting:");
        listOfMovies.forEach(System.out::println);
    }
}

class Movie0231 {
    String movieName;
    long duration;

    public Movie0231(String name, long playTime) {
        movieName = name;
        duration = playTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String name) {
        movieName = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long playTime) {
        duration = playTime;
    }

    @Override
    public String toString() {
        return "Movie Name: " + this.getMovieName() + " ##-!-## Duration:" + this.getDuration();
    }
}
