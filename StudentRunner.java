class StudentRunner {

    public static void main(String[] args) {

        Student student = new Student();
        student.studentInfo();

        int age = student.getAge();
        System.out.println("Student Age: " + age);

        student.setMarks(85);

        int total = student.addMarks(80, 90);
        System.out.println("Total Marks: " + total);
    }
}