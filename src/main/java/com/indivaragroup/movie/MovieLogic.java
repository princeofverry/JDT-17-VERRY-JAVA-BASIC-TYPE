package com.indivaragroup.movie;

import com.indivaragroup.movie.dto.MovieDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class MovieLogic {

    public void movieList() {

        ArrayList<MovieDTO> suzumariList = new ArrayList<>();

        suzumariList.add(new MovieDTO("STAR-004", "2025-05-04"));
        suzumariList.add(new MovieDTO("STAR-123", "2026-02-10"));
        suzumariList.add(new MovieDTO("STAR-789", "2024-11-20"));
        suzumariList.add(new MovieDTO("STAR-999", "2026-05-01"));

        ArrayList<String> listCodeOutdated = new ArrayList<>();

        LocalDate targetDate = LocalDate.of(2026, 1, 1);

        // Filter movie yang rilis sebelum 2026
        for (MovieDTO movie : suzumariList) {

            if (movie.getReleaseDate().isBefore(targetDate)) {
                listCodeOutdated.add(movie.getReleaseCode());
            }

        }

        // Output hasil
        System.out.println("List code film fav gueee:");
        System.out.println(listCodeOutdated);
    }
}