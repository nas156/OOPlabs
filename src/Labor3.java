import java.util.ArrayList;
import java.util.Arrays;

public class Labor3 {
    public static void main(String[] args) {
        final int a=5;
        char [] bukva={'b', 'c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        StringBuilder z = new StringBuilder("Hello, kash, fkslds dkslajkfkla traaa. fsss. fakfaskklfa. Marka natasha. aovba");
        String[] b= (z.toString()).split(" ");
        z.delete(0,z.length());
        for (int i = 0; i <b.length ; i++) {
            if (b[i].length()!=a&& b[i].length()!=(a+1))
                z.append(b[i]+" ");
            else
                if (Arrays.binarySearch(bukva,(((b[i].toLowerCase()).toCharArray())[0]))>0)
                    {
                        if ((b[i].length()==(a+1)&&((b[i].toCharArray())[b[i].length()-1]==','|| ((b[i].toCharArray())[b[i].length()-1]=='.'))))
                            z.append((b[i].toCharArray())[b[i].length()-1]+" ");
                        else
                            if (((b[i].length()==a) &&((b[i].toCharArray())[b[i].length()-1]==',' || ((b[i].toCharArray())[b[i].length()-1]=='.'))))
                                z.append(b[i]+" ");
                            else z.append(b[i]+" ");

                    }
                else z.append(b[i]);
        }

        System.out.println(z.toString());
    }
}
