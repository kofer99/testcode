package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root=new Group();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			final Rectangle rectBasicTimeline = new Rectangle();
			rectBasicTimeline.setX(0);
			rectBasicTimeline.setY(0);
			rectBasicTimeline.widthProperty().bind(scene.widthProperty());
			rectBasicTimeline.heightProperty().bind(scene.heightProperty());
			rectBasicTimeline.setFill(Color.RED);
			root.getChildren().add(rectBasicTimeline);
			final Timeline timeline = new Timeline();
			timeline.setCycleCount(Timeline.INDEFINITE);
			timeline.setAutoReverse(true);
			final KeyValue kv1 = new KeyValue(rectBasicTimeline.fillProperty(), Color.YELLOW);
			final KeyValue kv2 = new KeyValue(rectBasicTimeline.fillProperty(), Color.GREEN);
			final KeyValue kv3 = new KeyValue(rectBasicTimeline.fillProperty(), Color.BLUE);
			final KeyFrame kf1 = new KeyFrame(Duration.millis(5000), kv1);
			final KeyFrame kf2 = new KeyFrame(Duration.millis(10000), kv2);
			final KeyFrame kf3 = new KeyFrame(Duration.millis(15000), kv3);
			timeline.getKeyFrames().add(kf1);
			timeline.getKeyFrames().add(kf2);
			timeline.getKeyFrames().add(kf3);
			timeline.play();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
