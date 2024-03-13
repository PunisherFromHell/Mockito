package ru.netology.poster;

public class Poster {
    private String[] movies = new String[0];
    private int limit;

    public Poster() {
        this.limit = 5;
    }

    public Poster(int limit) {
        this.limit = limit;
    }

    public void add(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }


    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int arrayLength;
        if (limit < movies.length) {
            arrayLength = limit;
        } else {
            arrayLength = movies.length;
        }

        String[] result = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
