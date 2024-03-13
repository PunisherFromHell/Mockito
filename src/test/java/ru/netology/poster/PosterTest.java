package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterTest {
    @Test
    public void ShouldFindAll() {
        Poster poster = new Poster();
        String movie1 = "Matrix1";
        String movie2 = "Matrix2";
        String movie3 = "Matrix3";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findAll();
        String[] expected = {movie1, movie2, movie3};


        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void ShouldFindLast() {
        Poster poster = new Poster();
        String movie1 = "Matrix1";
        String movie2 = "Matrix2";
        String movie3 = "Matrix3";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findLast();
        String[] expected = {movie3, movie2, movie1};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void ShouldFindLast1() {
        Poster poster = new Poster(2);
        String movie1 = "Matrix1";
        String movie2 = "Matrix2";
        String movie3 = "Matrix3";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findLast();
        String[] expected = {movie3, movie2};


        Assertions.assertArrayEquals(actual, expected);
    }
}





