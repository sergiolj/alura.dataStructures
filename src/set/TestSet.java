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

        setList.add("Amélia");
        setList.add("Belle");
        setList.add("Beatrice");
        setList.add("John");
        setList.add("Jane");
        setList.add("Jack");

        //setList.add(null);
        setList.add("Amélia");
        System.out.println(setList);
        setList.add("Zed");
        System.out.println(setList);
        System.out.println(setList.remove("Amélia"));
        System.out.println(setList.remove("Zed"));
        System.out.println(setList);
        //setList.remove(null);

    }
}
