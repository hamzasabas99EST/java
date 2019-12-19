package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.*;

import javafx.stage.Stage;

public class login extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid=new GridPane();
			grid.setVgap(10);
			grid.setHgap(10);
			grid.setAlignment(Pos.CENTER);
			Scene scene = new Scene(grid,360,200);
			Text titre=new Text("Votre Nom et Mot de Pass");
			titre.setFont(Font.font("Tahom",FontWeight.NORMAL,20));
			Label usrlbl =new Label("Nom d'utilisateur:");
			TextField userTf=new TextField();
			Label pwlbl =new Label("Mot de passe");
			PasswordField pwTf=new PasswordField();
			Button btn=new Button("ok");
			grid.add(titre, 0, 0,2,1);
			grid.add(usrlbl, 0, 1);
			grid.add(userTf, 1, 1);
			grid.add(pwlbl, 0, 2);
			grid.add(pwTf, 1, 2);
			HBox hbBtn = new HBox();
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn, 1, 3);
			final Text msgT=new Text();
			grid.add(msgT, 1, 4);
			btn.setOnAction(event ->{msgT.setText("bonjour"+" " +userTf.getText());});
			primaryStage.setTitle("Javafx login");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
