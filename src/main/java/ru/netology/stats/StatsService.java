package ru.netology.stats;

import java.util.stream.IntStream;

public class StatsService {


    public int sumSales(long[] sales) {
        int sumAllMonth = 0;
        for (long value : sales) {
            sumAllMonth += value;
        }
        return sumAllMonth;
    }

    public int averageSales(long[] sales) {
        int sumAllMonth = 0;
        for (long value : sales) {
            sumAllMonth += value;
        }
        int sumAverage = sumAllMonth / sales.length;
        return sumAverage;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lessAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int sumMonthsLess = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                sumMonthsLess++;
            }
        }

        return sumMonthsLess;
    }

    public int moreAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int sumMonthsMore = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                sumMonthsMore++;
            }
        }

        return sumMonthsMore;
    }


}
