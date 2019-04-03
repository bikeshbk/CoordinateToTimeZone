//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class Demo
{
    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {
        TimezoneMapper myObject = new TimezoneMapper();
        System.out.print(myObject.latLngToTimezoneString(44.859009,-93.298050));
    }
}
