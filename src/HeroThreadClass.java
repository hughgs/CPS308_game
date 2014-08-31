

public class HeroThreadClass implements Runnable
{

   Hero hero;
//   HeroLockClass heroLocks;
   
   Thread t;
   
   HeroThreadClass(Hero hero)
   {
      this.hero = hero;
//      heroLocks = hero.locks;
      
      this.t = new Thread(this, "Hero");
      this.t.start();
   }

   public void run()
   {
   }

}
