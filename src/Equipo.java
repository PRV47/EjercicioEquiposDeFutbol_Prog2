import java.util.Iterator;
import java.util.ArrayList;

public class Equipo implements Iterable<Jugador> {
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }
    @Override
    public Iterator<Jugador> iterator() {
        return jugadores.iterator();
    }
}
