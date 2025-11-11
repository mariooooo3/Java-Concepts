package JavaFeatures;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Playlist {
    ArrayList<Song> songs = new ArrayList<>();

    public Playlist() {
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
        songs.add(s5);
        songs.add(s6);
        songs.add(s7);
        songs.add(s8);
        songs.add(s9);
        songs.add(s10);
        songs.add(s11);
        songs.add(s12);
        songs.add(s13);
        songs.add(s14);

    }

    Song s1 = new Song("NOKIA", "Drake", "PartyNextDoor", 2, 2.50, "POP");
    Song s2 = new Song("Lightspeed", "Avenoir", "Avenoir", 4, 3.15, "TRAP");
    Song s3 = new Song("Diva", "Don Toliver", "Don Toliver", 6, 3.21, "POP");
    Song s4 = new Song("Tiramisu", "Don", "Toliver", 10, 4.29, "TRAP");
    Song s5 = new Song("Greseli", "Oscar", "Oscar", 3, 2.35, "TRAP");
    Song s6 = new Song("Scuze", "Oscar", "Aerovr", 12, 3.35, "TRAP");
    Song s7 = new Song("Ploaia", "Rava", "Rava", 1, 3.40, "POP");
    Song s8 = new Song("Ploua", "Smiley", "Smiley", 14, 2.15, "TRAP");
    Song s9 = new Song("Sk8", "JID", "JID", 18, 1.41, "POP");
    Song s10 = new Song("Big Poe", "Tyler", "The Creator", 20, 3.41, "TRAP");
    Song s11 = new Song("2TONE", "Yeat", "Yeat", 42, 5.35, "POP");
    Song s12 = new Song("SAMAN", "Rava", "Rava", 20, 1.20, "TRAP");
    Song s13 = new Song("Clipa/Monstru", "Oscar", "Aerovr", 32, 2.55, "TRAP");
    Song s14 = new Song("Cant", "Travis", "Travis", 24, 1.41, "POP");


    public static void main(String[] args) {
        Playlist pl = new Playlist();

        Stream<Song> playlistStream3 = Stream.of(new Song("2TONE", "Yeat", "Yeat", 42, 5.35, "POP"),
                new Song("SAMAN", "Rava", "Rava", 20, 1.20, "TRAP"));

        Stream<Song> playlistStream4 = Stream.of(new Song("Clipa/Monstru", "Oscar", "Aerovr", 32, 2.55, "TRAP"),
                new Song("Cant", "Travis", "Travis", 24, 1.41, "POP"));

        Stream<Stream<Song>> playlistStream5 = Stream.of(playlistStream3, playlistStream4);

        System.out.println("\n1.Playlist Filter By Composer");
        pl.songs.stream().filter(playlist -> playlist.getComposer().equals("Smiley"))
                .forEach(System.out::println);

        System.out.println("\n2.Lowercase -> Uppercase Name");
        pl.songs.stream().peek(playlist -> playlist.setName(playlist.getName().toUpperCase()))
                .forEach(System.out::println);

        System.out.println("\n3.Flat Map");
        playlistStream5.flatMap(Function.identity())
                .forEach(System.out::println);

        System.out.println("\n4.GroupBy Music Genres");
        Map<String, List<Song>> songsByGenre =
                pl.songs.stream().collect(Collectors.groupingBy(genres -> genres.getGenres().equals("TRAP") ? "TRAP" : "POP"));
        for (String genre : songsByGenre.keySet()) {
            System.out.println(genre + ":");
            for (Song s : songsByGenre.get(genre)) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("\n5.Album Duration");
        double duration = pl.songs.stream()
                .mapToDouble(Song::getDuration)
                .sum();
        System.out.println("Durata totala a albumului este:" + duration + " de minute");

        System.out.println("\n6.Sorted By ID");
        pl.songs.stream().sorted(Comparator.comparing(Song::getId))
                .forEach(System.out::println);

        System.out.println("\n7.Sorted By Artist");
        pl.songs.stream().filter(artist -> artist.getArtist().equals("Rava"))
                .forEach(System.out::println);

        System.out.println("\n8.Album Duration With Reduce");
        double totalDuration = pl.songs.stream()
                .map(Song::getDuration)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println("Durata totala a albumului este:" + totalDuration + " de minute");

        System.out.println("\n9.Sorted By Name");
        pl.songs.stream().sorted(Comparator.comparing(Song::getName))
                .forEach(System.out::println);

        System.out.println("\n10.Uppercase -> Lowercase Genres");
        pl.songs.stream().peek(playlist -> playlist.setGenres(playlist.getGenres().toLowerCase()))
                .forEach(System.out::println);
    }
}