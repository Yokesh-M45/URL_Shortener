package org.example;

import java.time.LocalDateTime;

public class URL {

    private int urlId;
    private String originalURL;
    private String shortCode;
    private LocalDateTime createdDate;

    public URL(int urlId, String originalURL, String shortCode) {
        this.urlId = urlId;
        this.originalURL = originalURL;
        this.shortCode = shortCode;
        this.createdDate = LocalDateTime.now();
    }

    public int getUrlId() {
        return urlId;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public String getShortCode() {
        return shortCode;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "URL ID      : " + urlId +
                "\nOriginal URL: " + originalURL +
                "\nShort Code  : " + shortCode +
                "\nCreated Date: " + createdDate;
    }
}