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
        Personaje[] personajesEsperados = new Personaje ["Neville Longbottom",true,true,false,"Matthew Lewis",true,"http://hp-api.herokuapp.com/images/neville.jpg)"];

        //PRUEBAS
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 19; //a mi me sale 21 en el excel
        int actual = ej.personajesNombreConSubStringYEstanVivos("co").length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 4;
        int actual = ej.personajesNombreConStringExacto("Malfoy").length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7Extra1() { //he controlado mayúsculas/minúsculas
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int expected = 4;
        int actual = ej.personajesNombreConStringExacto("malfoy").length;
        Assertions.assertEquals(expected, actual);
    }


    /*
    @Test
    public void test8(){
        // TODO Realiza todos los test que consideres para probar la función buscar por nombre. Esa función buscará a todos los
        //  personajes cuyos nombres contengan el string introducido. Si buscas Voldermort tendras problemas.
        int expected = 1;
        int actual= ej.personajesNombreConSubStringYEstanVivos("Lord Voldemort").length;
        Assertions.assertEquals(expected,actual);
    }*/
}
