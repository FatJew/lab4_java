package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResortHotelTest {

    @Test
    void getLocation() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals("Beach Resort", resortHotel.getLocation());
    }

    @Test
    void getAdultPools() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals(3, resortHotel.getAdultPools());
    }

    @Test
    void getChildrenPools() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals(1, resortHotel.getChildrenPools());
    }

    @Test
    void getRestaurants() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals(2, resortHotel.getRestaurants());
    }

    @Test
    void getComplexName() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals("Beach Resort", resortHotel.getComplexName());
    }

    @Test
    void setAdultPools() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        resortHotel.setAdultPools(3);
        assertEquals(3, resortHotel.getAdultPools());
    }

    @Test
    void setChildrenPools() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        resortHotel.setChildrenPools(1);
        assertEquals(1, resortHotel.getChildrenPools());
    }

    @Test
    void setRestaurants() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        resortHotel.setRestaurants(2);
        assertEquals(2, resortHotel.getRestaurants());
    }

    @Test
    void setComplexName() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        resortHotel.setComplexName("Beach Resort");
        assertEquals("Beach Resort", resortHotel.getComplexName());
    }

    @Test
    void testToString() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals("ResortHotel(super=Hotel(name=Eurohotel, totalRooms=50, availableRooms=50, rating=4, bookedRoomsCount=0), adultPools=3, childrenPools=1, restaurants=2, complexName=Beach Resort)", resortHotel.toString());
    }
    @Test
    void getHeaders() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals("name,totalRooms,availableRooms,rating,bookedRoomsCount,adultPools,childrenPools,restaurants,complexName", resortHotel.getHeaders());
    }
    @Test
    void toCSV() {
        ResortHotel resortHotel = new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort");
        assertEquals("Eurohotel,50,50,4,0,3,1,2,Beach Resort", resortHotel.toCSV());
    }
}