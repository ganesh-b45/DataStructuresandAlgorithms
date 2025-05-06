package com.string.programs;

public class ReverseString {
    public static void main(String args[])
    {
        String s = "Hello World";


        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

        String s2 = "Hello Pune";
        String rev="";

        for (int i = s2.length()-1; i >=0 ; i--) {
            rev+=s2.charAt(i);
        }
        System.out.println("\n"+rev);

        String s3 = "Ganesh";
        char ch[] = s3.toCharArray();
        int l = ch.length-1;
        for (int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[l];
            ch[l] = temp;
            l--;
        }
        String CharArrayToStr = new String(ch);
        System.out.println("\n"+ CharArrayToStr);



        String s4 = "Mahesh";
        char ch1[]  = s4.toCharArray();
        int left=0;
        int right=ch1.length-1;

        while (left < right) {
            char temp = ch1[left];
            ch1[left] = ch1[right];
            ch1[right] = temp;
            left++;
            right--;
        }

        String s5 = new String(ch1);
        System.out.println("\n"+ s5);
    }
}
