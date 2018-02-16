package factory.character;

import factory.character.characters.Character;

public class CharacterSelection {

    private CharacterFactory characterFactory = new CharacterFactoryImpl();

    public void selectCharacter(Characters characterSelected) {
        Character character = characterFactory.createCharacter(characterSelected);

        System.out.println("The character selected is " + character.toString());
    }
}
