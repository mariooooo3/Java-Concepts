
package JavaFeatures;

public class Song {
    public String name;
    public String composer;
    public String artist;
    public int id;
    public double duration;
    public String genres;


    public Song(String name, String composer, String artist,
                int id, double duration, String genres) {
        this.name = name;
        this.composer = composer;
        this.artist = artist;
        this.id = id;
        this.duration = duration;
        this.genres = genres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return ("Numele melodiei este:" + this.name + ", cantata de:" + this.artist + ", compusa de:"
                + this.composer + ", avand id-ul:" + this.id + ", durata de " + this.duration + " si genul:" + this.genres);
    }

    public String getArtist() {
        return this.artist;
    }

    public String getGenres() {
        return this.genres;
    }

    public double getDuration() {
        return this.duration;
    }

    public int getId() {
        return this.id;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getComposer() {
        return this.composer;
    }

}
