package com.example.android.tourguide;

public class Place {

    private String text;
    private int imageId;
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private String phoneNumber;
    private String url;
    private int numberOfStars = NO_NUMBER_OF_STAR_PROVIDED;
    private static final int NO_NUMBER_OF_STAR_PROVIDED = -1;

    public Place() {
    }

    public Place(int imageId, String name, String address, double latitude, double longitude, String phoneNumber, String url) {
        this.imageId = imageId;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;
        this.url = url;

    }

    public Place(int imageId, String name, String address, double latitude, double longitude, String phoneNumber, String url, int numberOfStars) {
        this.imageId = imageId;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;
        this.url = url;
        this.numberOfStars = numberOfStars;
    }

    public Place(String text, int imageId, String name, String address, double latitude, double longitude, String url) {
        this.imageId = imageId;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.url = url;
        this.text = text;
    }

    public Place(String text, int imageId, String name, String address, double latitude, double longitude) {
        this.imageId = imageId;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.text = text;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean hasStars() {
        return numberOfStars != NO_NUMBER_OF_STAR_PROVIDED;
    }

    public boolean hasPhoneNumber() {
        return phoneNumber != null;
    }

    public boolean hasText() {
        return text != null;
    }

    public boolean hasWeb() {
        return url != null;
    }
}
