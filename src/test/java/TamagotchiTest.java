import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("Frederick");
    assertEquals("Frederick", myPet.getName());
    assertEquals(2, myPet.getFoodLevel());
    assertEquals(5, myPet.getSleepLevel());
    assertEquals(5, myPet.getHappinessLevel());
  }

  @Test
  public void tamagotchi_hungerAndHappinessGoesUpIfFed(){
    Tamagotchi myPet = new Tamagotchi("Frederick");
    myPet.feed();
    assertEquals(5, myPet.getFoodLevel());
    assertEquals(6, myPet.getHappinessLevel());
  }

  @Test
  public void tamagotchi_getsHappyAfterPlaying() {
    Tamagotchi myPet = new Tamagotchi("SweetRaveParty");
    myPet.play();
    assertEquals(7, myPet.getHappinessLevel());
    assertEquals(1, myPet.getFoodLevel());
  }

  @Test
  public void tamagotchi_hasFullSleepLevelsAfterSleepMethod() {
    Tamagotchi myPet = new Tamagotchi("Meeple");
    myPet.sleep();
    assertEquals(10, myPet.getSleepLevel());
  }

  @Test
  public void tamagotchi_isAliveIfFoodLevelIsGreaterThan0() {
    Tamagotchi myPet = new Tamagotchi("Meeple");
    assertEquals(true, myPet.isAlive());
  }

  @Test
  public void tamagotchi_returnsStatusBasedOnLevels() {
    Tamagotchi myPet = new Tamagotchi("Meeple");
    assertEquals("Your pet is hungry", myPet.petStatus());
  }
}
