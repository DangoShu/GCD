/**
 * Created by DangoShu on 5/13/2016.
 */
import java.util.*;
import java.math.*;

public class Euclid {
    public static int euclid(int a, int b) {
        if (b == 0) {
            return a;
        }
        else
            return euclid(b,remainder(a,b));
    }
    public static int anotherGCD(int[] list, int min) {
        for (int i = min; i > 0; i--) {
            for (int j=0; j < list.length; j++) {
                if (remainder(list[j], i) != 0) {
                    break;
                }
                else if(j == list.length - 1){
                    return i;
                }
            }
        }
        return 0;
    }
    public static int remainder(int i, int j){
        if((i % j == 0) ||( i % j < 5 )|| ((i % j) > (j - 5))){
            return 0;
        }
        else
            return i % j;
    }
    public static void main(String[] args){
        int[] gcdList;
        gcdList = new int[]{14420,9612,27230,49660,12816,132970,4806,11214,25632,3204};
        int gcd = gcdList[0];
        //the following code uses euclid's algorithm
        /*for(int i=1;i<gcdList.length;i++){
            gcd = euclid(gcd, gcdList[i]);
        }
        gcd = euclid(gcdList[0],gcdList[9]);
        */
        //the following code uses simple search
        /*
        gcd = anotherGCD(gcdList,3204);
        */
        System.out.println(((double)gcd)/1000);
    }
}
