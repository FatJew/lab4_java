package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
class Motel extends Hotel {
    private String highwayNumber;
    private int highwayKilometer;
    private String startCity;
    private String endCity;

    public Motel( String name, int totalRooms, int availableRooms, int rating, int bookedRoomsCount, String highwayNumber, int highwayKilometer, String startCity, String endCity ) {
        super(name,totalRooms,availableRooms,rating,bookedRoomsCount);
        this.highwayNumber=highwayNumber;
        this.highwayKilometer=highwayKilometer;
        this.startCity=startCity;
        this.endCity=endCity;
    }

    @Override
    public String getLocation() {
        return startCity + "-" + endCity + ", " + highwayKilometer + "km";
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + ",highwayNumber,highwayKilometer,startCity,endCity";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + "," + highwayNumber+ "," + highwayKilometer+ "," + startCity+ "," + endCity;
    }
}