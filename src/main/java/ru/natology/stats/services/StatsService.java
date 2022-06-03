package ru.natology.stats.services;

public class StatsService {

    public int allAmountSales(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int averageCheckMonth(int[] sales) {
        int avgCheck = allAmountSales(sales) / sales.length;

        return avgCheck;

    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessAverageCheckMonth(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageCheckMonth(sales)) {
                month++;
            }

        }
        return month;


    }

    public int moreAverageCheckMonth(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageCheckMonth(sales)) {
                month++;
            }

        }
        return month;

    }
}






