class Student {

    public void studentInfo() {
        System.out.println("Student Name: Keerthana");
        System.out.println("Course: BCA");
    }
	
    public int getAge() {
        int age = 20;
        return age;
    }
   
    public void setMarks(int marks) {
        System.out.println("Student Marks: " + marks);
    }

    public int addMarks(int m1, int m2) {
        int total = m1 + m2;
        return total;
    }
}