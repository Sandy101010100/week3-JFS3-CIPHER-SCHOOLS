import java.util.Arrays;
import  java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(12,56,-90,78);
        List<Integer>result=numbers.stream().filter(e->e<0).collect(Collectors.toList());//filter
        System.out.println(result);
        List<Object>myList=Arrays.asList(true,100,"hello",900,"welcome");
        List<Object>ans=myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
        System.out.println(ans);
myList.forEach(m->{
    System.out.println(  m + " -> " + m.getClass().getSimpleName());
});
int totalintger=(int)myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println(totalintger);
    }
}
