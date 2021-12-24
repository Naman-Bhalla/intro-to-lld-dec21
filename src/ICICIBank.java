public class ICICIBank implements Bank {

    public void getBalance() {}

    public byte[] getCardDetails() {}

    public void checkBalanceI() {
        getBalance();
    }

    public String getCardDetailsI() {
        return getCardDetails().toString();
    }
}
