import java.util.Arrays;

public class Labor3 {
    public static void main(String[] args) {
        final int a = 5;
        String[] m = {",", ".", ";", ":"};
        char[] bukva = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        StringBuilder z = new StringBuilder("hello; kash fkslds dkslajkfkla traaa. Fsss: fakfaskklfa, Marka natasha. aovba");
        String[] b = (z.toString()).split(" ");
        z.delete(0, z.length());
        boolean flag;
        for (String word : b) {
            if (word.length() != a && word.length() != a + 1)
                z.append(word + " ");
            else {
                if ((Arrays.binarySearch(bukva, (word.toLowerCase()).charAt(0)) >= 0)) {
                    if (word.length() == a + 1) {
                        flag = false;
                        for (String simb : m) {
                            if (word.contains(simb)) {
                                z.append(simb + " ");
                                flag = true;
                                break;
                            }
                        }
                        if (!flag)
                            z.append(word + " ");
                    } else {
                        if (word.length() == a) {
                            for (String simb : m) {
                                if (word.contains(simb)) {
                                    z.append(word + " ");
                                    break;
                                }
                            }
                        }
                    }
                } else z.append(word);
            }
        }
        System.out.println(z.toString());
    }
}

