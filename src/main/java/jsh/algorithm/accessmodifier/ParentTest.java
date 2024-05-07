package jsh.algorithm.accessmodifier;

import jsh.algorithm.accessmodifier.parentpackage.MyClass;
import jsh.algorithm.accessmodifier.friendlypackage.MyClassChild;

public class ParentTest {

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

        MyClassChild myClassChild = new MyClassChild(1, 2, 3, 4);
        System.out.println(myClassChild.getPrivateField());
        //System.out.println(myClassChild.protectedField);
        //System.out.println(myClassChild.defaultField);
        System.out.println(myClassChild.publicField);
        //myClass.privateMethod();
        //myClassChild.protectedMethod();
        //myClassChild.defaultMethod();
        myClassChild.publicMethod();
    }
}
