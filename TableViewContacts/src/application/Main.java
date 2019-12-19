package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ObservableList<Contact> contactList=FXCollections.observableArrayList(
					
					new Contact("Said","Touzani","06 67 67 67 67"),
					new Contact("Hamza","HEH","06 07 17 07 67"),
					new Contact("Youssef","Nainiaa","06 66 67 67 67"),
					new Contact("Said","Touzani","06 67 67 67 67"),
					new Contact("Hamza","HEH","06 07 17 07 67"),
					new Contact("Youssef","Nainiaa","06 66 67 67 67")
					
					);
		
			TableView<Contact> tvContacts= new TableView<Contact>(contactList);
			TableColumn<Contact,String>prnm=new TableColumn<>("Prenom");
			prnm.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
			tvContacts.getColumns().add(prnm);
			
			TableColumn<Contact,String>nom=new TableColumn<>("Nom");
			nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
			tvContacts.getColumns().add(nom);
			
			TableColumn<Contact,String>num=new TableColumn<>("Telephone");
			num.setCellValueFactory(new PropertyValueFactory<>("num"));
			tvContacts.getColumns().add(num);
			
			tvContacts.setPrefWidth(360);
			tvContacts.setPrefHeight(160);
			
			
			 VBox vbox = new VBox(tvContacts);

	        Scene scene = new Scene(vbox);
			
			primaryStage.setTitle("List View");
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
