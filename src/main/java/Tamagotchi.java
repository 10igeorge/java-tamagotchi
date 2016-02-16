public class Tamagotchi {
  private String mName;
  private int mFoodLevel = 2;
  private int mSleepLevel = 2;
  private int mHappinessLevel = 2;

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

  // public int setFoodLevel(int foodLevel){
  //   foodLevel = mFoodLevel;
  //   return foodLevel;
  // }



  //


  // public feed(){
  //   mFoodLevel ++;
  // }
  //
  // public play(){
  //   mHappinessLevel ++;
  //   mSleepLevel --;
  // }
}
