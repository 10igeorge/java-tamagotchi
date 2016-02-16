import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("Frederick");
    assertEquals("Frederick", myPet.getName());
    assertEquals(2, myPet.getFoodLevel());
    assertEquals(2, myPet.getSleepLevel());
    assertEquals(2, myPet.getActivityLevel());
  }
}
