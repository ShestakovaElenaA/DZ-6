package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    void salesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSalesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void getAverageMonthSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = service.getAverageMonthSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    void getMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxmonth = 8;
        long actualMaxmonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxmonth, actualMaxmonth);
    }

    @Test
    void getMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinmonth = 9;
        long actualMinmonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinmonth, actualMinmonth);
    }

    @Test
    void getQuantityMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedQuantityMonthBelowAverage = 5;
        long actualQuantityMonthBelowAverage = service.getQuantityMonthBelowAverage(sales);

        Assertions.assertEquals(expectedQuantityMonthBelowAverage, actualQuantityMonthBelowAverage);
    }

    @Test
    void getQuantityMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedQuantityMonthAboveAverage = 5;
        long actualQuantityMonthAboveAverage = service.getQuantityMonthAboveAverage(sales);

        Assertions.assertEquals(expectedQuantityMonthAboveAverage, actualQuantityMonthAboveAverage);
    }
}
