package aggregation.Travel;

import java.math.BigDecimal;
import java.util.ArrayList;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Main {
    public static void main(String []args) {
        TravelAgency allTours = new TravelAgency(new ArrayList<>());

        allTours.addTour(new Tour("Latvia", VoucherType.SHOPPING, TransportType.BUS, FoodType.BED_AND_BREAKFAST, 3, BigDecimal.valueOf(350)));
        allTours.addTour(new Tour("Russia", VoucherType.TREATMENT, TransportType.TRAIN, FoodType.FULL_BOARD, 14, BigDecimal.valueOf(1699.00)));
        allTours.addTour(new Tour("Ukraine", VoucherType.RECREATION, TransportType.BUS, FoodType.ROOM_ONLY, 9, BigDecimal.valueOf(750.00)));
        allTours.addTour(new Tour("Egypt", VoucherType.TOUR, TransportType.AIRPLANE, FoodType.ALL_INCLUSIVE, 7, BigDecimal.valueOf(1111.00)));
        allTours.addTour(new Tour("Montenegro", VoucherType.TOUR, TransportType.AIRPLANE, FoodType.BED_AND_BREAKFAST, 7, BigDecimal.valueOf(999.00)));
        allTours.addTour(new Tour("Egypt", VoucherType.TOUR, TransportType.AIRPLANE, FoodType.ROOM_ONLY, 11, BigDecimal.valueOf(1499.99)));

        allTours.showTours();
        allTours.sortToursByCost();
        allTours.showTours();
        TravelAgency toursForClient;
        toursForClient = allTours.searchByName("Egypt", "Latvia")
                .searchByFood(FoodType.ALL_INCLUSIVE)
                .searchByCost(BigDecimal.valueOf(1000), BigDecimal.valueOf(1200));
        toursForClient.showTours();
    }

}
