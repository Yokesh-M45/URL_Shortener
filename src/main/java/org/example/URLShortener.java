package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class URLShortener {

    private List<URL> urls = new ArrayList<>();
    private int nextId = 1;

    public void shortenURL(String originalURL) {

        String shortCode = generateShortCode();

        URL url = new URL(nextId++, originalURL, shortCode);
        urls.add(url);

        System.out.println("\nURL shortened successfully!");
        System.out.println("Short URL : " + shortCode);
    }

    public void openURL(String shortCode) {

        for (URL url : urls) {

            if (url.getShortCode().equals(shortCode)) {

                System.out.println("\nOpening URL...");
                System.out.println("Original URL: " + url.getOriginalURL());
                return;
            }
        }

        System.out.println("\nShort URL not found!");
    }

    public void viewAllURLs() {

        if (urls.isEmpty()) {
            System.out.println("\nNo URLs available.");
            return;
        }

        System.out.println("\n===== ALL URLs =====");

        for (URL url : urls) {
            System.out.println("----------------------------");
            System.out.println(url);
        }
    }

    public void deleteURL(int id) {

        for (URL url : urls) {

            if (url.getUrlId() == id) {

                urls.remove(url);

                System.out.println("\nURL deleted successfully!");
                return;
            }
        }

        System.out.println("\nURL ID not found!");
    }

    public void searchURL(String keyword) {

        boolean found = false;

        for (URL url : urls) {

            if (url.getOriginalURL().toLowerCase()
                    .contains(keyword.toLowerCase())
                    || url.getShortCode().equalsIgnoreCase(keyword)) {

                System.out.println("\n----------------------------");
                System.out.println(url);

                found = true;
            }
        }

        if (!found) {
            System.out.println("\nURL not found!");
        }
    }

    private String generateShortCode() {

        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        String shortCode;

        do {

            StringBuilder code = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                code.append(characters.charAt(
                        random.nextInt(characters.length())));
            }

            shortCode = code.toString();

        } while (isCodeExists(shortCode));

        return shortCode;
    }

    private boolean isCodeExists(String code) {

        for (URL url : urls) {

            if (url.getShortCode().equals(code)) {
                return true;
            }
        }

        return false;
    }
}