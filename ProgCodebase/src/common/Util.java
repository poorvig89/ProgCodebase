package common;

import java.util.List;
import java.util.Objects;

/**
 * Created by pogarg on 10/10/16.
 */
public class Util {
    public static <Rq extends Object> void  printList(List<Rq> list) {
        System.out.print("List contents: ");
        for(Rq i: list){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <Rq extends Object> void  printArray(Rq[] arr) {
        System.out.print("Array contents: ");
        for(Rq i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
