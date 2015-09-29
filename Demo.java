package com.datatype.com;

/**
 * Created by bikash on 9/28/15.
 */
public class Demo {
    public static void main(String args[]){

                char c ='a'; // 2bytes
                byte b = 1; //1 byte
                short s =3; //2 byte
                int i =4; //4 byte
                long l =5; //8 byte

                float f = (float) 2.1; // casting // 4 byte
                double d = 5.4 ; // 8 bytes
                System.out.println(i);

	/*	Widening data conversion
	    byte to short, int, long, float, or double
	    Short to int, long, float, or double
	    char to int, long, float, or double
	    int to long, float, or double
	    long to float or double
	    float to double

	    Narrowing data conversion
The narrowing conversion occurs from a type to a different type that has a smaller size, such as from a long (64 bits) to an int (32 bits).
In general, the narrowing primitive conversion can occur in these cases:

    short to byte or char
    char to byte or short
    int to byte, short, or char
    long to byte, short, or char
    float to byte, short, char, int, or long
    double to byte, short, char, int, long, or float

    The narrowing primitive conversion must be explicit.
    You need to specify the target type in parentheses.

		*/
            }

        }
}
