package bank;
import java.util.*;

public class BankCustomer {

     PersonalData personalData;
     List<BankAccount> numOfAccounts;
    private String id;

    BankCustomer(PersonalData owner, List<BankAccount> numAcc) {
        this.personalData = owner;
        this.numOfAccounts= numAcc;

    }

    public static void main(String[] args) {

       PersonalData data = new PersonalData("Jan", "Kos","11111111111");
       //BankCustomer Janusz = new BankCustomer(data);

    }

    public String getId() {
        return id;
    }


}

