package chainofresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain chain);
    void dispense(CustomCurrency currency);
}
