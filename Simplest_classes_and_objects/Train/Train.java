package Train;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

public class Train {

    private String station;
    private int numberTrain;
    private String departureTime;
    
    public Train(String station, int numberTrain, String departureTime) {
        this.station = station;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

    public static Train[] sortByNumberTrain(Train[] trains) {
        Train[]sortTrains = trains;
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
    
    public static void infoNumberTrain(Train[]trains, int number) {
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
        Train[]sortTrains = trains;
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

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}

