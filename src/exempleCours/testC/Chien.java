package exempleCours.testC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Chien {

    int number;
    Chien(int i){
        this.number=i;
    }
    void imprimer(){
        System.out.println("Chien"+this.number);
    }
    public String toString(){
        return "Chain"+this.number;
    }
    public static void main(String[] args) {
        ArrayList c = new ArrayList();
        Random r = new Random();
        for (var i=0; i<10; i++) c.add(new Chien(r.nextInt(100)));
        for (var i=0; i<c.size(); i++) System.out.println(i + " " +c.get(i));
        Comparator comp = new ChainComparateur();
        System.out.println("max " + Collections.max(c,comp));
        Collections.sort(c,comp);
        for(var i=0; i<c.size(); i++)
            System.out.println(i + " " + c.get(i));
    }
}
