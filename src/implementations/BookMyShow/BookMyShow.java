package implementations.BookMyShow;

public class BookMyShow {

    public static void main(String...args) {

        Movie movie = new Movie(new Movie.MovieBuilder(MovieToWatch.DEADPOOL2)
                .setLanguages(Movie.Language.values()).setTypesAvailable(Movie.Type.values()));
        Theater theater = new Theater(Theaters.LUXE,movie);
        Booking booking = new Booking(new Booking.SetPreferences().setCity(Cities.MUMBAI).setMovie(movie).setTheater(theater));
//        booking.bookTicket(2,Theater.TimeSlots);
    }

}
