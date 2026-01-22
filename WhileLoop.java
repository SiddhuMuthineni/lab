class WhileLoop {
public static void main(String[] args) {

int subject = 1;
int totalMarks = 0;
int marks = 70;   // assume same marks for simplicity

while (subject <= 5) {
totalMarks = totalMarks + marks;
subject++;
}
System.out.println("Total Marks of 5 Subjects: " + totalMarks);
}
}
