package aggregation.Bank;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void searchAccount(long searchNumber) {
        boolean flag = false;
        for (Account a : accounts) {
            if(a.getNumber() == searchNumber) {
                System.out.println(a.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("account " + searchNumber + "not found");
        }
    }

    public void sortAccounts() {
        accounts.sort(Comparator.comparing(obj -> obj.getNumber()));
    }

    public void sumAccountsByBalance(){
        BigDecimal sumAllBalances = new BigDecimal("0");
        for (Account a : accounts) {
            sumAllBalances = sumAllBalances.add(a.getBalance());
        }
        System.out.println("amount on all accounts: " + sumAllBalances);
    }

    public void sumAccountsByPositiveBalance(){
        BigDecimal sumAllPositiveBalances = new BigDecimal("0");
        for (Account a : accounts) {
            if(a.getBalance().compareTo(BigDecimal.valueOf(0)) > 0)
            sumAllPositiveBalances = sumAllPositiveBalances.add(a.getBalance());
        }
        System.out.println("amount on all positive accounts: " + sumAllPositiveBalances);
    }

    public void sumAccountsByNegativeBalance(){
        BigDecimal sumAllNegativeBalances = new BigDecimal("0");
        for (Account a : accounts) {
            if(a.getBalance().compareTo(BigDecimal.valueOf(0)) < 0)
                sumAllNegativeBalances = sumAllNegativeBalances.add(a.getBalance());
        }
        System.out.println("amount on all negative accounts: " + sumAllNegativeBalances);
    }

    public void lockAccount(long numberAccount) {
        for (Account a : accounts) {
            if(a.getNumber() == numberAccount) {
                a.setStatus(false);
            }
        }
    }

    public void unlockAccount(long numberAccount) {
        for (Account a : accounts) {
            if(a.getNumber() == numberAccount) {
                a.setStatus(true);
            }
        }
    }

    public void printAccounts(){
        System.out.println(this.name);
        for (Account a : accounts) {
            System.out.println(a.toString());
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return "name: " + name + "\naccounts: " + accounts.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
