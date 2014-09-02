import java.util.concurrent.atomic.AtomicInteger;

public class Position
{
   AtomicInteger x, y;
   
   Position()
   {
      x.set(0);   y.set(0);
   }

   public void update(Position newPos)
   {
      x.set(newPos.x.get());
      y.set(newPos.y.get());
   }
}
