package metier;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CalculTest {
    @Test
    public void Calcult(){
        Calcul cal = new Calcul();
        double a=5;
        double b=6;
        double expected=11;
        double res = cal.somme(a,b);
        Assert.assertTrue(res==expected);


    }
}
