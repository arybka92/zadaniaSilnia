package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;




public class OptymalnyKalkulatorSilni implements KalkulatorSilni{
    
    private static int MAKSYMALNY_ARGUMENT_DLA_LONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni i=null;
        if(podstawa<= MAKSYMALNY_ARGUMENT_DLA_LONG){
        	i=new SzybkiKalkulatorSilni();
        }else
        	i=new KalkulatorSilniBigDecimal();
        //w zależności od rozmiaru argumentu powinniśmy użyć algorytmu SzybkaSilnia lub BigDecimalSilnia
        //TODO - zaimplementować to tutaj.
        return i.licz(podstawa);
    }
}
