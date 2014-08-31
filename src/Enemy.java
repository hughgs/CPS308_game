
public class Enemy extends AbstractFigure
{

//   EnemyLockClass locks;
   EnemyThreadClass thread;
   int _ID = 0;

   public Enemy()
   {
      super();
      thread = new EnemyThreadClass(this);
      // TODO Auto-generated constructor stub
   }

//   public Enemy(Character gender)
//   {
//      super(gender);
//      // TODO Auto-generated constructor stub
//   }

   public Enemy(Integer health, Integer exp, Integer speed, Integer defense,
                Position loc, Integer ID)
   {
      super(health, exp, speed, defense, loc);
      _ID = ID;
      thread = new EnemyThreadClass(this);
      // TODO Auto-generated constructor stub
   }

   @Override
   public int Attack()
   {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public Boolean Defend(int attack)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Position Move()
   {
      // TODO Auto-generated method stub
      return null;
   }

   protected int getID()
   {
      return(_ID);
   }
}
