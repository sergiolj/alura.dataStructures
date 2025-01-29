package set;

import java.util.LinkedList;

public class SetString {
    private LinkedList<LinkedList<String>> listSet = new LinkedList<LinkedList<String>>();

    public SetString() {
        for (int i = 0; i < 26; i++) {
            listSet.add(new LinkedList<>());
        }
    }

    /**
     * Retrieve an index from a given word by using its first letter.
     * The Unicode value of the first letter is subtracted by the Unicode value of 'a' to create a
     * sequenced index from 0 to 25 corresponding to each alphabet letter (a-z).
     * The Unicode value of 'a' is 97.
     *
     * @param value The word to be checked to retrieve its index.
     * @return An integer from 0 to 25 corresponding to one of the 26 letters of the alphabet.
     */
    public int retrieveIndexListSet(String value){
        return value.toLowerCase().charAt(0) -'a';
    }

    public void add(String value){

        
    }
}
