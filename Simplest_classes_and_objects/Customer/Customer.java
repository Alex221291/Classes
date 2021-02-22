package task8;

public class Customer {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;

    public Customer(long id, String surname, String name, String patronymic, String address, long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int compareTo(Customer customer){
        return   this.surname.compareTo(customer.surname);
    }

    public boolean cardNumberInInterval(long beginInterval, long endInterval){
        return (this.creditCardNumber >= beginInterval) && (this.creditCardNumber <= endInterval);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + surname +
                " " + name +
                " " + patronymic  +
                "\t" + address  +
                "\t" + creditCardNumber +
                "\t" + bankAccountNumber;
    }
}
