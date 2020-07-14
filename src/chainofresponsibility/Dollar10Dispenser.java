package chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(CustomCurrency currency) {
        if(currency.getAmount() >= 10) {
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) {
                this.dispenseChain.dispense(new CustomCurrency(remainder));
            }
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
