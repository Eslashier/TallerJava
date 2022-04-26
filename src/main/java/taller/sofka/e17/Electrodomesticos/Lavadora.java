package taller.sofka.e17.Electrodomesticos;

public class Lavadora extends Electrodomesticos {

    Integer carga;

    public Lavadora(){
        super();
        carga = 5;
    }

    public Lavadora(int precioBase, int peso){
        super(precioBase,peso);
        carga = 5;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga){
        super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    protected Integer precioPorCarga(){
        int precioPorCarga = 0;
        if(carga>30){
            precioPorCarga = 50;
        }
        return precioPorCarga;
    }

    public Integer precioFinal(){

        return(this.precioBase+precioPorConsumo()+precioPorPeso()+precioPorCarga());

    }

}
