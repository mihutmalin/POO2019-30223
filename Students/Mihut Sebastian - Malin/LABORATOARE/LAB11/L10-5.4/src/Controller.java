import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private Model model;
	private View view;
	
	Controller(Model model,View view){
		this.model=model;
		this.view=view;
		view.addSchimbListener(new SchimbListener());
	}
	
	class SchimbListener implements ActionListener{
	   	 public void actionPerformed(ActionEvent e) {
	   		if(view.continutFrom()=="USD" && view.continutTo()=="USD") {
	   			view.putIn(Double.toString((Integer.parseInt(view.getUserInput()))));
	   		}
	   		else if(view.continutFrom()=="USD" && view.continutTo()=="RON") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*4.29)));
	   		}
	   		else if(view.continutFrom()=="USD" && view.continutTo()=="EUR") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*0.9)));
	   		}
	   		
	   		
	   		
	   		else if(view.continutFrom()=="RON" && view.continutTo()=="RON") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput()))));
	   		}
	   		else if(view.continutFrom()=="RON" && view.continutTo()=="USD") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*0.23)));
	   		}
	   		else if(view.continutFrom()=="RON" && view.continutTo()=="EUR") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*0.21)));
	   		}
	   		
	   		
	   		
	   		else if(view.continutFrom()=="EUR" && view.continutTo()=="EUR") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput()))));
	   		}
	   		else if(view.continutFrom()=="EUR" && view.continutTo()=="RON") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*4.78)));
	   		}
	   		else if(view.continutFrom()=="EUR" && view.continutTo()=="USD") {
	   			view.putIn(Double.toString((Double.parseDouble(view.getUserInput())*1.11)));
	   		}
	   		
	   	 }
	    }
}
