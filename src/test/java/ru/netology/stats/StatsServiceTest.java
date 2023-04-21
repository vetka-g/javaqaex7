package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

   @Test
   public void shouldFindSumMonths() {
       StatsService service = new StatsService();
       long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

       int expectedSum = 180;
       int actualSum = service.sumSales(sales);

       Assertions.assertEquals(expectedSum, actualSum);

   }

    @Test
    public void shouldFindAverageSumMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMonthsLessAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsLess = 5;
        int actualMonthsLess = service.lessAverageSales(sales);

        Assertions.assertEquals(expectedMonthsLess, actualMonthsLess);

    }

    @Test
    public void shouldFindMonthsMoreAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsMore = 5;
        int actualMonthsMore = service.moreAverageSales(sales);

        Assertions.assertEquals(expectedMonthsMore, actualMonthsMore);

    }
}
