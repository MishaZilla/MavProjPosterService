package org.example.services;

public class PosterService {
    private String[] movies = new String[0];
    private int limit;

    public PosterService() {
        this.limit = 5;
    }

    public PosterService(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] answer = new String[resultLength];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = movies[movies.length - 1 - i];

        }
        return answer;
    }
}