package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {


    @Test
    void getLocation() {

        Hotel hotels = new Hotel("Eurohotel", 50, 50, 4, 50) {
            @Override
            public String getLocation() {
                return null;
            }
        };

        assertEquals(null, hotels.getLocation());

    }


}