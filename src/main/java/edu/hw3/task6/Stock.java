package edu.hw3.task6;

public record Stock(String title, double price) {
    public static int compare(Stock stock1, Stock stock2) {
        return Double.compare(stock2.price, stock1.price);
    }
}
