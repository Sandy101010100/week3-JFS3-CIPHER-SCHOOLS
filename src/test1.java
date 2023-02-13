import java.util.Arrays;
import java.util.List;

class program{
     static void converter(int arg){
        System.out.println(Math.abs(arg));
    }
    void doaction(){
        List<Integer>as= Arrays.asList(-3,7,8,-9,5);//list created
        as.forEach(program::converter);//stream wrapper in more executable form

    }

    public static void main(String[] args) {
        program obj=new program();
        obj.doaction();
    }
}

