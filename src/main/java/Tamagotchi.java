public class Tamagotchi {
  public int final MAX_SLEEP = 10;
  public int final MAX_HUNGER = 10;
  public int final MAX_HAPPY = 10;
  private String mName;
  private int mFoodLevel = 2;
  private int mSleepLevel = 2;
  private int mHappinessLevel = 2;

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

  public void feed() {
    mFoodLevel+=2;
    mHappinessLevel++;
    mSleepLevel--;
  }

  public void play() {
    mFoodLevel--;
    mHappinessLevel+=2;
    mSleepLevel-=2;
  }

  public void sleep(){
    mFoodLevel--;
    mSleepLevel = MAX_SLEEP;
  }


  // public int setFoodLevel(int foodLevel){
  //   foodLevel = mFoodLevel;
  //   return foodLevel;
  // }


  // public feed(){
  //   mFoodLevel ++;
  // }
  //
  // public play(){
  //   mHappinessLevel ++;
  //   mSleepLevel --;
  // }
}
