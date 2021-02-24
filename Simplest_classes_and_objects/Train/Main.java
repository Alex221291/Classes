package Train;

public class Main {
    public static void main(String[] args) {
        Train []trains = new Train[5];
        trains[0] = new Train("Vitebsk", 697, "09:25");
        trains[1] = new Train("Minsk", 345, "12:50");
        trains[2] = new Train("Brest", 222, "16:40");
        trains[3] = new Train("Minsk", 346, "19:10");
        trains[4] = new Train("Vitebsk", 134, "13:07");
        Train.printTrains(trains);

        trains = Train.sortByNumberTrain(trains);
        Train.printTrains(trains);

        Train.infoNumberTrain(trains, 222);

        trains = Train.sortByStation(trains);
        Train.printTrains(trains);
    }
}
