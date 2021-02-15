//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

public class Train {

    String station;
    int numberTrain;
    String departureTime;
    public Train(String station, int numberTrain, String departureTime) {
        this.station = station;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }
    public static void main(String[] args) {
        Train []trains = new Train[5];
        trains[0] = new Train("Vitebsk", 697, "09:25");
        trains[1] = new Train("Minsk", 345, "12:50");
        trains[2] = new Train("Brest", 222, "16:40");
        trains[3] = new Train("Minsk", 346, "19:10");
        trains[4] = new Train("Vitebsk", 134, "13:07");
        printTrains(trains);

        trains = sortByNumberTrain(trains);
        printTrains(trains);

        infoNumberTrain(trains, 222);

        trains = sortByStation(trains);
        printTrains(trains);
    }
    public static Train[] sortByNumberTrain(Train[] trains) {
        Train []sortTrains = trains;
        for (int i = 1; i < sortTrains.length; i++) {
            if (sortTrains[i-1].numberTrain > sortTrains[i].numberTrain) {
                Train buf = sortTrains[i];
                sortTrains[i] = sortTrains[i - 1];
                sortTrains[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        return sortTrains;
    }
    public static void infoNumberTrain(Train []trains, int number) {
        int count = 0;
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].numberTrain == number) {
                System.out.println("Number of train: " + trains[i].numberTrain + "\t,Station: " + trains[i].station +  ", \tDeparture time: " + trains[i].departureTime);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Train number "+ number + " is not on the list");
        }
        System.out.println("\n");
    }
    public int compareTo(Train train) {
        int result = this.station.compareTo(train.station);
        if (result == 0) {
            result = this.departureTime.compareTo(train.departureTime);
        }
        return result;
    }
    public static Train[] sortByStation(Train[] trains) {
        Train []sortTrains = trains;
        for (int i = 1; i < sortTrains.length; i++) {
            if (sortTrains[i-1].compareTo(sortTrains[i]) > 0) {
                Train buf = sortTrains[i];
                sortTrains[i] = sortTrains[i - 1];
                sortTrains[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        return sortTrains;
    }
    public void print() {
        System.out.println("Station: " + station + ", \tNumber of train: " + numberTrain + ", \tDeparture time: " + departureTime);
        System.out.println("\n");
    }
    public static void printTrains(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Station: " + trains[i].station + ", \tNumber of train: " + trains[i].numberTrain + ", \tDeparture time: " + trains[i].departureTime);
        }
        System.out.println("\n");
    }
}
