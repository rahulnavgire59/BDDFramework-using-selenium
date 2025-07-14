package pojo_classes;

public class Room{
    public String roomType;
    public int beds;
    public int maxOccupancy;
    public boolean available;

    public String getRoomType() {
        return roomType;
    }

    public Room(String roomType, int beds, int maxOccupancy, boolean available) {
        this.roomType = roomType;
        this.beds = beds;
        this.maxOccupancy = maxOccupancy;
        this.available = available;
    }

    public Room() {
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", beds=" + beds +
                ", maxOccupancy=" + maxOccupancy +
                ", available=" + available +
                '}';
    }
}