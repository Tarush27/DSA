package pbljlab.surprise_test1;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args){
        Compartment[] com = new Compartment[10];
        Random rand = new Random();
        for(int i = 0;i<10;i++){
            int random = rand.nextInt((4-1) + 1) + 1;
            if(random == 1){
                com[i] = new FirstClass();
            }
            else if(random == 2){
                com[i] = new General();
            }
            else if(random == 3){
                com[i] = new Ladies();
            }
            else if(random == 4){
                com[i] = new Luggage();
            }
            com[i].notice();
        }
    }
}
