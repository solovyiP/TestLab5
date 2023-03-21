package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = new String[]{"Хлеб ", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        int[]prod = new int [products.length];

        int productNumber = 0;
        int currentPrice = 0;
        int productCount = 0;
        int sumProducts = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб");
        }

        while (true) {
            System.out.println("Введите номер товара (используйте end для выхода из прграммы)");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[]parts = input.split(" ");
            productNumber = Integer.parseInt(parts[0])-1;
            productCount=Integer.parseInt(parts[1]);

            prod[productNumber] = productCount;
            currentPrice = prices[productNumber];
            sumProducts = sum(prod, productNumber, currentPrice,sumProducts);
        }
        for (int i=0; i<products.length; i++){
            if(prod[i]>0);
            System.out.println("Товар: " +products[i]+ " цена: " +prices[i]+ " количество: " +prod[i]+ " всего: "+prices[i]*prod[i]);
        }
        System.out.println("Всего: " +sumProducts+" руб");
    }
    public static int sum(int[] prod, int productNumber, int currentPrice, int sumProducts){
        return sumProducts= sumProducts + prod[productNumber]*currentPrice;
    }
}