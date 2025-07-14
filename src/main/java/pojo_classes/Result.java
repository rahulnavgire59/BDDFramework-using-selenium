package pojo_classes;

import java.util.ArrayList;

public class Result{
    public int hotelId;
    public String name;
    public double rating;
    public double pricePerNight;

    public int getHotelId() {
        return hotelId;
    }

    public Result() {
    }

    public Result(int hotelId, String name, double rating, double pricePerNight, String currency, ArrayList<String> amenities, Location location, ArrayList<Room> rooms, ArrayList<String> images) {
        this.hotelId = hotelId;
        this.name = name;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
        this.currency = currency;
        this.amenities = amenities;
        this.location = location;
        this.rooms = rooms;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Result{" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", pricePerNight=" + pricePerNight +
                ", currency='" + currency + '\'' +
                ", amenities=" + amenities +
                ", location=" + location +
                ", rooms=" + rooms +
                ", images=" + images +
                '}';
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String currency;
    public ArrayList<String> amenities;
    public Location location;
    public ArrayList<Room> rooms;
    public ArrayList<String> images;
}