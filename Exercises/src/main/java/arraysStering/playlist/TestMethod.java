package arraysStering.playlist;

public class TestMethod {

    private final static int IN_HOURS = 3600;
    private final static int IN_MINUTES = 60;

    public static void main(String[] args) {
        Song s1 = new Song("First", 3600);
        Song s2 = new Song("Second", 455);

        System.out.println(splitedTime(Playlist.playlistLength(s1,s2)));

    }

    private static String splitedTime(int time) {
        int hours = time / IN_HOURS; // pelne godziny
        time %= IN_HOURS; //wartosc czasu zmienia sie na reszte z dzielenia
                                             // czasu przez czas w godzinach
        int minutes = time / IN_MINUTES; // pelne minuty
        time %= IN_MINUTES; //czas zmienia sie na reszte z dzielenia
        int seconds = time;

        return hours + "h : " + minutes + "min : " + seconds + "sec";
    }


}
