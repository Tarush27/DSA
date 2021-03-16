package pbljlab.surprise_test1;

public class KotMBank extends GeneralBank{
    @Override
    public double getSavingInterestRate() {
        return 6;
    }

    @Override
    public double getFixedInterestRate() {
        return 9;
    }
}
