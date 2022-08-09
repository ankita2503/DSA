package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FlattenListUsingRecursion {

    public static void main(String[] args) {
        List<List<List<Integer>>> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list1.add(list2);
        list.add(list1);
        getListElements(list);



    }

    public static void getListElements(List list){

        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Integer){
                System.out.println(list.get(i));
            } else {
                getListElements((List) list.get(i));
            }

        }
    }
}
