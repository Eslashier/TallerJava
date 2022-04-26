package taller.sofka.e17.Electrodomesticos;

public class Television extends Electrodomesticos {

    Integer resolucion;
    Boolean sintonizadorTdt;

    public Television(){
        super();
        resolucion = 20;
        sintonizadorTdt = false;
    }

    public Television(int precioBase, int peso){
        super(precioBase,peso);
        resolucion = 20;
        sintonizadorTdt = false;
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTdt){
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    protected Integer precioPorTdt(){
        if(sintonizadorTdt){
            return 50;
        }
        return 0;
    }

    public Integer precioFinal(){

        if (resolucion>40){
            return((int) Math.ceil(this.precioBase + precioPorConsumo() + precioPorPeso() + precioPorTdt() * 1.3));
        }

        return(this.precioBase + precioPorConsumo() + precioPorPeso() + precioPorTdt());

    }

}
