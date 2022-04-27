package taller.sofka.e18;

public class Serie implements Entregable{

    String titulo;
    Integer numeroDeTemporadas;
    Boolean entregado;
    String genero;
    String creador;

    public Serie() {
        titulo = "";
        numeroDeTemporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        numeroDeTemporadas = 3;
        entregado = false;
        genero = "";
        this.creador = titulo;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        return "Titulo de la serie: "+titulo+
                "\nNumero de temporadas: "+numeroDeTemporadas+
                "\nGenero: "+genero+
                "\nCreador: "+creador;
    }


    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int  estado = -1;

        Serie ref =(Serie)a;
        if(numeroDeTemporadas>ref.getNumeroDeTemporadas()){
            estado = 1;
            return estado;
        }else if (numeroDeTemporadas==ref.getNumeroDeTemporadas()){
            estado = 0;
            return estado;
        }
        return estado;
    }

}
