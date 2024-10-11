package Task4;

public class OuterClassForLocal {
    public static String staticPublicField = "static public Field";
    protected static String staticProtectedField = "static protectedField";
    private static String staticPrivateField = "static privateField";
    static String  staticPackageField = " static packageField";
    public String publicField = "public Field";
    protected String protectedField = "protectedField";
    private String privateField = "privateField";
    String  packageField = " packageField";
    public void method(){
        System.out.println("inside method");
        //Локальний клас має доступ до всіх полів, оскільки клас працює тільки в методі, а метод прив'язаний до екземпляру зовнішнього класу
        class LocalClass{
            public void print(){
                System.out.println("LocalClass:");
                System.out.println("Static Public in local class: " + staticPublicField);
                System.out.println("Static Private in local class: " + staticPrivateField);
                System.out.println("Static Protected in local class: " + staticProtectedField);
                System.out.println("Static Package in local class: " + staticPackageField);
                System.out.println("Public in local class: " + publicField);
                System.out.println("Private in local class: " + privateField);
                System.out.println("Protected in local class: " + protectedField);
                System.out.println("Package in local class: " + packageField);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.print();
    }
}
