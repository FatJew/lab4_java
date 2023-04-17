package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelWriterTest {

    @Test
    public void testWriteEmptyList() {
    String fileName = "test_write_empty_list.csv";
    List<Hotel> hotels = Collections.emptyList();
    HotelWriter hotelWriter = new HotelWriter();
    assertThrows(IllegalArgumentException.class, () -> hotelWriter.writeToFile(hotels, fileName));
    }
}