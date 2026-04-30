import java.util.*;

public class HelloWorld{
    public static int longestsSubstring(String s){
HashMap<Character, Integer> map = new HashMap<>();
int start=0;
int max=0;
for (int end=0;end<s.length();end++){
    char ch =s.charAt(end);
    if(map.containsKey(ch)){
        start=Math.max(start, map.get(ch)+1);
    }
    map.put(ch,end);
    max=Math.max(max,end - start + 1);

}
return max;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String input = sc.nextLine();
        int result= longestsSubstring(input);
        System.out.println("Longest substring :" +result);
        sc.close();

    }

}



