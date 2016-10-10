package common;

import java.util.List;

/**
 * Created by pogarg on 10/10/16.
 */
public class Util {
    public static void printList(List<Integer> list) {
        System.out.print("List contents: ");
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
