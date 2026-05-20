package com.indivaragroup.movie.dto;

import java.time.LocalDate;

public class MovieDTO {

    private String releaseCode;
    private LocalDate releaseDate;

    public MovieDTO(String releaseCode, String dateStr) {
        this.releaseCode = releaseCode;
        this.releaseDate = LocalDate.parse(dateStr);
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
