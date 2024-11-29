import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String ownerName;
    private List<String> transactionLog = new ArrayList<String>();
    public BankAccount(){
        balance = 0;
        ownerName = "SreenivasaRao";
    }
    public BankAccount(double balance1, String ownerName1){
        balance = balance1;
        ownerName = ownerName1;
    }
    public void addDeposit(double amount) {
        if (balance > 0){
            balance = balance + amount;
            transactionLog.add("Deposited " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount >0 && balance >= amount){
            balance = balance - amount;
            transactionLog.add("Withdrew " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balanceAdd) {
        balance = balanceAdd;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
    public void printTransactionLog(){
        if (transactionLog != null){
            for(int i = 0; i < transactionLog.size(); i++){
                System.out.println(transactionLog.get(i));
            }
        }

    }
}
