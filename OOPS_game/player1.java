public class player1 {
  private String name;
  private String weapon;
  private int health;

  public player1(String name,String weapon,int health)
  {
      this.name=name;
      this.weapon=weapon;
    if(health<0||health>100)
    {
        this.health=100;
    }
    else this.health=health;
  }
  public void damage_gun1()
  {
      this.health -=30;
      if(this.health<=0)
      {
          this.health=0;
      }
      System.out.println("Got hit by gun1 .Heath isnreduced by 30"+" new health is "+this.health);
      if(this.health==0)
      {
          System.out.println(getName()+"is dead");
      }
  }
  public void damage_gun2()
  {
      this.health -=50;
      if(this.health<=0)
      {
          this.health=0;
      }
      System.out.println("Got hit by gun1 .Heath isnreduced by 50"+" new health is "+this.health);
      if(this.health==0)
      {
          System.out.println(getName()+"is dead");
      }
  }
  public void heal()
{
    if(this.health<=0)
    {
        System.out.println("player is dead , heal is not possible");
    }
    else
    {
    this.health=100;
    System.out.println("health is "+this.health);
    }
}


  public String getName() {
      return name;
  }
  public String getWeapon() {
      return weapon;
  }
  public int getHealth() {
    return health;
}
}
