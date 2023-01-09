public class Person {
        private String name;

        public Person(String name) {
                this.name = name;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void sayHello() {
                System.out.println("Hello, my name is " + this.name);
        }

        public static void main(String[] args) {
                Person person = new Person("John");
                System.out.println(person.getName()); // prints "John"
                person.setName("Jane");
                System.out.println(person.getName()); // prints "Jane"
                person.sayHello(); // prints "Hello, my name is Jane"
        }
}
