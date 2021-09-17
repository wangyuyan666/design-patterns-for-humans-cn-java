package chain_of_responsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        // Let's prepare a chain like below
        // $bank->$paypal->$bitcoin
        //
        // First priority bank
        // f bank can't pay then paypal
        // If paypal can't pay then bit coin

        Bank bank = new Bank(100); // Bank with balance 100
        PayPal payPal = new PayPal(200); // Paypal with balance 200
        Bitcoin bitcoin = new Bitcoin(300); // Bitcoin with balance 300

        bank.setNext(payPal);
        payPal.setNext(bitcoin);

        // Let's try to pay using the first priority i.e. bank
        bank.pay(259);
        // Output will be
        // ==============
        // Cannot pay using bank. Proceeding ..
        // Cannot pay using paypal. Proceeding ..:
        // Paid 259 using Bitcoin!
    }
}
