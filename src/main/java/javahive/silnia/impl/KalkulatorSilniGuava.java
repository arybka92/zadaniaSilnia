package javahive.silnia.impl;

import java.math.BigDecimal;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

import javahive.silnia.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


/**
 *
 * @author mgr
 */
public class KalkulatorSilniGuava implements KalkulatorSilni{

//    public String licz(int arg) {
//        
//        return ""+LongMath.factorial(arg);
//    }
	
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
