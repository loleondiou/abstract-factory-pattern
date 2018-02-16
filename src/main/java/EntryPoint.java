import factory.character.CharacterSelection;
import factory.character.Characters;

public class EntryPoint {

    public static void main(String... args) {
        new CharacterSelection().selectCharacter(Characters.INFANTRY);
    }

}
