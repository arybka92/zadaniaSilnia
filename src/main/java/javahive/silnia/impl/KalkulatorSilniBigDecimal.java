package javahive.silnia.impl;


import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    private BigDecimal liczBigDecimal(BigDecimal podstawa) {
    	
        if(podstawa.compareTo(BigDecimal.ZERO)<0){
    		throw new ArithmeticException();
    	}
        if(podstawa.compareTo(BigDecimal.ZERO)>0) {
            return podstawa.multiply(liczBigDecimal(podstawa.subtract(BigDecimal.ONE)));
        } else {
            return BigDecimal.ONE;
        }
    }
    

    public String licz(int arg) {
        //wynik działania rekrurencyjnej metody rzutowany jest na String,
        //Bo string przechowa bez problemu duże liczby
        return liczBigDecimal(new BigDecimal(arg)).toString();
    }
}
