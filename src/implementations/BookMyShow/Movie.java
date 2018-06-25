package implementations.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {


//    private List<String> movies;
//    private Map<City.Cities,List<String>> movies;
    private String movieName;
    private Language[] languages;
    private Type[] typesAvailable;

    public Movie(MovieBuilder builder) {
//        movies = new HashMap<City.Cities,List<String>>();
        this.movieName = builder.movieName;
        this.languages = builder.languages;
        this.typesAvailable = builder.typesAvailable;
    }

    public String getMovieName() {
        return movieName;
    }


//    public void loadMovies(City.Cities city) {
//        switch (city) {
//            case MUMBAI: {
//                List<String> moviesList = new ArrayList<String>();
//                moviesList.add("Annihilation");
//                moviesList.add("Oceans8");
//                moviesList.add("Deadpool2");
//                movies.put(City.Cities.MUMBAI,moviesList);
//                break;
//            }
//            case CHENNAI: {
//                List<String> moviesList = new ArrayList<String>();
//                moviesList.add("Jurassic World: Fallen Kingdom");
//                moviesList.add("Rampage");
//                moviesList.add("A Wrinkle in Time");
//                movies.put(City.Cities.CHENNAI,moviesList);
//                break;
//            }
//            default:
//                break;
//        }
//    }

//    public List<String> getMovies(City.Cities city) {
//        return movies.get(city);
//    }

    public static class MovieBuilder {
        private String movieName;
        private Language[] languages;
        private Type[] typesAvailable;

        MovieBuilder(String movieName) {
            this.movieName = movieName;
        }

        public void setLanguages(Language[] languages) {
            this.languages = languages;
        }

        public void setTypesAvailable(Type[] typesAvailable) {
            this.typesAvailable = typesAvailable;
        }

        public Movie build() {
            return new Movie(this);
        }

    }

    enum Language {
        HINDI,ENGLISH,TAMIL,TELUGU,MARATHI
    }

    enum Type {
        TWOD,THREED,IMAX3D
    }

}
