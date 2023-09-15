package ru.netology.stats;

public class StatsService {
    public long getSalesAmount(long[] sales) {
        long salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    public long getAverageMonthSalesAmount(long[] sales) {
        long salesAmount = getSalesAmount(sales);
        return salesAmount / sales.length;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long getQuantityMonthBelowAverage(long[] sales) {
        long averageMonthSalesAmount = getAverageMonthSalesAmount(sales);
        int quantityMonthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthSalesAmount) {
                quantityMonthBelowAverage++;
            }
        }
        return quantityMonthBelowAverage;
    }

    public long getQuantityMonthAboveAverage(long[] sales) {
        long averageMonthSalesAmount = getAverageMonthSalesAmount(sales);
        int quantityMonthAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonthSalesAmount) {
                quantityMonthAboveAverage++;
            }
        }
        return quantityMonthAboveAverage;
    }
}



