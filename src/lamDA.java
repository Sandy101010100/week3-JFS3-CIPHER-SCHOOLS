interface mathX{
    void add(int a,int b);
}


public class lamDA {
    public static void main(String[] args) {
        mathX obj=(int x,int y)-> {
            System.out.println(x + y);
        };
        obj.add(10,60);
        }
    }

