package pbljlab.surprise_test1;

public class ICICIBank extends GeneralBank{
    @Override
    public double getSavingInterestRate() {
        return 4;
    }

    @Override
    public double getFixedInterestRate() {
        return 8.5;
    }
}
