package aggregation.Bank;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Lukanev A.M.", new ArrayList<>());

        client.addAccount(new Account(10000017, new BigDecimal("1000.00")));
        client.addAccount(new Account(10000025, new BigDecimal("-586.00")));
        client.addAccount(new Account(10000011, new BigDecimal("3054.95")));
        client.addAccount(new Account(10000015, new BigDecimal("-234.64")));
        client.addAccount(new Account(10000099, new BigDecimal("1000.00")));
        client.addAccount(new Account(10000001, new BigDecimal("1000.00")));

        client.printAccounts();
        client.sortAccounts();
        client.printAccounts();
        client.lockAccount(10000015);
        client.printAccounts();
        client.searchAccount(10000011);
        client.sumAccountsByBalance();
        client.sumAccountsByPositiveBalance();
        client.sumAccountsByNegativeBalance();
    }
}
