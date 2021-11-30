package search;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
public class search extends Pane {

	   
	    
	    private Label Aurther;
		private Label Book;
		private Button back;
		private Label title;
		private TextField inputField;
		private TextField inputField2;
		private Label searchscreen;
	    
	    public search() {
	    	
	    	this.Book = new Label();
	    	this.Aurther = new Label();
	    	this.back = new Button();
	    	this.title = new Label();
	    	this.inputField = new TextField();
	    	this.inputField2 = new TextField();
	    	this.searchscreen = new Label();
	    	this.init();
	    }
	    private void init() {
	    	this.title.setText("ARABIC CORPUS");
	    	this.title.setFont(Font.font(40));
	    	this.title.setLayoutX(70);
	    	this.title.setLayoutY(10);
	        this.getChildren().add(this.title);
	        
	        this.searchscreen.setText("Search Screen");
	        this.searchscreen.setFont(Font.font(20));
	    	this.searchscreen.setLayoutX(100);
	    	this.searchscreen.setLayoutY(100);
	        this.getChildren().add(this.searchscreen);
	        
	        this.inputField.setLayoutX(200);
	        this.inputField.setLayoutY(180);
	        this.getChildren().add(this.inputField);
	        
	        this.inputField2.setLayoutX(200);
	        this.inputField2.setLayoutY(140);
	        this.getChildren().add(this.inputField2);
	      
	        
	        this.Book.setText("Book Name");
	        this.Book.setLayoutX(100);
	        this.Book.setLayoutY(140);
	        this.setTextFill(Color.BLUE);
	        this.getChildren().add(this.Book);
	  
	        this.Aurther.setText("Aurther Name");
	        this.Aurther.setLayoutX(100);
	        this.Aurther.setLayoutY(180);
	        this.getChildren().add(this.Aurther);
	        
	        this.back.setText("SEARCH");
	        this.back.setLayoutX(290);
	        this.back.setLayoutY(220);
	        this.getChildren().add(this.back);
	        
	    }
		private void setTextFill(Color white) {
			// TODO Auto-generated method stub
}
