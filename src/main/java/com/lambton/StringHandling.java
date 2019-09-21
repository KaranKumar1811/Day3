package com.lambton;

import jdk.vm.ci.meta.Local;
import org.graalvm.compiler.lir.alloc.lsra.Interval;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringHandling {

    public static void main(String[] args) {

        String pattern="";
        DecimalFormat format=new DecimalFormat();
        format.applyLocalizedPattern(pattern);

        int value = 12345678;
        String output = format.format(value);
        System.out.println(value + " "+pattern+" "+output);

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        LocalDateTime now= LocalDateTime.now();
        System.out.println(dtf.format(now));


        LocalDate d1=LocalDate.of(1996,11,18);
        LocalDate d2=LocalDate.now();

        Period p=Period.between(d1,d2);
        System.out.println(p);
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


    /*
         String []evn_rev  = s6.split(" ");
            for (int i=0; i <evn_rev.length ;i++ )
            {
                if(i%2==1) {
                    rev=reverse
                }
            }




            static String reverse(String s6)
        {
            char c[]=s6.toCharArray();
            char rev[]=new char[d.length];
            int cnt = 0;

        }*/




    }
}
