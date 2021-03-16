package pbljlab.surprise_test1;

public class MainClass {
    public static void main(String[] args){
        ICICIBank ib = new ICICIBank();
        KotMBank kb = new KotMBank();
        System.out.println(ib.getFixedInterestRate());
        System.out.println(ib.getSavingInterestRate());
        System.out.println(kb.getFixedInterestRate());
        System.out.println(kb.getSavingInterestRate());
        GeneralBank gb = new ICICIBank();
        GeneralBank gb1 = new KotMBank();
        System.out.println(gb.getFixedInterestRate());
        System.out.println(gb.getSavingInterestRate());
        System.out.println(gb1.getFixedInterestRate());
        System.out.println(gb1.getSavingInterestRate());
    }
}
