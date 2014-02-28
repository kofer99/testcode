 
package de.neufeld.daniel.javafx.app;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;

public class MyPart {
	@Inject
	public MyPart(BorderPane border,MWindow window) {
		MPartStack stack=(MPartStack) window.getChildren().get(0);
		ListView<MStackElement> lv=new ListView<>();
		lv.setItems(FXCollections.observableArrayList(stack.getChildren()));
		
		border.setCenter(lv);
		
		
	}
	
	
	
}