import java.util.*;
import java.util.stream.Collectors;
//the map method is used to map each element to its coresponding function
public class test2 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> ans = myList.stream().map(e -> e * e).collect(Collectors.toList());//
        System.out.println(ans);
    }
}