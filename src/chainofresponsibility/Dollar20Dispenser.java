package chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(CustomCurrency currency) {
        if(currency.getAmount() >= 20) {
            int num = currency.getAmount()/20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) {
                this.dispenseChain.dispense(new CustomCurrency(remainder));
            }
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
