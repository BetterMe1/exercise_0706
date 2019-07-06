package exercise.exercise_0705;

/*
守形数
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            String nStr = String.valueOf(n);
            String str = String.valueOf(n*n);
            int i = str.length()-nStr.length();
            if(nStr.equals(str.substring(i))){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}*/

/*
密码验证合格程序
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            if(helper(str)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean helper(String str) {
        boolean[] f = new boolean[4];
        int len = str.length();
        if(len<=8){
            return false;
        }
        for(int i=0; i<len;i++){
            char a = str.charAt(i);
            if('A'<=a && a<='Z'){
                f[0] = true;
            }else if('a'<=a && a<='z'){
                f[1] = true;
            }else if('0'<=a && a<='9'){
                f[2] = true;
            }else{
                f[3] = true;
            }
            if(i<len-2 && str.substring(i+3).contains(str.substring(i,i+3))){
                return false;
            }
        }
        int count = 0;
        for(int i=0; i<4; i++){
            if(f[i]){
                count++;
            }
        }
        return count >=3 ;
    }
}