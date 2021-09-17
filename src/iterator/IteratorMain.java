package iterator;

public class IteratorMain {
    public static void main(String[] args) {
        StationList stationList = new StationList();

        stationList.addStation(new RadioStation(89));
        stationList.addStation(new RadioStation(101));
        stationList.addStation(new RadioStation(102));
        stationList.addStation(new RadioStation(103.2f));

        while (stationList.hasNext()) {
            RadioStation next = stationList.next();
            System.out.printf("frequency is %s%n", next.getFrequency());
        }

        stationList.removeStation(new RadioStation(89)); // Will remove station 89
    }
}
