
public abstract class AbstractFigure
{

   protected Character _gender;
   protected Integer _health, _exp, _speed, _defense;
   protected static final Integer default_health = 10,
                                  default_exp = 0,
                                  default_speed = 5;
   protected Position _location;

   public AbstractFigure()
   {
      _gender = 'M';
      _health = default_health;
      _exp = default_exp;
      _speed = default_speed;
   }
//   public AbstractFigure(Character gender)
//   {
//      this();
//      _gender = gender;
//   }
   public AbstractFigure(Position location)
   {
      this();
      _location.update(location);
   }
   public AbstractFigure(Integer health, Integer exp, Integer speed, Integer defense,
                         Position location)
   {
      this();
      _health = health;
      _exp = exp;
      _speed = speed;
      _defense = defense;

      _location = location;
   }
   
   public abstract int Attack();
   
   public abstract Boolean Defend(int attack);
   
   public abstract Position Move();

}
