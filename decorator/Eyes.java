package decorator;
/**
 * Written by Danai Angelidis
 */
public class Eyes extends CharacterDecorator {

    /**
     * Calls the super constructor to decorate the character.
     * @param character The character that is being decorated.
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * Adds the eyes to the potatoe head.
     */
    public void customize() {
        this.sections.set(3, " |  o  o  |");
    }

}
