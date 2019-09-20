package com.lambton;

public class StringHandling {

    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello";
        String s3=s1;
        String s4 = new String("Hello");
        if(s1==s2)
        {
            System.out.println("s1==s2");

        }
        else
            {
                System.out.println("s1!=s2");
            }
        if(s3==s2)
        {
            System.out.println("s3==s2");
        }
        else
        {
            System.out.println("s3==s2");
        }

        if(s1==s4)
        {
            System.out.println("s1==s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }


        if(s1.equals(s4))
        {
            System.out.println("s1==s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
        String s6="Lambton College in Toronto";
        System.out.println(s6.length());
        System.out.println(s6.contains("College"));
        System.out.println(s6.indexOf("Toronto"));
        System.out.println(s6.toUpperCase());
        System.out.println(s6.toLowerCase());
        System.out.println(s6.charAt(10));
        System.out.println(s6.replace("Toronto","New York"));
        System.out.println(s6.substring(11,20));
        System.out.println(s6.toCharArray());
        System.out.println(s6.concat(" 267 Yorkland Bld, North York"));






        int a[]={1,2,3,4,5};
        int b[]=new int[]{1,2,3,4,5};
       int c[]=new int[10];
       char d[]=s6.toCharArray();
       //s6.length();
       int f=c.length;
        char rev[] = new char[s6.length()];
        int cnt=0;
        for(int i=s6.length()-1;i>=0;i--)
       {
          // System.out.println(d[i]);
            rev[cnt++]=d[i] ;
       }

       for(int z=0;z<=s6.length()-1;z++){
           System.out.print(rev[z]);
       }

    }
}
