package decorator;
/**
 * Written by Danai Angelidis
 */
public class Nose extends CharacterDecorator {

    /**
     * Calls the super constructor to decorate the character.
     * @param character The character that is being decorated.
     */
    public Nose(Character character) {
        super(character);
    }

    /**
     * Adds the nose to the potatoe head.
     */
    public void customize() {
        this.sections.set(4, " |   >    |");
    }
    
}
