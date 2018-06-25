package implementations.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private String name;
    private List<TimeSlots> showTimes = new ArrayList<>();
    private static int availableSeats = 50;
    private Movie showingMovie;

    public Theater(String name,Movie movie) {
        this.name = name;
        this.showingMovie = movie;
    }

    public static int getAvailableSeats() {
        return availableSeats;
    }

    public static void bookSeats(int noOfSeats) {
        availableSeats -= noOfSeats;
    }

    private void loadShowTimes() {
        showTimes.add(new TimeSlots(7,0,"AM"));
        showTimes.add(new TimeSlots(9,30,"AM"));
        showTimes.add(new TimeSlots(3,0,"PM"));
        showTimes.add(new TimeSlots(6,30,"PM"));
    }

    public List<TimeSlots> getShowTimes() {
        return showTimes;
    }

    public String getName() {
        return name;
    }

    static class TimeSlots {
        private int hh;
        private int mm;
        private String AMPM;

        public TimeSlots(int hh,int mm,String AMPM) {
            this.hh = hh;
            this.mm = mm;
            this.AMPM = AMPM;
        }
    }
}