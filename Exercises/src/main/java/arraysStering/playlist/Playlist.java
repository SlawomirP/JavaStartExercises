package arraysStering.playlist;

public class Playlist {

   public static int playlistLength (Song ... songs){
        int totalTime = 0;
        for(Song song: songs){
            totalTime += song.getTimeInSec();
        }
        return totalTime;
    }
}
