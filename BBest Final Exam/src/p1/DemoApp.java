package p1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoApp extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int WIDTH = 70;
		final int HEIGHT = 30;
		final int BUFFER = 80;
		
		TextField gpaField = new TextField();
		gpaField.setPromptText("GPA");
		
		
		HBox inputBox = new HBox(20);
		inputBox.setAlignment(Pos.CENTER);
		inputBox.getChildren().addAll(gpaField);
		
		
		Button ok = new Button("OK");
		ok.setPrefSize(WIDTH, HEIGHT);
		
		
		HBox buttonBox = new HBox(BUFFER); //content buffer size (space between things)
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(ok);
		
		
		VBox outputBox = new VBox(30);
		TextArea outputArea = new TextArea();
		outputArea.setMaxSize(400, 200);
		outputBox.setAlignment(Pos.CENTER);
		outputBox.getChildren().add(outputArea);
		
		
		ok.setOnAction(e -> {
			double gpa = Double.parseDouble(gpaField.getText());
			if (gpa > 4.0) {
				try {
					throw new IncorrectGPAException("The GPA is too high");
				} catch (IncorrectGPAException er) {
					System.out.println(er.getMessage());
					outputArea.appendText("The GPA is too high, enter a new value\n");
					gpaField.clear();
				}
			}
			if (gpa < 0.0) {
				try {
					throw new IncorrectGPAException("The GPA is too low");
				} catch (IncorrectGPAException er) {
					System.out.println(er.getMessage());
					outputArea.appendText("The GPA is too low, enter a new value\n");
					gpaField.clear();
				}
			}
			if (gpa >= 0.0 && gpa <= 4.0) {
				outputArea.appendText("The GPA entered is: " + gpa + "\n");
			}
			gpaField.clear();
		});
		
		VBox root = new VBox(50);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(inputBox, buttonBox, outputBox);
		
		
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("GPA Tester");
		primaryStage.show();
	}
}
