
public class Hero extends AbstractFigure
{
   
//   HeroLockClass locks;
   HeroThreadClass thread;

   public Hero()
   {
      super();
      thread = new HeroThreadClass(this);
   }

//   public Hero(Character gender)
//   {
//      super(gender);
//      thread = new HeroThreadClass(this);
//   }

   public Hero(Integer health, Integer exp, Integer speed, Integer defense,
               Position loc)
   {
      super(health, exp, speed, defense, loc);
      thread = new HeroThreadClass(this);
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

}
