package ru.natology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.allAmountSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void checkMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCheckMonth = 15;
        int actualCheckMonth = service.averageCheckMonth(sales);
        Assertions.assertEquals(expectedCheckMonth, actualCheckMonth);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }


    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void totalLessAverageCheckMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxCheck = 5;
        int actualMaxCheck = service.lessAverageCheckMonth(sales);
        Assertions.assertEquals(expectedMaxCheck, actualMaxCheck);
    }


    @Test
    public void totalMoreAverageCheckMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxCheck = 5;
        int actualMaxCheck = service.moreAverageCheckMonth(sales);
        Assertions.assertEquals(expectedMaxCheck, actualMaxCheck);
    }

}
