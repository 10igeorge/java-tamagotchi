public class Tamagotchi {
  String mName;
  int mFoodLevel;
  int mSleepLevel;
  int mHappinessLevel;

  public getName(String name){
    return mName;
  }

  public getFoodLevel(int foodLevel){
    return mFoodLevel;
  }

  public getSleepLevel(int sleepLevel){
    return mSleepLevel;
  }

  public getHappinessLevel(int happinessLevel){
    return mHappinessLevel;
  }

  public feed(){
    mFoodLevel ++;
  }

  public play(){
    mHappinessLevel ++;
    mSleepLevel --;
  }
}
