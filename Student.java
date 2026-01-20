class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(
                "Age should be between 15 and 21"
            );
        }

        
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException(
                "Name should not contain numbers or special characters"
            );
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
