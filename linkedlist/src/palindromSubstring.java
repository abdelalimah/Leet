import java.util.HashSet;
import java.util.Set;

public class palindromSubstring {



    static String longestPalindromSubstring(String str) {

            StringBuilder reverse;
            String a = "";
            String b = "";
            String ans = "";

            if(str.length() == 1){
                ans = str;
                return ans;
            }

            if(str.length() == 2){
                a += str.charAt(0);
                b += str.charAt(1);
                if(a.equals(b)){
                    ans += a+b;
                    return ans;
                }
                ans = a;
                return ans;
            }

            for (int i = 0; i <str.length() ; i++) {
                a = ""+str.charAt(i);
                //System.out.println(a);
                for (int j = i+1; j < str.length(); j++) {
                    //a += str.charAt(j);
                    if(a.equals(new StringBuilder(a).reverse().toString()) && a.length() > ans.length()){
                        ans = a;
                    }
                    a += str.charAt(j);

                }
            }
            return ans;
        }
    }