public class MazeThreadClass implements Runnable
{

   Maze maze;
// MazeLockClass mazeLocks;

   Thread t;

   MazeThreadClass(Maze maze)
   {
      this.maze = maze;
//      mazeLocks = maze.locks;

      this.t = new Thread(this, "Maze");
      this.t.start();
   }

   @Override
   public void run()
   {
      // TODO Auto-generated method stub

   }

}
