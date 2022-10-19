public class BoxingUnboxing {
    int j = 8;
    int a = Integer.valueOf(12);
    int k = a; // implicit call to a.intValue()
    int m = j + a; // a is automatically unboxed before the addition
    Integer b =  Integer.valueOf("100"); // constructor accepts a String
    int n = Integer.parseInt("2022"); // using static method of Integer class
}
