
public class Position
{
   Integer x, y;
   
   Position()
   {
      x = 0;   y = 0;
   }

   public void update(Position newPos)
   {
      x = newPos.x;
      y = newPos.y;
   }
}
