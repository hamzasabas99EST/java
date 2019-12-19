package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BoiteMessage extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid=new GridPane();
			grid.setVgap(3);
			grid.setHgap(3);
			grid.setAlignment(Pos.TOP_LEFT);
			Scene scene = new Scene(grid,600,400);
			Text titre=new Text("Laissez un Message");
			titre.setFont(Font.font("Tahom",FontWeight.NORMAL,20));
			Label usrlbl =new Label("Nom d'utilisateur:");
			TextField userTf=new TextField();
			Label msglbl =new Label("Votre Message:");
			TextArea msgta=new TextArea();
			Button btn=new Button("Envoyer");
			Button delbtn=new Button("Effacer");
			grid.add(titre, 0, 0,1,1);
			grid.add(usrlbl, 0, 1);
			grid.add(userTf, 0, 2);
			grid.add(msglbl, 0, 3);
			grid.add(msgta, 0, 4);
			HBox hbBtn = new HBox();
			hbBtn.setAlignment(Pos.BOTTOM_LEFT);
			hbBtn.getChildren().add(btn);
			HBox delBtn = new HBox();
			delBtn.setAlignment(Pos.BOTTOM_RIGHT);
			delBtn.getChildren().add(delbtn);
			grid.add(hbBtn, 0, 5);
			grid.add(delBtn, 1, 5);
			final Text msgT=new Text();
			grid.add(msgT, 0, 6);
			btn.setOnAction(event ->{msgT.setText(userTf.getText()+" Merci pour Votre interaction");});
			primaryStage.setTitle("Javafx Message");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
