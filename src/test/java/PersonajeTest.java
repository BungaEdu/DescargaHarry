import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {

    Ejercicio5 ej = new Ejercicio5();

    @Test
    public void test1() {
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Personajes que tienen imagen asociada.
        // tip: ej.personajes.obtenerTodos()[0].getImage()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 25
        int expected = 25;
        int actual = ej.buscarPersonajesConImagen().length;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // TODO Comprueba que la función: obtenerPotters()
        //  nos devuelve una lista de 6 elementos
        // tip: ej.personajes.obtenerPotters()
        int expected = 6;
        int actual = ej.personajes.obtenerPotters().length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están vivos
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 16;
        int actual = ej.staffHowartsYEstanVivos().length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están muertos
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 8;
        int actual = ej.staffHowartsYEstanMuertos().length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        // TODO comprueba que tu función devuelve el número correcto de elementos
        //no se como calcular que tenga una letra, podría utilizar otra función, pero no se si procede.
        int expected = 38;
        int actual = ej.personajesNombreConLetra('p').length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
        //  en su nombre y están vivos
        Personaje [] personajesEsperados = {
                new Personaje ("Neville Longbottom",true,true,false,"Matthew Lewis",true,"http://hp-api.herokuapp.com/images/neville.jpg")
        };
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Personaje [] actual = ej.personajesNombreConSubStringYEstanVivos("nev");
        Assertions.assertArrayEquals(personajesEsperados, actual);
    }

    @Test
    public void test6Extra1() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
        //  en su nombre y están vivos
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Personaje [] personajesEsperados = {
                new Personaje ("Lev Zograf",true,false,false,"",true,""),
                new Personaje ("Alexei Levski",true,false,false,"",true,"")
        };
        Personaje [] actual = ej.personajesNombreConSubStringYEstanVivos("lev");
        Assertions.assertArrayEquals(personajesEsperados, actual);
    }

    @Test
    public void test7() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        // TODO comprueba que tu función devuelve el número correcto de elementos
        Personaje [] personajesEsperados = {
                new Personaje ("Draco Malfoy",true,true,false,"Tom Felton",true,"http://hp-api.herokuapp.com/images/draco.jpg"),
        };
        Personaje actual []= ej.personajesNombreConStringExacto("Draco Malfoy");
        Assertions.assertArrayEquals(personajesEsperados, actual);
    }

    @Test
    public void test7Extra1() { //he controlado mayúsculas/minúsculas
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 1;
        int actual = ej.personajesNombreConStringExacto("Sirius Black").length;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test7Extra2() { //he controlado mayúsculas/minúsculas
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 1;
        int actual = ej.personajesNombreConStringExacto("Albus Dumbledore").length;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test8(){
        // TODO Realiza todos los test que consideres para probar la función buscar por nombre. Esa función buscará a todos los
        //  personajes cuyos nombres contengan el string introducido. Si buscas Voldermort tendras problemas.
        Personaje [] personajesEsperados = {
                new Personaje ("Lord Voldemort",true,false,false,"Ralph Fiennes",false,"image=http://hp-api.herokuapp.com/images/voldemort.jpg"),
        };
        Personaje actual []= ej.personajes.buscarPorNombre ("Lord Voldemort");
        Assertions.assertEquals(personajesEsperados,actual);
    }
}