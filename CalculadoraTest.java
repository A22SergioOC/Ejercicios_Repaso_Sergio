package Tarea7_Ejercicios_Repaso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void CP1(){
        Calculadora c = new Calculadora();
        assertEquals(9, c.suma(5, 4));
    }

    @Test
    public void CP2(){
        Calculadora c = new Calculadora();
        assertEquals(1, c.suma(5, -4));
    }

    @Test
    public void CP3(){
        Calculadora c = new Calculadora();
        assertEquals(5, c.resta(5, 0));
    }
    
    @Test
    public void CP4(){
        Calculadora c = new Calculadora();
        assertEquals(1, c.resta(5, 4));
    }

    @Test
    public void CP5(){
        Calculadora c = new Calculadora();
        assertEquals(7, c.resta(5, -2));
    }

    @Test
    public void CP6(){
        Calculadora c = new Calculadora();
        assertEquals(20, c.multiplicacion(5, 4));
    }

    @Test
    public void CP7(){
        Calculadora c = new Calculadora();
        assertEquals(0, c.multiplicacion(5, 0));
    }

    @Test
    public void CP8(){
        Calculadora c = new Calculadora();
        assertEquals(-15, c.multiplicacion(5, -3));
    }

    @Test
    public void CP9(){
        Calculadora c = new Calculadora();
        assertEquals(2, c.division(5, 2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void CP10(){
        Calculadora c = new Calculadora();
        c.division(5, 0);
    }

    @Test
    public void CP11(){
        Calculadora c = new Calculadora();
        assertEquals(-3, c.division(9, -3));
    }

}
