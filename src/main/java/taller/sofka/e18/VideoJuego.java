package taller.sofka.e18;

public class VideoJuego implements Entregable {

    String titulo;
    Integer horasEstimadas;
    Boolean entregado;
    String genero;
    String desarrollador;

    public VideoJuego() {
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero = "";
        desarrollador = "";
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;;
        entregado = false;
        genero = "";
        desarrollador = "";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String desarrollador) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;;
        entregado = false;
        this.genero = genero;
        this.desarrollador = desarrollador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String toString(){
        return "Titulo del videojuego: "+titulo+
                "\nHoras estimadas: "+horasEstimadas+
                "\nGenero: "+genero+
                "\nDesarrollador: "+desarrollador;
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

        VideoJuego ref =(VideoJuego) a;
        if(horasEstimadas>ref.getHorasEstimadas()){
            estado = 1;
            return estado;
        }else if (horasEstimadas==ref.getHorasEstimadas()){
            estado = 0;
            return estado;
        }
        return estado;
    }
}
