package implementations.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class City {

    City(Cities city) {
        this.city = city;
    }

    public String getCity() {
        return city.toString();
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    private Cities city;

    private List<Movie> movieList = new ArrayList<Movie>();

    private List<Theater> theaterList = new ArrayList<Theater>();

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addTheater(Theater theater) {
        theaterList.add(theater);
    }

}

enum Cities {
    MUMBAI,NCR,BENGALURU,HYDERABAD,AHMEDABAD,CHANDIGARH,CHENNAI,PUNE
}