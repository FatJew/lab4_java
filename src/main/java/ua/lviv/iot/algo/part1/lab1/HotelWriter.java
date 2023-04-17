package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HotelWriter {
    public static void writeToFile(List<Hotel> hotels, String filename) {
        if(hotels == null || hotels.isEmpty()){
            throw new IllegalArgumentException("Hotels list is empty");
        }
        try(FileWriter writer = new FileWriter(filename)){
            // write headers
            writer.write(hotels.get(0).getHeaders() + "\n");

            // write data
            for (Hotel h : hotels) {
                writer.write(h.toCSV() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}