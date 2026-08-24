package org.example;

public class ShortURL {

    private String shortCode;
    private String originalURL;

    public ShortURL(String shortCode, String originalURL) {
        this.shortCode = shortCode;
        this.originalURL = originalURL;
    }

    public String getShortCode() {
        return shortCode;
    }

    public String getOriginalURL() {
        return originalURL;
    }
}