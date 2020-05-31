package chapter_4;
// Math, Char
public class Forth_1 {
    public static void main(String[] args) {
        System.out.println(Math.sin(30)); // 不是预期值
        System.out.println(Math.PI / 6);

        // 获取a ~ a+b 之间的随机值，不包含a+b
        System.out.println(30+(int)(Math.random()*20));  // 30 ~ 30 + 20  ----> 30~50
        // 0 ~ a 之间的整数
        System.out.println((int)(Math.random()*20));  // 记得()不要忘记，因为Math.random为0~1之间，不加()易被转化为0

        // unicode && ASCII
        System.out.println("A  ==  "+'\u0041');

        // Change other type var to char, remain the low 16 bit
        char testCharVar=(char)0XAFAB0061;
        System.out.println(testCharVar);

        //Change char to other type var
        byte testOtherVar='B';
        System.out.println(testOtherVar);
        byte testOverVar=(byte)'\uAA10';// only remain low 8 bit,because it's over length
        System.out.println(testOverVar);

        //Character Class
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));

        // random lowerCase
        //fun 1
        System.out.println(Character.toChars(97+(int)(Math.random()*26)));
        //fun 2
        System.out.println((char)(97+(int)(Math.random()*26)));
        }
}