public class Main {
    public static void main(String... args) {
        Person Harvey = new Person();
        Harvey.name = "Harvey";
        Harvey.age = 19;
        Harvey.gender = "Male";
        System.out.println("Hello my name is " + Harvey.name + "and I am " + Harvey.age + " years old and a " + Harvey.gender);
        System.out.println(Harvey);
        
        Person Will = new Person();
        Will.name = "Will";
        Will.age = 27;
        System.out.println(Will.name);
        System.out.println(Will.age);
    }

}