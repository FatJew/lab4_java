package ua.lviv.iot.algo.part1.lab1;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
@Getter
public class HotelManager {
    private final List<Hotel> hotels = new ArrayList<>();
    public void addHotel(final Hotel hotel){
        hotels.add(hotel);
    }
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        hotelManager.addHotel(new ResortHotel("Eurohotel",50 ,50,4,0,3,1,2,"Beach Resort"));
        hotelManager.addHotel(new Motel("Highway Motel", 23, 23, 3, 0,"E61", 540,"Lviv","Kyiv"));

        for (Hotel hotel : hotelManager.getHotels()) {
            System.out.println(hotel);
        }
        HotelWriter hotelWriter = new HotelWriter();
        hotelWriter.writeToFile(hotelManager.getHotels(), "hotels.csv");
    }
}