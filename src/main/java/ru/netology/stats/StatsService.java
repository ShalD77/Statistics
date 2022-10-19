package ru.netology.stats;

public class StatsService {
    public long sumAll(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long AverageAmount(long[] sales) {
        long totalSale = sumAll(sales);
        return totalSale / 12;
    }

    public int PeakSales(long[] sales) {
        int maxMounth = 0;
        long PeakSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (PeakSales <= sales[i]) {
                PeakSales = sales[i];
                maxMounth = i;
            }
        }
        return maxMounth;
    }

    public int MinimumSales(long [] sales) {
        int minMounth = 0;
        long MinimumSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (MinimumSales >= sales [i]) {
                MinimumSales = sales [i];
                minMounth = i;
            }

        }
        return minMounth;
    }

    public int MonthsBelowAverage(long [] sales){
        int counter = 0;
        long Average = AverageAmount(sales);
        for (long sale : sales) {
            if (sale < Average){
                counter++;
            }
            
        }
        return counter;
    }

    public int MonthsAboveAverage (long [] sales){
        int counter = 0;
        long Average = AverageAmount(sales);
        for (long sale : sales) {
            if (sale > Average){
                counter++;
            }

        }
        return counter;
    }
}
