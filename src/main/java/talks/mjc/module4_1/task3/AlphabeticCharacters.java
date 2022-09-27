package talks.mjc.module4_1.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(Character.isAlphabetic(character)) {
            if (character == 'a' && character == 'o' && character == 'i'
                    && character == 'e' && character == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
    }
}
