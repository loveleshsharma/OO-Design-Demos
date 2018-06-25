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
            }
        }
    }



    static class SetPreferences {
        private City city;
        private Movie movie;
        private Theater theater;

        public void setCity(Cities city) {
            this.city.setCity(city);
        }

        public void setMovie(Movie movie) {
            this.movie = movie;
        }

        public void setTheater(Theater theater) {
            this.theater = theater;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
