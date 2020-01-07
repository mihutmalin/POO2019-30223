import java.util.ArrayList;

/**
 * The Class RPSModel.
 */
public class RPSModel {
	
	/** The is pressed. */
	private Boolean isPressed=false;
	
	/** The nr wins. */
	private int nrWins=0;
	
	/** The nr defeats. */
	private int nrDefeats=0;
	
	/** The list name. */
	private ArrayList<String> listName=new ArrayList<String>();
	
	/** The list wins. */
	private ArrayList<Integer> listWins=new ArrayList<Integer>();
	
	/** The list defeats. */
	private ArrayList<Integer> listDefeats=new ArrayList<Integer>();
	
	/**
	 * Size list name.
	 *
	 * @return the int
	 */
	public int sizeListName() {
		return listName.size();
	}
	
	/**
	 * Adds the name to list.
	 *
	 * @param s the s
	 */
	public void addNameToList(String s) {
		listName.add(s);
	}
	
	/**
	 * Gets the name from list.
	 *
	 * @return the name from list
	 */
	public String getNameFromList() {
		return listName.get(listName.size()-1);
	}
	
	/**
	 * Gets the name 1 from list.
	 *
	 * @return the name 1 from list
	 */
	public String getName1FromList() {
		return listName.get(1);
	}
	
	/**
	 * Gets the name 0 from list.
	 *
	 * @return the name 0 from list
	 */
	public String getName0FromList() {
		return listName.get(0);
	}
	
	/**
	 * Delete with condition.
	 */
	public void deleteWithCondition() {
		if(listName.size()==3)
			listName.remove(0);
	}
	
	/**
	 * Adds the win to list.
	 *
	 * @param s the s
	 */
	public void addWinToList(Integer s) {
		listWins.add(s);
	}
	
	/**
	 * Gets the win from list.
	 *
	 * @return the win from list
	 */
	public Integer getWinFromList() {
		return listWins.get((listName.size()-1));
	}
	
	/**
	 * Gets the win 1 from list.
	 *
	 * @return the win 1 from list
	 */
	public Integer getWin1FromList() {
		return listWins.get(1);
	}
	
	/**
	 * Gets the win 0 from list.
	 *
	 * @return the win 0 from list
	 */
	public Integer getWin0FromList() {
		return listWins.get(0);
	}
	
	/**
	 * Delete with condition wins.
	 */
	public void deleteWithConditionWins() {
		if(listWins.size()==3)
			listWins.remove(0);
	}
	
	/**
	 * Adds the defeats to list.
	 *
	 * @param s the s
	 */
	public void addDefeatsToList(Integer s) {
		listDefeats.add(s);
	}
	
	/**
	 * Gets the defeats from list.
	 *
	 * @return the defeats from list
	 */
	public Integer getDefeatsFromList() {
		return listDefeats.get((listName.size()-1));
	}
	
	/**
	 * Gets the defeats 1 from list.
	 *
	 * @return the defeats 1 from list
	 */
	public Integer getDefeats1FromList() {
		return listDefeats.get(1);
	}
	
	/**
	 * Gets the defeats 0 from list.
	 *
	 * @return the defeats 0 from list
	 */
	public Integer getDefeats0FromList() {
		return listDefeats.get(0);
	}
	
	/**
	 * Delete with condition defeats.
	 */
	public void deleteWithConditionDefeats() {
		if(listDefeats.size()==3)
			listDefeats.remove(0);
	}

/**
 * Gets the checks if is pressed.
 *
 * @return the checks if is pressed
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Boolean getIsPressed(){
		return this.isPressed;
	}
	
	/**
	 * Sets the checks if is pressed.
	 *
	 * @param isPressed the new checks if is pressed
	 */
	public void setIsPressed(Boolean isPressed){
		this.isPressed=isPressed;
	}
	
	/**
	 * Increase nr wins.
	 */
	public void increaseNrWins(){
		this.nrWins++;
	}
	
	/**
	 * Gets the nr wins.
	 *
	 * @return the nr wins
	 */
	public int getNrWins(){
		return this.nrWins;
	}
	
	/**
	 * Sets the nr wins.
	 *
	 * @param nrWins the new nr wins
	 */
	public void setNrWins(int nrWins){
		this.nrWins=nrWins;
	}
	
	/**
	 * Increase nr defeats.
	 */
	public void increaseNrDefeats(){
		this.nrDefeats++;
	}
	
	/**
	 * Gets the nr defeats.
	 *
	 * @return the nr defeats
	 */
	public int getNrDefeats(){
		return this.nrDefeats;
	}
	
	/**
	 * Sets the nr defeats.
	 *
	 * @param nrDefeats the new nr defeats
	 */
	public void setNrDefeats(int nrDefeats){
		this.nrDefeats=nrDefeats;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
}
