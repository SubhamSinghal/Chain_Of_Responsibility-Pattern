package chainofresponsibility;

public class Dollar50Dispenser implements  DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(CustomCurrency currency) {
        if(currency.getAmount() >= 50) {
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) {
                this.dispenseChain.dispense(new CustomCurrency(remainder));
            }
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
