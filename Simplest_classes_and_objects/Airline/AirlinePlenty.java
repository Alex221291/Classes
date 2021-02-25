package Airline;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class AirlinePlenty {
    private Airline[] airlines;

    public AirlinePlenty() {

        airlines = new Airline[0];
    }

    public AirlinePlenty(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void addAirline(Airline airline) {
        airlines = Arrays.copyOf(airlines, airlines.length + 1);
        airlines[airlines.length - 1] = airline;
    }

    public void print() {
        System.out.println("List of flights:");
        for (Airline a : airlines) {
            System.out.println(a.toString());
        }
        System.out.println("");
    }

    //поиск по пункту назначения
    public void findByDestination(String inputDestinationPoint) {
        System.out.println("Flights to the destination "+inputDestinationPoint+" :");
        for (Airline a : airlines) {
            if (a.getDestination().equals(inputDestinationPoint)) {
                System.out.println(a.toString());
            }
        }
        System.out.println("");
    }

    public void findByDay(DayOfWeek inputDayOfWeek) {

        System.out.println("Flights per day of the week - "+inputDayOfWeek+" :");

        for (Airline a : airlines) {
            if (a.getDayOfWeek().equals(inputDayOfWeek)) {
                System.out.println(a.toString());
            }
        }
        System.out.println("");
    }

    public void findByDayAndTime(DayOfWeek inputDayOfWeek, LocalTime inputTime) {

        System.out.println("Flights per day of the week - " + inputDayOfWeek + " and after " + inputTime + ": ");

        for (Airline a : airlines) {
            if (a.getDayOfWeek().equals(inputDayOfWeek) && inputTime.isBefore(a.getDepartureTime())) {
                System.out.println(a.toString());
            }
        }
        System.out.println("");
    }
    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }
}
