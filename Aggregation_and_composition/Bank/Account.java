package aggregation.Bank;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
import java.math.BigDecimal;

public class Account {
    private long number;
    private BigDecimal balance;
    private boolean status = true;

    public Account(long number, BigDecimal balance) {
        this.number = number;
        this.balance = balance;
        this.status = true;
    }

    public void addBalance(BigDecimal money) {
        if (status) {
            this.balance.add(money);
        }
        else {
            System.out.println("Account is locked");
        }
    }

    public void subBalance(BigDecimal money) {
        if (status) {
            this.balance.subtract(money);
        }
        else {
            System.out.println("Account is locked");
        }
    }

    @Override
    public String toString() {
        if(status){
            return  "number: " + number +
                    "\tbalance: " + balance;
        }
        else {
            return "locked";
        }

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
