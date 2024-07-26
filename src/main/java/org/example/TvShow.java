package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private final String showName;
    private final int episodeCount;
    private final String genre;

    // Constructor with all parameters
    public TvShow(String showName, int episodeCount, String genre) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }

    // Constructor with title and episode count; genre defaults to null
    public TvShow(String showName, int episodeCount) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = null;
    }

    // Constructor with title and genre; episode count defaults to -1
    public TvShow(String showName, String genre) {
        this.showName = showName;
        this.genre = genre;
        this.episodeCount = -1;
    }

    // Constructor with title only; episode count defaults to -1, genre defaults to null
    public TvShow(String showName) {
        this.showName = showName;
        this.episodeCount = -1;
        this.genre = null;
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

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();

        // Adding shows using various constructors
        shows.add(new TvShow("Breaking Bad", 62, "Crime Drama"));
        shows.add(new TvShow("Friends", 236));
        shows.add(new TvShow("The Crown", "Historical Drama"));

        // User input loop
        while (true) {
            System.out.println("Name of the show: ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Read episode count
            int episodes = -1; // Default value for episode count
            System.out.print("How many episodes? (Leave blank for default): ");
            String episodeInput = sc.nextLine();
            if (!episodeInput.isEmpty()) {
                try {
                    episodes = Integer.parseInt(episodeInput);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for episode count. Setting episode count to -1.");
                }
            }

            System.out.println("What is the genre? (Leave blank for default): ");
            String genre = sc.nextLine();
            if(episodes == -1 && genre.isEmpty()){ //If no episodes or genre
                shows.add(new TvShow(name));
            }
            else if (genre.isEmpty()) { //If no genre
                shows.add(new TvShow(name, episodes));
            }
            else {
                shows.add(new TvShow(name, episodes, genre));
                sc.nextLine(); // Consume leftover newlines
            }
        }

        // Display all shows
        for (TvShow show : shows) {
            System.out.println("The name of the show is " + show.getShowName() +
                    " with " + show.getEpisodeCount() + " episodes. Genre is " + show.getGenre());
        }
    }
}
