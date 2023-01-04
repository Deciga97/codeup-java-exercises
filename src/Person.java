
public class Person {
        private String name;

        // Constructor
        public Person(String name) {
                this.name = name;
        }

        public String getName(){
                this.name = name;
                return null;
        }

        public void setName(String name){
                this.name = name;
        }
        public void sayHello(){
                System.out.println("Hello, my name is " + this.name);
        }

        public static void main(String[] args) {
                Person person = new Person("Alice");
                System.out.println(person.getName());  // Output: "Alice"
                person.sayHello();  // Output: "Hello, my name is Alice"
                person.setName("Bob");
                System.out.println(person.getName());  // Output: "Bob"
        }
}



