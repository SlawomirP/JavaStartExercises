package arraysStering.playlist;

public class Song {

    String name;
    int timeInSec;

    public Song(String name, int timeInSec) {
        this.name = name;
        this.timeInSec = timeInSec;
    }

    public String getName() {
        return name;
    }

    public int getTimeInSec() {
        return timeInSec;
    }
}

