package search;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
	@Override
	public void start(Stage stage ) throws Exception {
		search root = new search();
		Scene scene = new Scene(root, 500,400);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch();
	}
	
}
