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

public class Main {
    public static void main(String[] args) {

        //создаем массив рейсов и наполянем его
        AirlinePlenty ap = new AirlinePlenty();

        ap.addAirline(new Airline("Dubai", 9428, "Boeing 767", LocalTime.of(11, 43), DayOfWeek.SATURDAY));
        ap.addAirline(new Airline("Dublin", 8548, "Boeing 747", LocalTime.of(18, 21), DayOfWeek.MONDAY));
        ap.addAirline(new Airline("Mexico City", 5123, "Airbus A380", LocalTime.of(1, 22), DayOfWeek.FRIDAY));
        ap.addAirline(new Airline("Stockholm", 3845, "Boeing 767", LocalTime.of(8, 5), DayOfWeek.THURSDAY));
        ap.addAirline(new Airline("Beijing", 1374, "Airbus A380", LocalTime.of(21, 49), DayOfWeek.SATURDAY));

        ap.print();

        ap.findByDestination("Mexico City");

        ap.findByDay(DayOfWeek.SATURDAY);

        ap.findByDayAndTime(DayOfWeek.FRIDAY, LocalTime.of(0, 0)); //ищем рейсы по дню недели и не позднее указанного времени
    }
}
