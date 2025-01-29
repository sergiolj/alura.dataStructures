package set;

import java.util.LinkedList;

public class TestSet {
    public static void main(String[] args) {
        SetString setList = new SetString();

        System.out.println(setList.retrieveIndexListSet("amelia"));
        System.out.println(setList.retrieveIndexListSet("Amelia"));
        System.out.println(setList.retrieveIndexListSet("belle"));
        System.out.println(setList.retrieveIndexListSet("Christian"));
        System.out.println(setList.retrieveIndexListSet("Zord"));
    }
}
