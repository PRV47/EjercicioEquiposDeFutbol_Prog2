public class Jugador {
    String nombre;
    String posicion;
    int num_camiseta;

    public Jugador(String nombre, String posicion, int num_camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.num_camiseta = num_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }


}
