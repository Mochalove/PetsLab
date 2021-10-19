import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Peacock;
import io.zipcoder.pets.Pets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    import java.util.Scanner;
    public class Testing {
    Scanner scn = new Scanner(System.in);

    @Test
    public void howManyPets() {

    }

    @Test
    public void whatKindOfPet() {


    }

    @Test
    public void speak() {
        Peacock pz = new Peacock();
        String speak = "Haa Haa";
        Assertions.assertEquals(pz.speak(), speak);
    }

    @Test
    public void checkingTheInstance() {
        Dog dd = new Dog();
        Assertions.assertTrue(dd instanceof Dog);
    }

    }


