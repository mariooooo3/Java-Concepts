package Abstraction.task3;

import java.util.ArrayList;


public abstract class Album {
    protected ArrayList<Song> songs = new ArrayList<>();

    abstract void addSong(Song song);

    public void removeSong(Song song) {
        songs.remove(song);

    }


    public String toString() {
        return "Album: " + "{" + songs + "}";
    }


}

class DangerousAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (isPrime(song.getId())) {
            songs.add(song);
            System.out.println("Melodia " + song.getName() + " a fost adaugata cu succes in DangerousAlbum:");
        } else
            System.out.println("Melodia " + song.getName() + " nu poate fi adaugata in DangerousAlbum :(");
    }

    public boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}

class ThrillerAlbum extends Album {

    @Override
    public void addSong(Song song) {
        if (song.getComposer().equals("Michael Jackson") && song.getId() % 2 == 0) {
            songs.add(song);
            System.out.println("Melodia " + song.getName() + " a fost adaugata cu succes in ThrillerAlbum:");
        } else
            System.out.println("Melodia " + song.getName() + " nu poate fi adaugata in ThrillerAlbum:(");
    }
}

class BadAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (isPalindrome(song.getId()) && song.getName().length() == 3) {
            songs.add(song);
            System.out.println("Melodia " + song.getName() + " a fost adaugata cu succes in BadAlbum:");
        } else
            System.out.println("Melodia " + song.getName() + " nu poate fi adaugata in BadAlbum:(");
    }

    static boolean isPalindrome(int n) {
        int reverse = 0;

        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        // If reverse is equal to the original number, the
        // number is palindrome
        return (reverse == Math.abs(n));
    }


}