package intern2;

import java.util.Scanner;

public class StudentMarksCalculation {

	public static void main(String[] args) {
		
//		Create the Scanner class object
		Scanner sc =new Scanner(System.in);
		
//		User can have some subjects
		System.out.print("How many Subjects you have? : ");
		int sub =sc.nextInt();
		if(sub<0) {
			System.out.println("Please enter positive number");
			
		}
		else if(sub>0) {
//		All subject marks will store into an array
		int subjects[] = new int[sub];
		
//		store the value to display the result
		int total=0;	
		float avr=0;
		char grade = 0;
		
//		Check the subject marks will be in the range of 0 to 100
			for(int i=0; i<sub;) {
				System.out.print("Enter The Subject Marks (0-100):  ");
				int marks=sc.nextInt();
				if(0<marks && marks<=100) {
					subjects[i] = marks;
//					Calculate the total marks
					total+=subjects[i];
					 i++;
				}
				else {
					System.out.println("Please enter valid marks! ");
				}
			
			}
		
//		Calculate the average marks
			avr = (float)total/sub;
			
//			Checking the subjects marks are eligible to Pass or Fail
			for(int subject : subjects) {
				
				if(subject>34) {
					
					if(avr>=90 && subject>34) 
						grade = 'O';
					else if(avr>=80 && subject>34)
						grade = 'A';
					else if(avr>=70 && subject>34)
						grade = 'B';
					else if(avr>=60 && subject>34)
						grade = 'C';
					else if(avr>=50 && subject>34)
						grade = 'D';
					else if(avr>=40 && subject>34)
						grade = 'E';
					else if(avr<40 && subject>34)
						grade = 'F';
						
				}
				
//				If the person is fail in any subject 
				else {
					grade ='F';
					System.out.println();
					System.out.println("You are Failed");
					break;
				}
			}
			
//			Display the Result
			
			System.out.println("");
			System.out.println("Total Marks : "+total);
			System.out.println("Percentage is : "+avr);
			System.out.println("Grade is : "+grade);
	
		}
	}
}
