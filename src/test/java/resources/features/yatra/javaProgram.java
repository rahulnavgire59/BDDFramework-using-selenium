package resources.features.yatra;

import org.apache.logging.log4j.core.appender.SyslogAppender;

import java.util.*;

public class javaProgram {

    public static void main(String[] args) {

        String s = "qwertyuioa";

        String s1 ="asdfghjkl";


        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if (!s1.contains(String.valueOf(c))){
                s1=s1+c;
                int repeatcounter= 0;
                char b = s1.charAt(s1.length()-1) ;
                for(int j =0;j<s.length();j++){

                    if(b==s.charAt(j)){
                        repeatcounter++;
                    }


                }
                System.out.println(b +"="+ repeatcounter);

            }

        }

        System.out.println(s1);


        int count =0;
//       for(int i = s.length()-1;i>=0;i--){
//           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
//            count++;
//           }
//       }
//        System.out.println(count);
////        if(s.equalsIgnoreCase(s1)){
////            System.out.println("palindrome");
////        }
////        else{
////            System.out.println("not a palindrome");
////        }


        HashMap <Character, Integer> map = new HashMap<>();
            for(int i =0; i<=s.length()-1; i++){
                if(!map.keySet().contains(s.charAt(i))){
                    map.put(s.charAt(i), 1);
                }
            else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
            }

            System.out.println(map);
            System.out.println(map.keySet().stream().sorted().toList());
            System.out.println(map.values().stream().sorted().toList());


        HashSet<Character> hs = new HashSet<>();
       for(char c : s.toCharArray()){
           hs.add(c);
       }
System.out.println(hs);
//        ArrayList<Character> al = new ArrayList<>(Arrays.asList(s.toCharArray()));
//al.add(Arrays.asList(s.toCharArray()));


        List<String> list = Arrays.asList("Java", "Python", "Java", "C++");
            HashSet<String> hs1 = new HashSet<>(list);

            System.out.println(hs1);


    }
}
