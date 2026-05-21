import java.util.*;
abstract class picture
{
    abstract void area(int side);
    void fun()
    {
        System.out.println("java program");
    }
}
class Square extends picture
{
    void area(int side)
    {
        System.out.println(side*side);
    }
}
public class Main 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int side=s.nextInt();
        Square st=new Square();
        st.area(side);
        st.fun();
    }
}