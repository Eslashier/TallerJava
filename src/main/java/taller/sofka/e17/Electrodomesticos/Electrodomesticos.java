package taller.sofka.e17.Electrodomesticos;

public class Electrodomesticos {

    final Integer precioBase;
    String color;
    Character consumoEnergetico;
    final Integer peso;

    public Electrodomesticos() {
        precioBase = 100;
        color = "blanco";
        consumoEnergetico = 'F';
        peso = 5;
    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        color = "blanco";
        consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char consumo){
        switch (consumo){
            case 'A':
            case 'a':{
                this.consumoEnergetico = 'A';
                break;
            }
            case 'B':
            case 'b':{
                this.consumoEnergetico = 'B';
                break;
            }
            case 'C':
            case 'c':{
                this.consumoEnergetico = 'C';
                break;
            }
            case 'D':
            case 'd':{
                this.consumoEnergetico = 'D';
                break;
            }
            case 'E':
            case 'e':{
                this.consumoEnergetico = 'E';
                break;
            }
            case 'F':
            case 'f':{
                this.consumoEnergetico = 'F';
                break;
            }
            default:
                this.consumoEnergetico = 'F';
                break;
        }
    }

    private void comprobarColor(String color){
        String comprobarcolor = color.toLowerCase();
        switch (comprobarcolor){
            case "blanco":{
                this.color = "blanco";
                break;
            }
            case "negro":{
                this.color = "negro";
                break;
            }
            case "rojo":{
                this.color = "rojo";
                break;
            }
            case "azul":{
                this.color = "azul";
                break;
            }
            case "gris":{
                this.color = "gris";
                break;
            }
            default:
                this.color = "blanco";

        }
    }

    protected Integer precioPorConsumo(){
        int precioPorConsumo = 0;

        switch(this.consumoEnergetico){
            case 'A':{
                precioPorConsumo = 100;
                break;
            }
            case 'B':{
                precioPorConsumo = 80;
                break;
            }
            case 'C':{
                precioPorConsumo = 60;
                break;
            }
            case 'D':{
                precioPorConsumo = 50;
                break;
            }
            case 'E':{
                precioPorConsumo = 30;
                break;
            }
            case 'F':{
                precioPorConsumo = 10;
                break;
            }
        }

        return precioPorConsumo;

    }

    protected Integer precioPorPeso(){
        int precioPorPeso = 0;
        if(this.peso<20){
            precioPorPeso = 10;
        }else if (20<=this.peso && this.peso<50){
            precioPorPeso = 50;
        }else if (51<=this.peso && this.peso<80){
            precioPorPeso = 50;
        }else if (80<=this.peso) {
            precioPorPeso = 100;
        }
        return precioPorPeso;
    }

    public Integer precioFinal(){

        return(this.precioBase+precioPorConsumo()+precioPorPeso());

    }

}
