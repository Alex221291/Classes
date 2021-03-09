package aggregation.Travel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class TravelAgency {
    private ArrayList<Tour> tours = new ArrayList<>();

    public TravelAgency(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void sortToursByName() {
        tours.sort(Comparator.comparing(obj -> obj.getName()));
    }

    public void sortToursByVoucher() {
        tours.sort(Comparator.comparing(obj -> obj.getVoucherType()));
    }

    public void sortToursByTransport() {
        tours.sort(Comparator.comparing(obj -> obj.getTransportType()));
    }

    public void sortToursByFood() {
        tours.sort(Comparator.comparing(obj -> obj.getFoodType()));
    }

    public void sortToursByDuration() {
        tours.sort(Comparator.comparing(obj -> obj.getDuration()));
    }

    public void sortToursByCost() {
        tours.sort(Comparator.comparing(obj -> obj.getCost()));
    }
    //1
    public TravelAgency searchByName(String... names) {
        ArrayList<Tour> toursForClientByName = new ArrayList<>();
         for (Tour t : this.tours) {
            for (String currentName : names) {
                if (currentName == t.getName()) {
                    toursForClientByName.add(t);
                }
            }
        }
        return new TravelAgency(toursForClientByName);
    }
    //2
    public TravelAgency searchByVoucher(VoucherType... vouchers) {
        ArrayList<Tour> toursForClientByVoucher = new ArrayList<>();
        for (Tour t : this.tours) {
            for (VoucherType currentVoucher : vouchers) {
                if (currentVoucher.equals(t.getVoucherType())) {
                    toursForClientByVoucher.add(t);
                }
            }
        }
        return new TravelAgency(toursForClientByVoucher);
    }
    //3
    public TravelAgency searchByTransport(TransportType... transports) {
        ArrayList<Tour> toursForClientByTransport = new ArrayList<>();
        for (Tour t : this.tours) {
            for (TransportType currentTransport : transports) {
                if (currentTransport.equals(t.getTransportType())) {
                    toursForClientByTransport.add(t);
                }
            }
        }
        return new TravelAgency(toursForClientByTransport);
    }
    //4
    public TravelAgency searchByFood(FoodType... foods) {
        ArrayList<Tour> toursForClientByFood = new ArrayList<>();
        for (Tour t : this.tours) {
            for (FoodType currentFood : foods) {
                if (currentFood.equals(t.getFoodType())) {
                    toursForClientByFood.add(t);
                }
            }
        }
        return new TravelAgency(toursForClientByFood);
    }
    //5
    public TravelAgency searchByDuration(int minDuration, int maxDuration) {
        ArrayList<Tour> toursForClientByDuration = new ArrayList<>();
        for (Tour t : this.tours) {
                if ((t.getDuration() >= minDuration) && (t.getDuration() <= maxDuration)) {
                    toursForClientByDuration.add(t);
                }
        }
        return new TravelAgency(toursForClientByDuration);
    }
    //6
    public TravelAgency searchByCost(BigDecimal minCost, BigDecimal maxCost) {
        ArrayList<Tour> toursForClientByCost = new ArrayList<>();
        for (Tour t : this.tours) {
            if ((t.getCost().compareTo(minCost) >= 0) && (t.getCost().compareTo(maxCost) <= 0)) {
                    toursForClientByCost.add(t);
            }
        }
        return new TravelAgency(toursForClientByCost);
    }

    public  void showTours() {
        for (Tour t : tours) {
            System.out.println(t.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "tours:\n" + tours.toString();
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }
}
