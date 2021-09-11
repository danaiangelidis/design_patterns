package decorator;
/**
 * Written by Danai Angelidis
 */
public abstract class CharacterDecorator extends Character {
    
    protected Character character;

    /**
     * Constructs the character that will be decorated.
     * @param character The character that is being decorated.
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        for(int i=0; i<character.sections.size(); i++) {
            String line = character.sections.get(i);
            this.sections.add(line);
        }

        customize();
     }

     /**
      * Customizes the character.
      */
     public abstract void customize();

}
