
public class EnemyThreadClass extends Enemy implements Runnable
{

   Enemy enemy;
//   EnemyLockClass enemyLocks;
 
   Thread t;

   EnemyThreadClass(Enemy enemy)
   {
      this.enemy = enemy;
//      enemyLocks = enemy.locks;
      
      this.t = new Thread(this, "Enemy"+getID());
      this.t.start();
   }


   @Override
   public void run()
   {
      // TODO Auto-generated method stub

   }

}
