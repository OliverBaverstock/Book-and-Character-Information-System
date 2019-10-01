package application;

/**
 * This class was developed to store the information on
 * a character of a book. The details stored are the: 
 * character's name, gender and their description. This is 
 * used by the AddCharacterController, OpenCharacterController
 * and the ViewCharactersController.
 * 
 * @author Niall Jordan / 20079783
 *
 */

public class Character {

	/*--------------------------------------------------------------------------
     *                        I N S T A N C E  F I E L D S                        
     *-------------------------------------------------------------------------*/
	private String characterName, gender, characterDescription, bookAssociated;
	public Character next = null;

	/*--------------------------------------------------------------------------
     *                              G E T T E R S                        
     *-------------------------------------------------------------------------*/
	public String getCharacterName() {
		return characterName;
	}

	public String getGender() {
		return gender;
	}
	
	public String getCharacterDescription() {
		return characterDescription;
	}

	public String getBookAssociated() {
		return bookAssociated;
	}
	
	/*--------------------------------------------------------------------------
     *                              S E T T E R S                        
     *-------------------------------------------------------------------------*/
	
	public void setCharacterName(String name) {
		this.characterName = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setCharacterDescription(String description) {
		this.characterDescription = description;
	}
	
	public void setBookAssociated(String book) {
		this.bookAssociated = book;
	}

	
	public void setNext(Character nextCharacter) {
		this.next = nextCharacter;
	}
}
