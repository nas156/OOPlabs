import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Labor3 {
    public static void main(String[] args) {
        final int a=5;
        char [] bukva={'b',  'c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        StringBuilder z = new StringBuilder("Hello, kash, fkslds dkslajkfkla fs fakfaskklfa. Marka, natasha. aovba");
        String[] b= (z.toString()).split(" ");
        z.delete(0,z.length());
        ArrayList<String> l= new ArrayList<>();
        for (int i = 0; i <b.length ; i++) {
            l.add(b[i]);
        }
        System.out.println(l.toString());
        for (int i = 0; i <b.length ; i++) {
            if (Arrays.binarySearch(bukva,(((b[i].toLowerCase()).toCharArray())[0]))>0)
            {
                if (b[i].length()==(a+1) || b[i].length()==a)
                    for (int j = 0; j <bukva.length ; j++) {

                if((b[i].toCharArray())[b[i].length()-1]==','|| ((b[i].toCharArray())[b[i].length()-1]=='.'))
                {
                    if (b[i].length()==(a+1))
                        l.remove(b[i]);
                }
                    else
                        if (b[i].length()==a)
                            l.remove(b[i]);}
            }
        }
        for (int i = 0; i <(l.toArray()).length ; i++) {
            z.append((l.toArray())[i]+" ");

        }
        System.out.println(z.toString());
        }

}

