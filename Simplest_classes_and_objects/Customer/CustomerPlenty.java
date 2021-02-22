package task8;

import java.util.Arrays;

public class CustomerPlenty {
    private Customer[] customers;
    private long currentId = 0;

    public CustomerPlenty() {
        customers = new Customer[0];
    }

    public CustomerPlenty(Customer[] customers) {
        this.customers = customers;
        for(Customer c:customers){
            c.setId(currentId);
            currentId++;
        }
    }

    public void addCustomer(Customer customer) {
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[customers.length - 1] = customer;
        customer.setId(currentId);
        currentId++;
    }

    public void deleteCustomer(long id) {
        customers = Arrays.stream(customers)
                .filter(c -> !(c.getId() == id))
                .toArray(Customer[]::new);
    }

    public void printSortOfSurname() {
        for (int i = 1; i < customers.length; i++) {
            if (customers[i-1].compareTo(customers[i]) > 0) {
                Customer buf = customers[i];
                customers[i] = customers[i - 1];
                customers[i - 1] = buf;
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        System.out.println("List of buyers in alphabetical order:");
        for (Customer c: customers) {
            System.out.println(c.toString());
        }
        System.out.println("");
    }

    public void printCorrectID(long beginInterval, long endInterval) {
        System.out.println("Customers whose card number is within the range of " + beginInterval + " before " + endInterval);
        for (Customer c : customers) {
            if (c.cardNumberInInterval(beginInterval, endInterval)) {
                System.out.println(c.toString());
            }
        }
        System.out.println("");
    }
}
