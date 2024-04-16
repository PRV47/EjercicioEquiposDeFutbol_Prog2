public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 10);
        Jugador jugador2 = new Jugador("Julian Alvarez", "Delantero", 9);
        Jugador jugador3 = new Jugador("Damian Martinez", "Arquero", 23);

        equipo.addJugador(jugador1);
        equipo.addJugador(jugador2);
        equipo.addJugador(jugador3);

        for (Jugador jugador: equipo) {
            System.out.println("Equipo: Seleccion Argentina, Nombre: " + jugador.nombre + ", Posicion: " + jugador.posicion + ", Numero de camiseta: " + jugador.num_camiseta);
        }
    }
}
