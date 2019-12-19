package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JoursSelect extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane grid=new GridPane();
		Scene scene = new Scene(grid,300,200);
		Text text =new Text();
		
		ObservableList<String> jours=FXCollections.observableArrayList("Lundi","Mardi","Mecredi","Jeudi","Vendredi","Samedi","Dimanche");
		ListView<String> LvJours=new ListView<String>(jours);
		LvJours.setPrefSize(200, 150);
		
		MultipleSelectionModel<String> LvSetModel=LvJours.getSelectionModel();
		
		LvSetModel.selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> selected,
					String oldval, String newVal)
			{
				text.setText("vous avez choisi: "+newVal);
			                                                        
			}
	});
		grid.add(LvJours,1,3);
		grid.add(text,1,4);
		grid.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("List View");
		primaryStage.setScene(scene);
		primaryStage.show();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
}
