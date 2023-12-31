package com.example.scheduletheevent.data;

public class PopularPlaces {
    private String url;
    private String place_name;
    private String place_location;
    private String price;

    public PopularPlaces(String url, String place_name, String place_location, String price) {
        this.url = url;
        this.place_name = place_name;
        this.place_location = place_location;
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_location() {
        return place_location;
    }

    public void setPlace_location(String place_location) {
        this.place_location = place_location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
