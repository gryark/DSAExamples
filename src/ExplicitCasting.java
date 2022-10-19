public class ExplicitCasting {
    double d1 = 3.2;
    double d2 = 3.9999;
    int i1 = (int) d1; // i1 gets value 3
    int i2 = (int) d2; // i2 gets value 3
    double d3 = (double) i2; // d3 gets value 3.0

    String s1 = "2014";
    int i3 = Integer.parseInt(s1); // i1 gets value 2014
    int i4 = -35;
    String s2 = Integer.toString(i2); // s2 gets value ”-35”

    //Implicit Casting
    int i5 = 42;
    double d5 = i1; // d1 gets value 42.0
    //i1 = d1; // compile error: possible loss of precision

    String s = Integer.toString(22); // this is good
    String t = "" + 4.5; // correct, but poor style
    String u = "Value = " + 13; // this is good
}
