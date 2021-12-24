public class YesBank implements Bank {

    public void checkBalance() {}
    public String getCardNumber() {}

    @Override
    public void checkBalanceI() {
        checkBalance();
    }

    @Override
    public String getCardDetailsI() {
        return getCardNumber();
    }
}
