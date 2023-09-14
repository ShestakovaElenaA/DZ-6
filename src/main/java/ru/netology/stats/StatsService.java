package ru.netology.stats;

public class StatsService {
    public long getSalesAmount(long[] Sales) { 
        long SalesAmount = 0;
        for (int i = 0; i < Sales.length; i++) {
            SalesAmount += Sales[i];
        }
        return SalesAmount;
    }

    public long getAverageMonthSalesAmount(long[] Sales) {
        long SalesAmount = getSalesAmount(Sales);
        return SalesAmount / Sales.length;
    }

    public int getMaxMonth(long[] Sales) {
        int MaxMonth = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] >= Sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int getMinMonth(long[] Sales) {
        int MinMonth = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] <= Sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public long getQuantityMonthBelowAverage(long[] Sales) {
        long AverageMonthSalesAmount = getAverageMonthSalesAmount(Sales);
        int QuantityMonthBelowAverage = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] < AverageMonthSalesAmount) {
                QuantityMonthBelowAverage++;
            }
        }
        return QuantityMonthBelowAverage;
    }

    public long getQuantityMonthAboveAverage(long[] Sales) {
        long AverageMonthSalesAmount = getAverageMonthSalesAmount(Sales);
        int QuantityMonthAboveAverage = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] > AverageMonthSalesAmount) {
                QuantityMonthAboveAverage++;
            }
        }
        return QuantityMonthAboveAverage;
    }
}



