package decorator;
/**
 * Written by Danai Angelidis
 */
public class PotatoeHead extends Character {

    /**
     * Creates the shell of the potatoe head.
     */
    public PotatoeHead() {
        this.sections.add(" ");
        this.sections.add("    ____");
        this.sections.add("  /      \\ ");
        this.sections.add(" |        |");
        this.sections.add(" |        |");
        this.sections.add("  \\      / ");
        this.sections.add("   \\____/");        
    }
    
}
