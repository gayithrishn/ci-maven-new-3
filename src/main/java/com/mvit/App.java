package com.mvit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("progran executed successfully");
        System.out.println("this is my first jenkins CI pipeline");
        for(int i=1;i<=10;i++)
        {
            if(i==4)
            {
                break;
            }

            System.out.println(i);
        }
    }
}
