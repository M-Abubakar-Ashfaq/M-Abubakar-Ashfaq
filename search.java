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
	  
}
