import java.util.Arrays;
import java.util.Locale;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.
    public Personaje[] quitarNulos (Personaje[] pers, int i) {
        return Arrays.copyOf(pers,i);
    }

    public Personaje[] buscarPersonajesConImagen() {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if (!pers.getImage().equals("")) {
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }

    public Personaje [] staffHowartsYEstanVivos() {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if ((pers.getHogwartsStaff()==true) && (pers.getAlive()==true)) {
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }

    public Personaje [] staffHowartsYEstanMuertos() {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if ((pers.getHogwartsStaff()==true) && (pers.getAlive()==false)) {
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }

    public Personaje [] personajesNombreConLetra(char letra) {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if ((pers.getName().indexOf(letra)) != -1) { //indexof devuelve -1 cuando no lo encuentra en toddo el array
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }

    public Personaje [] personajesNombreConSubStringYEstanVivos(String palabra) {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if ((pers.getName().toLowerCase().contains(palabra.toLowerCase())) && (pers.getAlive())) {
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }


    public Personaje [] personajesNombreConStringExacto(String palabraExacta) {
        Personaje[] out = new Personaje[personajes.obtenerTodos().length];
        int pos = 0;
        for (Personaje pers : personajes.obtenerTodos()) {
            if (pers.getName().equalsIgnoreCase(palabraExacta)) {
                out[pos] = pers;
                pos++;
            }
        }
        return quitarNulos(out,pos);
    }

}



