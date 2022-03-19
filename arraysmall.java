//find the smallest number in an array//
import java.io.*;
import java.util.*;

public class arraysmall
{
public static void main(String args[])
{
 int a[]=new int[5];
int i,small=0;
System.out.println("enter five number");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
small=a[0];
for(i=0;i<5;i++)
{
if(a[i]<=small)
{
 small=a[i];
}
}
System.out.println("smallest number in array is" +small);
}
}
/*input-enter five number
        12,4,3,7,9
 output- samllest number in array is 3*/