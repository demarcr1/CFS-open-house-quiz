//Author: Rebecca DeMarco 
//Project: CFS Religious Knowledge Quiz 

//import all of the javafx stuff so that the gui works! 
import javafx.application.Application ; 
import javafx.scene.Scene ; 
import javafx.scene.control.Button ; 
import javafx.scene.layout.HBox ; 
import javafx.scene.layout.VBox ; 
import javafx.scene.layout.GridPane
import javafx.scene.text.Text ; 
import javafx.stage.Stage ; 

public class CFSquiz extends Application { 
	
	//make the pane for the home menu, home menu pulls in homemenu_titles and homemenu_content
	VBox homemenu = new VBox() ; 
	
	//make box for titles 
	VBox homemenu_titles = new VBox() ; 
	
	//make the container pane for the user to choose from the different options 
	//homemenu_content pulls in homemenu_worldRelgions, homemenu_christiantity, homemenu_jewish, homemenue_islam, and homemenu_hindu
	GridPane homemenu_content = new GridPane() ; 
	
	
	//making the text for everything 
	Text homemenu_title = new Text("ERAU Center for Faith and Spirituality") ; 
	Text homemenu_subtitle = new Text("Test your knowledge on religion!") ; 
	
	//making the buttons for the homemenu 
	//button for world relgions 
	Button worldrelgionsquiz = new Button("World Religions Quiz") ; 
	//button for christianity 
	Button christianityquiz = new Button("Christianity Quiz") ;
	//button for judiasm 
	Button judiasmquiz = new Button("Judiasm Quiz") ; 
	//button for islam 
	Button islamquiz = new Button("Islam Quiz") ; 
	//button for hindu 
	Button hinduquiz = new Button("Hindu Quiz") ; 
	
	public CFSquiz(){ 
	}
	
	//making the gui work 
	
	@Override 
	public void start(Stage primaryStage) throws Exception {
		
	}
	
}