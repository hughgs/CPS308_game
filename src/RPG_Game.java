
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RPG_Game extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage mainWindow)
   {

      Maze maze = new Maze();

      int numEnemies = 3;
      ArrayList<Enemy> enemies = new ArrayList<Enemy>();
      for (int i=0; i<numEnemies; i++)
         enemies.add(new Enemy());

      Hero hero = new Hero();
      
//  Define basic grid
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
      
//  Define text and input fields
      Text scenetitle = new Text("Welcome");
      scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
      grid.add(scenetitle, 0, 0, 2, 1);

      Label userName = new Label("Character Name:");
      grid.add(userName, 0, 1);

      TextField userTextField = new TextField();
      grid.add(userTextField, 1, 1);

//  Add button
      
      Button btn = new Button();
      btn.setText("OK");
      final Text actiontarget = new Text();
      grid.add(actiontarget, 1, 6);
      btn.setOnAction(new EventHandler<ActionEvent>() {
         
         @Override
         public void handle(ActionEvent e) {
             actiontarget.setFill(Color.FIREBRICK);
             actiontarget.setText("Character name accepted");
         }
      });
      
      HBox hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
      hbBtn.getChildren().add(btn);
      grid.add(hbBtn, 1, 4);

//  Add grid to the scene
      Scene scene = new Scene(grid, 300, 275);
      
      mainWindow.setTitle("Main Window Title");
      mainWindow.setScene(scene);
//      mainWindow.setScene(new Scene(root, 300, 250));
      mainWindow.show();

/*
 * End the program when the rider threads are finished.
 */
      for (int i=0; i<numEnemies; i++)
      {
         try
         {   enemies.get(i).thread.t.join(); }
         catch (InterruptedException e)
         {   e.printStackTrace(); }
      }

/*
 * Once enemy threads are finished, signal the hero thread to shutdown
 */
      try
      {   hero.thread.t.join(); }
      catch (InterruptedException e)
      {   e.printStackTrace(); }

/*
 * When enemies are finished and the hero is done, then shut down the
 * maze
 */
      try
      {   maze.thread.t.join(); }
      catch (InterruptedException e)
      {   e.printStackTrace(); }

   }
}