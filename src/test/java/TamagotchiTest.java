import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("Frederick");
    assertEquals("Frederick", myPet.getName());
    assertEquals(2, myPet.getFoodLevel());
    assertEquals(2, myPet.getSleepLevel());
    assertEquals(2, myPet.getHappinessLevel());
  }

  @Test
  public void tamagotchi_hungerAndHappinessGoesUpIfFed(){
    Tamagotchi myPet = new Tamagotchi("Frederick");
    myPet.feed();
    assertEquals(3, myPet.getFoodLevel());
    assertEquals(3, myPet.getHappinessLevel());
  }
}
