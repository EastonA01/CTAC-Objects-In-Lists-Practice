package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private final String showName;
    private final int episodeCount;
    private final String genre;
    // Constructor
    public TvShow(String showName, int episodeCount, String genre) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }
    public String getShowName() {
        return showName;
    }
    public int getEpisodeCount() {
        return episodeCount;
    }
    public String getGenre() {
        return genre;
    }


    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();
        while(true){
            System.out.println("Name of the show: ");
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("How many episodes? ");
            int episodes = sc.nextInt();
            System.out.println("What is the genre? ");
            String genre = sc.next();
            shows.add(new TvShow(name, episodes, genre));
            sc.nextLine(); // Consume leftover newlines
        }
        for (TvShow show : shows) {
            System.out.println("The name of the show is " + show.getShowName() + " with " + show.getEpisodeCount() + " number of episodes. The genre is " + show.getGenre());
        }
    }
}
