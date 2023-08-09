
import java.util.HashSet;
import java.util.Set;

public class Substring {

    public static void main(String [] args)
    {
        char []a={'a','b','c','b','c'};
        int len=a.length;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<len;i++)
        {
            set.add(a[i]);
        }

        for (char x:set) {

            System.out.print(x);
        }

    }



}
