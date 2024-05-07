package jsh.algorithm.accessmodifier.parentpackage.childpackage;

import jsh.algorithm.accessmodifier.parentpackage.MyClass;

public class ChildTest {

    public static void main(String[] args) {
        MyClass myClass = new MyClass(1, 2, 3, 4);
        //System.out.println(myClass.privateField);
        System.out.println(myClass.getPrivateField());
        //System.out.println(myClass.protectedField);
        //System.out.println(myClass.defaultField);
        System.out.println(myClass.publicField);
        //myClass.privateMethod();
        //myClass.protectedMethod();
        //myClass.defaultMethod();
        myClass.publicMethod();
    }
}
