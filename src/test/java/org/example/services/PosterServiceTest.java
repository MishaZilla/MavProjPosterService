package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterServiceTest {

    @Test
    public void add3Films() {

        PosterService manager = new PosterService();

        manager.addMovie("Безумный макс");
        manager.addMovie("Малифисента");
        manager.addMovie("Карты деньги два ствола");

        String[] expected = {"Безумный макс", "Малифисента", "Карты деньги два ствола"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add0Films() {

        PosterService manager = new PosterService();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5FilmsOutOf6() {

        PosterService manager = new PosterService();

        manager.addMovie("Безумный макс");
        manager.addMovie("Малифисента");
        manager.addMovie("Карты деньги два ствола");
        manager.addMovie("Бладшот");
        manager.addMovie("Джентльмены");
        manager.addMovie("Вперед");


        String[] expected = {"Вперед", "Джентльмены", "Бладшот", "Карты деньги два ствола", "Малифисента"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limit4() {

        PosterService manager = new PosterService(4);

        manager.addMovie("Вверх");
        manager.addMovie("Симпсоны");
        manager.addMovie("Малифисента");
        manager.addMovie("Карты деньги два ствола");
        manager.addMovie("Бладшот");
        manager.addMovie("Джентльмены");
        manager.addMovie("Вперед");


        String[] expected = {"Вперед", "Джентльмены", "Бладшот", "Карты деньги два ствола"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limit2() {

        PosterService manager = new PosterService();

        manager.addMovie("Вверх");
        manager.addMovie("Симпсоны");

        String[] expected = {"Симпсоны", "Вверх"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}