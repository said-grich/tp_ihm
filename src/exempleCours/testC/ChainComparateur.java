package exempleCours.testC;


import java.util.Comparator;

 public class ChainComparateur implements Comparator {

    public int compare(Object o1, Object o2) {
        if (((Chien)(o1)).number >((Chien)(o2)).number){
            return 1;
        }
        else if (((Chien)(o1)).number<((Chien)(o2)).number){
            return -1;
        }
        else {
            return 0;
        }
    }
}
