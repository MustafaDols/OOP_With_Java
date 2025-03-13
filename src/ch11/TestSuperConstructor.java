package ch11;

public class TestSuperConstructor {
}

    class Faculty extends Employee {
        public static void main(String[] args) {  // >>> 1 main
            new Faculty();    // >>> 2 invokes Faculty constructor
        }
        public Faculty() { // >>> 3 when creating new object calling super constructor Employee
            System.out.println("(4) Performs Faculty's tasks");
        }
    }
    class Employee extends Person { // >>> 4 calling Employee no arg constructor
        public Employee() {  // >>> 5
            this("(2) Invokes Employee's overloaded constructor"); // >>> 6 this statement invokes the arg constructor
            System.out.println("(3) Performs Employee's tasks ");
        }
        public Employee(String s) { // >>> 7 before Employee must call the super constructor Person
            System.out.println(s);
        }
    }
    class Person {
        public Person() {  // >>> 8
            System.out.println("(1) Performs Person's tasks");  // >>> 9
        }
    }

