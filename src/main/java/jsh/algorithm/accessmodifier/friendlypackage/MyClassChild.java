package jsh.algorithm.accessmodifier.friendlypackage;

import jsh.algorithm.accessmodifier.parentpackage.MyClass;

public class MyClassChild extends MyClass {

    public MyClassChild(int privateField, int protectedField, int defaultField, int publicField) {
        super(privateField, protectedField, defaultField, publicField);
    }

    public void testProtectedAccess() {
        System.out.println(getPrivateField());
        System.out.println(protectedField);
        //System.out.println(defaultField);
        System.out.println(publicField);
        //privateMethod();
        protectedMethod();
        //defaultMethod();
        publicMethod();
    }
}
