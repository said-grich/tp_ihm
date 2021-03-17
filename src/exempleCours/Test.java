package exempleCours;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        ArrayList <Integer> vect= new ArrayList<Integer>();
        System.out.println("donnee le taille  voulue: ");
        int taille = scanner.nextInt();
        System.out.println("Saisie de "+taille+"valeure :");
        while ( vect.size() <taille){
            System.out.println("Entrez la valeur"+ vect.size()+":");
            int val=scanner.nextInt();
            if ((val<0)&&(!vect.isEmpty())){
                vect.remove( vect.size()-1);
            }
            else if (val==0){
                vect.clear();
            }
            else if (val>0){
                vect.add(val);
            }
        }
    }
}
