public class Tamagotchi {
  public static final int MAX_SLEEP = 10;
  public static final int MAX_HUNGER = 10;
  public static final int MAX_HAPPY = 10;
  private String mName;
  public String status;
  private int mFoodLevel = 2;
  private int mSleepLevel = 5;
  private int mHappinessLevel = 5;

//New Tamagotchi specs

  public Tamagotchi(String name){
    mName = name;
  }

  public String getName(){
    return mName;
  }

  public int getFoodLevel(){
    return mFoodLevel;
  }

  public int getSleepLevel(){
    return mSleepLevel;
  }

  public int getHappinessLevel(){
    return mHappinessLevel;
  }

  //Tamagotchi actions

  public void feed() {
    mFoodLevel+=3;
    mHappinessLevel++;
    mSleepLevel--;
  }

  public void play() {
    mFoodLevel--;
    mHappinessLevel+=2;
    mSleepLevel--;
  }

  public void sleep(){
    mFoodLevel--;
    mSleepLevel = MAX_SLEEP;
  }

//Tamagotchi status

  public boolean isAlive(){
    if (mFoodLevel > 0){
      return true;
    } else {
      return false;
    }
  }

  public String petStatus(){
    if (mFoodLevel < 4 && mSleepLevel < 4 && mHappinessLevel < 4){
      status = "Your pet is hungry, tired, AND sad";
    } else if (mSleepLevel < 4 && mHappinessLevel < 4){
      status = "Your pet is tired and sad";
    } else if (mSleepLevel < 4 && mFoodLevel < 4){
      status = "Your pet is hungry and tired";
    } else if (mFoodLevel < 4 && mHappinessLevel < 4){
      status = "Your pet is hungry and sad";
    } else if (mFoodLevel < 4){
      status = "Your pet is hungry";
    } else if (mHappinessLevel < 4){
      status = "Your pet is sad";
    } else if (mSleepLevel < 4){
      status = "Your pet is tired";
    }
    return status;
  }
}
