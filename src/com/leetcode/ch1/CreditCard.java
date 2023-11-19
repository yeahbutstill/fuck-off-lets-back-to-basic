package com.leetcode.ch1;

public class CreditCard {
    // Instance variable
    private final String customer; // Name of the customer
    private final String bank; // Name of the bank
    private final String account; // Account identifier
    private final Integer limit; // Credit limit
    protected double balance; // Curent balance

    // Constructor
    public CreditCard(String customer, String bank, String account, Integer limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, Integer limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = 0.0; // Use a balance of zero as default
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit); // implicit cast
    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] =
                new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }

    // Accessor methods
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public Integer getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard that)) return false;

        if (Double.compare(that.getBalance(), getBalance()) != 0) return false;
        if (getCustomer() != null
                ? !getCustomer().equals(that.getCustomer())
                : that.getCustomer() != null) return false;
        if (getBank() != null ? !getBank().equals(that.getBank()) : that.getBank() != null)
            return false;
        if (getAccount() != null ? !getAccount().equals(that.getAccount()) : that.getAccount() != null)
            return false;
        return getLimit() != null ? getLimit().equals(that.getLimit()) : that.getLimit() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCustomer() != null ? getCustomer().hashCode() : 0;
        result = 31 * result + (getBank() != null ? getBank().hashCode() : 0);
        result = 31 * result + (getAccount() != null ? getAccount().hashCode() : 0);
        result = 31 * result + (getLimit() != null ? getLimit().hashCode() : 0);
        temp = Double.doubleToLongBits(getBalance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CreditCard{"
                + "customer='"
                + customer
                + '\''
                + ", bank='"
                + bank
                + '\''
                + ", account='"
                + account
                + '\''
                + ", limit="
                + limit
                + ", balance="
                + balance
                + '}';
    }

    // Update methods
    public boolean charge(
            double price) { // Make a charge if charge would surpass limit refuse the charge
        if (price + balance > limit) return false;
        // at this point, the charge is successful
        balance += price; // Update the balance
        // announce the good news
        return true;
    }

    // Make a payment
    public void makePayment(double amount) {
        balance -= amount;
    }
}
