package Abstraction.task3;


public class Main {
    public static void main(String[] args) {
        Song s = new Song("FLY", 843, "Aerozen");
        Song s2 = new Song("Open Hearts", 2, "The Weeknd");
        Song s3 = new Song("Chicago", 10, "Michael Jackson");
        Song s4 = new Song("Bad", 515, "Michael Jackson");
        Song s5 = new Song("Crush", 17, "Playboy");

        DangerousAlbum dangerAlbum = new DangerousAlbum();
        ThrillerAlbum thrillerAlbum = new ThrillerAlbum();
        BadAlbum badAlbum = new BadAlbum();

        thrillerAlbum.addSong(s3);
        thrillerAlbum.addSong(s);
        dangerAlbum.addSong(s2);
        badAlbum.addSong(s4);
        dangerAlbum.addSong(s5);

        dangerAlbum.removeSong(s2);
        System.out.println("Melodia Open Hearts a fost scosa din DangerousAlbum ");

        System.out.println("Thriller" + thrillerAlbum);
        System.out.println("Bad" + badAlbum);
        System.out.println("Danger" + dangerAlbum);


    }
}
