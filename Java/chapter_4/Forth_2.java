package chapter_4;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;


//String
public class Forth_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newStr;
        newStr = input.nextLine();
        System.out.println(newStr);

        System.out.println("The length of newStr is:" + newStr.length());
        System.out.println("char's Index of 3 is: "+newStr.charAt(3));
        String newStr2="Hello    ";
        // concat 返回一个新的字符串，将两个字符串连接在一起
        newStr.concat(newStr2);
        System.out.println(newStr);
        newStr=newStr.concat(newStr2);
        System.out.println(newStr+". and length is :"+newStr.length());
        // trim去掉两边的空白字符
        newStr=newStr.trim();
        System.out.println(newStr+". and length is :"+newStr.length());
        
        System.out.println("你可以不创建一个新变量的情况下直接引用字符串".length());
        
        // 加号（+)也可用于连接数字和字符串
        System.out.println("xzz"+3);

        String testTemp="TestString";
        testTemp+="test";
        System.out.println(testTemp+'x');
        // next()方法读取以空白字符结束的字符串
        //（即 ’ 、'\t_ 、'\f\ ’\r 或 An')。

        String s1="Hello";
        String s2="hello";
        String s3="Hello";
        String s4="abcde";
        System.out.println(s1.equals(s2)+" "+s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        // compareTo 其实就是比较两个字符串的字典顺序
        System.out.println(s1.compareTo(s2)+s1.compareTo(s3)+s1.compareTo(s4));
        // substring(a,b) 返回index(a)到index(b-1)
        System.out.println("xzzxwmsadsl".substring(1));
        System.out.println("xzzxwmasdawsl".substring(0,3));
        
        //indexOf
        String str1="xzzxwmsdwwsslxzzxzz";
        System.out.println(str1.indexOf("xzz"));
        System.out.println(str1.indexOf('z'));
        System.out.println(str1.indexOf("xzz",2));
        System.out.println(str1.lastIndexOf("xzz"));

        //应用，从一个字符串中获取姓名
        String cardID="George Floyd";
        int indexOfZero=cardID.indexOf(' ');
        System.out.println("FirstName is:"+cardID.substring(0,indexOfZero));
        System.out.println("SecondName is:"+cardID.substring(indexOfZero+1));

        //数字和字符串
        String numStr1="1998";
        String numStr2="3.1415926";
        int intValue=Integer.parseInt(numStr1);
        double doubleValue=Double.parseDouble(numStr2);
        System.out.println(intValue+" "+doubleValue);

        //数字转字符串
        String sst=123123+"";
        System.out.println(sst);
    }
}