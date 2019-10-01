package application;

public class CharacterList {

	Character head;
	Character tail;

	public void addCharacter(String characterName, String gender, String characterDescription, String bookAssociated) {

		Character newCharacter = new Character();

		if(tail == null) {
			head = newCharacter;
			tail = newCharacter;
		}
		else {
			tail.setNext(newCharacter);
			tail = newCharacter;
		}	
	}
	
	public Character findCharacterByName(String characterName) {
		if(head == null) {
			return null;
		}
		
		if(head.getCharacterName() == characterName) {
			return head;
		}
		
		Character active = head;
		
		while(active.next != null) {
			if(active.getCharacterName() == characterName) {
				return active.next;
			}
			active = active.next;
		}
		
		return null;
	}
	
	
	public Character findCharacterByBookAssociated(String bookAssociated) {
		if (head ==null) {
			return null;
		}
		
		if(head.getBookAssociated() == bookAssociated) {
			return head;
		}
		
		Character active = head;
		
		while(active.next != null) {
			if(active.getBookAssociated() == bookAssociated) {
				return active.next;
			}
			active = active.next;
		}
		return null;
	}
	
	public Character listCharacterByName() {
		return null;
	}
}

