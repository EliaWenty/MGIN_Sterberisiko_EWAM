import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.time.format.TextStyle;

public class GUI extends Application{

    GridPane window = new GridPane();
    TextField eingabeHoehe = new TextField();
    TextField eingabeDruckStaerke = new TextField();
    TextField eingabealter = new TextField();
    Label ergebnis = new Label();
    Logik logic = new Logik();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button berechnen = new Button("berechnen");

        berechnen.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event){
               //TODO
               //Methode aufrufen ihr die werte der Textfielder zuweisen
               //und das ergebnis dem ergebnis zuweisen
               //Ich füg dann noch paar verschönerungssachen ein

           }
        }
        );

        window.add(eingabeHoehe, 0,0);
        window.add(eingabeDruckStaerke, 0,1);
        window.add(eingabealter, 0,2);
        window.add(berechnen, 0,3);
        window.add(ergebnis, 0,4);


        primaryStage.setTitle("Sterberisiko");
        primaryStage.setScene(new Scene(window, 200, 200));
        primaryStage.show();
    }
}
