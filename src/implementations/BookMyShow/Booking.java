package implementations.BookMyShow;

public class Booking {

    private City city;
    private Movie movie;
    private Theater theater;

    public Booking(SetPreferences preferences) {
        this.city = preferences.city;
        this.movie = preferences.movie;
        this.theater = preferences.theater;
    }

    public void bookTicket(int noOfTickets, Theater.TimeSlots timeSlot) {
        if(theater.getShowTimes().contains(timeSlot)) {
            if(Theater.getAvailableSeats() >= noOfTickets) {
//                book tickets
                theater.bookSeats(noOfTickets);
                generateTickets(noOfTickets);
            }
        }
    }

    private void generateTickets(int noOfTickets) {
        System.out.println("Booked Successfully!");
        System.out.println("Movie: "+movie.getMovieName());
        System.out.println("Theater: "+theater.getName());
        System.out.println("Number of Tickets: "+noOfTickets);
    }

    static class SetPreferences {
        private City city;
        private Movie movie;
        private Theater theater;

        public SetPreferences setCity(Cities city) {
            this.city.setCity(city);
            return this;
        }

        public SetPreferences setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public SetPreferences setTheater(Theater theater) {
            this.theater = theater;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
