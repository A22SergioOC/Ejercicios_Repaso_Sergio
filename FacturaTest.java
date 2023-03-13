package Tarea7_Ejercicios_Repaso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FacturaTest {

    @Test
    public void CP1(){
        Factura f = new Factura();
        f.setConsumokWh(0);
        assertEquals(0, f.calcularPrezokWh());
    }

    @Test
    public void CP2(){
        Factura f = new Factura();
        f.setConsumokWh(300);
        assertEquals(9, f.calcularPrezokWh());
    }

    @Test
    public void CP3(){
        Factura f = new Factura();
        f.setConsumokWh(299);
        assertEquals(9, f.calcularPrezokWh());
    }

    @Test
    public void CP4(){
        Factura f = new Factura();
        f.setConsumokWh(301);
        assertEquals(8, f.calcularPrezokWh());
    }

    @Test
    public void CP5(){
        Factura f = new Factura();
        f.setConsumokWh(600);
        assertEquals(8, f.calcularPrezokWh());
    }

    @Test
    public void CP6(){
        Factura f = new Factura();
        f.setConsumokWh(601);
        assertEquals(6, f.calcularPrezokWh());
    }

    @Test
    public void CP7(){
        Factura f = new Factura();
        f.setConsumokWh(1000);
        assertEquals(6, f.calcularPrezokWh());
    }

    @Test
    public void CP8(){
        Factura f = new Factura();
        f.setConsumokWh(1001);
        assertEquals(5, f.calcularPrezokWh());
    }

    @Test
    public void CP9(){
        Factura f = new Factura();
        f.setConsumokWh(2000);
        assertEquals(5, f.calcularPrezokWh());
    }

    @Test
    public void CP10() throws NotValidValueException{
        Factura f = new Factura();
        f.setConsumokWh(2001);
    }

    @Test
    public void CP11() throws NotValidValueException{
        Factura f = new Factura();
        f.setConsumokWh(-1);
        f.calcularPrezokWh();
    }
}
