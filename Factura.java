package Tarea7_Ejercicios_Repaso;

public class Factura {
    private int consumokWh;

    public int getConsumokWh() {
        return consumokWh;
    }

    public void setConsumokWh(int consumokWh) {
        this.consumokWh = consumokWh;
    }

    public int calcularPrezokWh(){
        int prezokWh=0;
        if (consumokWh==0) {
            return 0;
        }else if (consumokWh < 0){
            throw new NotValidValueException("El consumo supera el límite permitido.");
        }else if (consumokWh<=300){
            prezokWh=9;
        }else if(consumokWh<=600){
            prezokWh=8;
        }else if(consumokWh<=1000){
            prezokWh=6;
        }else if (consumokWh<=2000){
            prezokWh=5;
        }else{
            throw new NotValidValueException("El consumo supera el límite permitido.");
        }
        return prezokWh;
    }
}
