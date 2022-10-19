package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumAllTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumAll(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageAmountTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.AverageAmount(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void PeakSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.PeakSales(sales);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MinimumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.MinimumSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MonthsBelowAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.MonthsBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void MonthsAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.MonthsAboveAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}


