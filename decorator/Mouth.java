package decorator;
/**
 * Written by Danai Angelidis
 */
public class Mouth extends CharacterDecorator {
    
    /**
     * Calls the super constructor to decorate the character.
     * @param character The character that is being decorated.
     */
    public Mouth(Character character) {
        super(character);
    }

    /**
     * Adds the mouth to the potatoe head.
     */
    public void customize() {
        sections.set(5, "  \\ ---- /");
    }

}
