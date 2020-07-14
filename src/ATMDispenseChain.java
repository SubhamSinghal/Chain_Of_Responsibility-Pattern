import chainofresponsibility.*;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain chain;

    public ATMDispenseChain() {
        chain = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        chain.setNextChain(c2);
        chain.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.chain.dispense(new CustomCurrency(amount));
        }
    }
}
