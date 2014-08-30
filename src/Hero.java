
public class Hero extends AbstractFigure
{

   public Hero()
   {
      // TODO Auto-generated constructor stub
   }

   public Hero(Character gender)
   {
      super(gender);
      // TODO Auto-generated constructor stub
   }

   public Hero(Integer health, Integer exp, Integer speed, Integer defense)
   {
      super(health, exp, speed, defense);
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

}
