
public class Hero extends AbstractFigure
{
   
//   HeroLockClass locks;

   public Hero()
   {
      super();
   }

//   public Hero(Character gender)
//   {
//      super(gender);
//   }

   public Hero(Integer health, Integer exp, Integer speed, Integer defense,
               Position loc)
   {
      super(health, exp, speed, defense, loc);
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
