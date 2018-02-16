package factory.character;

import factory.character.characters.Character;

public class CharacterFactoryImpl extends CharacterFactory {

    public Character createCharacter(Characters selectedCharacter) {
        String selectedCharacterName = selectedCharacter.name();
        String characterClassName = selectedCharacterName.substring(0, 1).toUpperCase() + selectedCharacterName.substring(1).toLowerCase() + "Character";
        Character character = null;
        try {
            character = (Character) Class.forName(Character.class.getPackage().getName() + "." + characterClassName).newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(String.format("Character not found for %s", characterClassName));
        } catch (InstantiationException ie) {
            throw new RuntimeException(String.format("Could not create the character object %s", characterClassName));
        } catch (IllegalAccessException iae) {
            throw new RuntimeException("That was illegal.");
        }
        return character;
    }
}
