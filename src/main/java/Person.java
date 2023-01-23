public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(PersonBuilder personBuilder) {
        this.firstName  = personBuilder.firstName;
        this.lastName   = personBuilder.lastName;
        this.middleName = personBuilder.middleName;
        this.country    = personBuilder.country;
        this.address    = personBuilder.address;
        this.phone      = personBuilder.phone;
        this.age        = personBuilder.age;
        this.gender     = personBuilder.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getCountry() {
            return country;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public PersonBuilder( String firstName, String lastName, String middleName, String country, int age, String gender ) {
            this.firstName  = firstName;
            this.lastName   = lastName;
            this.middleName = middleName;
            this.country    = country;
            this.age        = age;
            this.gender     = gender;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Person build(){
            return new Person(this);
        }
    }
}

class TestBuilder{
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", "Doe", "Doe", "unknown", 20, "male").build();
        System.out.println(person.toString());
    }
}
