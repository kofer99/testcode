 
package de.neufeld.daniel.javafx.task1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import javax.inject.Inject;

public class Task1 {
	@Inject
	public Task1(BorderPane borderPane) {
		
		Label test = new Label();
		test.setText("Hallo");
	
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
Text scenetitle = new Text("Der Notendurchschnittrechner");

borderPane.setCenter(grid);

	grid.add(test,1,1);
		
		grid.add(scenetitle, 0, 0, 2, 1);
		
		grid.setGridLinesVisible(true);
/*	ListView<String> list = new ListView<String>();
	ObservableList<String> items =FXCollections.observableArrayList (
	    "Single", "Double", "Suite", "Family App");
	list.setItems(items);
	list.setPrefWidth(100);
	list.setPrefHeight(70);
	borderPane.setCenter(list);
	*/
	
	
	
}
}