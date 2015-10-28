//Author: Rebecca DeMarco 
//Project: CFS Religious Knowledge Quiz 

//import all of the javafx stuff so that the gui works! 
import javafx.application.Application ; 
import javafx.scene.Scene ; 
import javafx.scene.control.Button ; 
import javafx.scene.layout.HBox ; 
import javafx.scene.layout.VBox ; 
import javafx.scene.text.Text ; 
import javafx.stage.Stage ; 

public class CFSquiz extends Application { 
	
	//make the pane for the home menu, home menu pulls in homemenu_titles and homemenu_content
	VBox homemenu = new VBox() ; 
	
	//make box for titles 
	VBox homemenu_titles = new VBox() ; 
	
	//make the container pane for the user to choose from the different options 
	//homemenu_content pulls in homemenu_worldRelgions, homemenu_christiantity, homemenu_jewish, homemenue_islam, and homemenu_hindu
	HBox homemenu_content = new HBox() ; 
	
	//make the pane for each category 
	
	//world religions 
	VBox homemenu_worldRelgions = new VBox() ; 
	//christianity 
	VBox homemenu_christianity = new VBox() ; 
	//judiasm 
	VBox homemenu_jewish = new VBox() ; 
	//islam
	VBox homemenu_islam = new VBox() ; 
	//hindu 
	VBox homemenu_hindu = new VBox() ; 
	
	//makeing the text for everything 
	
	Text homemenu_title = new Text("Center for Faith and Spirituality") ; 
	Text homemenu_subtitle = new Text("Religious Knowledge Quiz") ; 
	
}