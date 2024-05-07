package jsh.algorithm.accessmodifier.parentpackage;

public class MyClass {
    private int privateField;
    protected int protectedField;
    int defaultField;
    public int publicField;

    public MyClass(int privateField, int protectedField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.protectedField = protectedField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    public int getPrivateField() {
        return privateField;
    }
}
