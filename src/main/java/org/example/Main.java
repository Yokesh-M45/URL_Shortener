package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        URLShortener service = new URLShortener();

        while (true) {

            System.out.println("\n===== URL SHORTENER =====");
            System.out.println("1. Shorten URL");
            System.out.println("2. Open Short URL");
            System.out.println("3. View All URLs");
            System.out.println("4. Delete URL");
            System.out.println("5. Search URL");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Original URL: ");
                    String originalURL = sc.nextLine();

                    service.shortenURL(originalURL);
                    break;

                case 2:
                    System.out.print("Enter Short Code: ");
                    String shortCode = sc.nextLine();

                    service.openURL(shortCode);
                    break;

                case 3:
                    service.viewAllURLs();
                    break;

                case 4:
                    System.out.print("Enter URL ID: ");
                    int id = sc.nextInt();

                    service.deleteURL(id);
                    break;

                case 5:
                    System.out.print("Enter URL or Short Code to search: ");
                    String keyword = sc.nextLine();

                    service.searchURL(keyword);
                    break;

                case 6:
                    System.out.println("\nThank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice!");
            }
        }
    }
}