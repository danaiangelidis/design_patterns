package decorator;
/**
 * Written by Danai Angelidis
 */
public class Hat extends CharacterDecorator {

    /**
     * Calls the super constructor to decorate the character.
     * @param character The character that is being decorated.
     */
    public Hat(Character character) {
        super(character);
    }

    /**
     * Adds the hat to the potatoe head.
     */
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1,  "___|____|____");
    }
    
}
