package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotelTest {

    @Test
    void getLocation() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("Lviv" + "-" + "Kyiv" + ", " + 540 + "km", motel.getLocation());
    }

    @Test
    void getHighwayNumber() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("E61", motel.getHighwayNumber());
    }

    @Test
    void getHighwayKilometer() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals(540, motel.getHighwayKilometer());
    }

    @Test
    void getStartCity() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("Lviv", motel.getStartCity());
    }

    @Test
    void getEndCity() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("Kyiv", motel.getEndCity());
    }

    @Test
    void setHighwayNumber() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        motel.setHighwayNumber("E61");
        assertEquals("E61", motel.getHighwayNumber());
    }

    @Test
    void setHighwayKilometer() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        motel.setHighwayKilometer(540);
        assertEquals(540, motel.getHighwayKilometer());
    }

    @Test
    void setStartCity() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        motel.setStartCity("Lviv");
        assertEquals("Lviv", motel.getStartCity());
    }

    @Test
    void setEndCity() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        motel.setEndCity("Kyiv");
        assertEquals("Kyiv", motel.getEndCity());
    }

    @Test
    void testToString() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");

        assertEquals("Motel(super=Hotel(name=Highway Motel, totalRooms=23, availableRooms=23, rating=3, bookedRoomsCount=0), highwayNumber=E61, highwayKilometer=540, startCity=Lviv, endCity=Kyiv)", motel.toString());
    }
    @Test
    void getHeaders() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("name,totalRooms,availableRooms,rating,bookedRoomsCount,highwayNumber,highwayKilometer,startCity,endCity", motel.getHeaders());
    }
    @Test
    void toCSV() {
        Motel motel = new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv");
        assertEquals("Highway Motel,23,23,3,0,E61,540,Lviv,Kyiv", motel.toCSV());
    }
}