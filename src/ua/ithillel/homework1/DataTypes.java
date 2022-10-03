package ua.ithillel.homework1;

import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {

        byte b = 127;
        short s = -32768;
        long l = 123456789;
        float f = 987654f;
        char c = 'S';
        boolean bool = true;
        String str1 = "first string";
        String str2 = new String("second string");
        int i1 = 111, i2 = 1111, i3 = 11111;
        double d = 222.2, d1 = 2222.22, d2 = 22222.222;

        byte bDiv = (byte) (b / 2);
        byte bSub = (byte) (b - 1);
        short sDiv = (short) (s / b);
        short sAdd = (short) (30000 + b);
        long lAdd = l + 65434;
        long lMul = l * lAdd;
        float fDiv = f / 1234f;
        float fSub = f - fDiv;
        char cAdd = (char) (c + 1);
        double cRof = c % 22.7;

        String taskOne = bDiv + "\n" + bSub + "\n" + sDiv + "\n" + sAdd + "\n" + lAdd + "\n" + lMul + "\n"
                + fDiv + "\n" + fSub + "\n" + cAdd + "\n" + cRof + "\n";
        System.out.println(taskOne);

        int assignAddInt = i1 += i2;
        int assignSubInt = i3 -= i2;
        int assignMulInt = i2 *= i3;
        double assignDivDouble = d2 /= d;
        double assignRofDouble = d %= 22.02;
        double assignMulDouble = d2 *= d2;
        byte assignSubByte = bSub -= 5;
        short assignAddShort = s += sAdd;
        long assignDivLong = lMul /= 25364L;
        float assignRofFloat = fSub %= f;

        String taskTwo = assignAddInt + "\n" + assignSubInt + "\n" + assignMulInt + "\n" +
                assignDivDouble + "\n" + assignRofDouble + "\n" + assignMulDouble + "\n" +
                assignSubByte + "\n" + assignAddShort + "\n" + assignDivLong + "\n" + assignRofFloat + "\n";
        System.out.println(taskTwo);

        boolean variable1 = assignDivDouble > assignMulDouble;
        boolean variable2 = assignMulInt >= assignAddInt;
        boolean variable3 = assignSubByte < assignAddShort;
        boolean variable4 = assignRofFloat <= assignDivLong;
        boolean variable5 = assignRofDouble == assignSubInt;

        String taskThree = variable1 + "\n" + variable2 + "\n" + variable3 + "\n" + variable4 +
                "\n" + variable5 + "\n";
        System.out.println(taskThree);

        int i = 1; // 1 0 1 1 1 2 1 1
        int decrement = --i;
        int increment = ++i;
        i = i;
        i = i;
        int incrementSecond = ++i;
        int decrementSecond = --i;
        i = i;

        String taskFour = i + "\n" + decrement + "\n" + increment + "\n" + i + "\n" + i + "\n" +
                incrementSecond + "\n" + decrementSecond + "\n" + i + "\n";
        System.out.println(taskFour);

        double[] array = {654.4, 2, 88.8, 55, 75366, 23647, 0, -33.575, -879, 303};
        System.out.println(Arrays.toString(array));

    }
}
