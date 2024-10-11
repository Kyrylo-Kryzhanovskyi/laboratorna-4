package Task3;

public class OuterClass {
    public static String staticPublicField = "static public Field";
    protected static String staticProtectedField = "static protectedField";
    private static String staticPrivateField = "static privateField";
    static String  staticPackageField = " static packageField";
    public String publicField = "public Field";
    protected String protectedField = "protectedField";
    private String privateField = "privateField";
    String  packageField = " packageField";

    public static class StaticInnerClass {
        public void print() {
            System.out.println("StaticInnerClass:");
            // Статичний вкладенний клас має доступ до статичних полів зовнішнього класу оскільки не прив'язані до екземпляру зовнішнього класу
            System.out.println("Static Public in Static inner class: " + staticPublicField);
            System.out.println("Static Private in Static inner class: " + staticPrivateField);
            System.out.println("Static Protected in Static inner class: " + staticProtectedField);
            System.out.println("Static Package in Static inner class: " + staticPackageField);
            //System.out.println("Public in Static inner class: " + publicField);
            //System.out.println("Private in Static inner class: " + privateField);
            //System.out.println("Protected in Static inner class: " + protectedField);
            //System.out.println("Package in Static inner class: " + packageField);
        }
    }
    public class InnerClass {
        public void print() {
            System.out.println("InnerClass:");
            //Звичайний вкладенний клас має доступ до всіх полів: і статичних полів та не статичних полів зовнішнього класу, оскільки прив'язані до екземпляру зовнішнього класу
            System.out.println("Static Public in inner class: " + staticPublicField);
            System.out.println("Static Private in inner class: " + staticPrivateField);
            System.out.println("Static Protected in inner class: " + staticProtectedField);
            System.out.println("Static Package in inner class: " + staticPackageField);
            System.out.println("Public in inner class: " + publicField);
            System.out.println("Private in inner class: " + privateField);
            System.out.println("Protected in inner class: " + protectedField);
            System.out.println("Package in inner class: " + packageField);
        }

    }
}
