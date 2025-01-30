package set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetString {
    //private LinkedList<LinkedList<String>> listSet = new LinkedList<LinkedList<String>>();
    private ArrayList<LinkedList<String>> listSet = new ArrayList<LinkedList<String>>();
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
        if(value != null){
        return value.toLowerCase().charAt(0) -'a';
        }
        throw new IllegalArgumentException("Value cannot be null");
    }

    public void add(String value){
        if(!contains(value)){
            int index = retrieveIndexListSet(value);
            //List<String> list = listSet.get(index);
            //list.add(value);
            listSet.get(index).add(value);
        }
    }

    public boolean contains(String value){
        int index = retrieveIndexListSet(value);
        return listSet.get(index).contains(value);
    }
    public String remove(String value){
        int index = retrieveIndexListSet(value);
        if(value != null){
            listSet.get(index).remove(value);
        }
       return "Value " + value + " removed from list: " + index;
    }

    @Override
    public String toString() {
        return listSet.toString();
    }
}
