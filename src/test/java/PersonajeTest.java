import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio5 ej = new Ejercicio5();

    @Test
    public void test1(){
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Personajes que tienen imagen asociada.
        // tip: ej.personajes.obtenerTodos()[0].getImage()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 25
    }


    @Test
    public void test2(){
        // TODO Comprueba que la función: obtenerPotters()
        //  nos devuelve una lista de 6 elementos
        // tip: ej.personajes.obtenerPotters()
        Personaje [] personajesEsperados = ej.personajes.obtenerPotters();
        Assertions.assertEquals(personajesEsperados.length(),6);
        }


    }


    @Test
    public void test3(){
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están vivos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos

    }

    @Test
    public void test4(){
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están muertos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos

    }

    @Test
    public void test5(){
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos

    }

    @Test
    public void test6(){
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
        //  en su nombre y están vivos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos

    }

    @Test
    public void test7(){
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido

        // TODO comprueba que tu función devuelve el número correcto de elementos
    }



    // TODO Realiza todos los test que consideres para probar la función buscar por nombre. Esa función buscará a todos los
    //  personajes cuyos nombres contengan el string introducido. Si buscas Voldermort tendras problemas.

}
