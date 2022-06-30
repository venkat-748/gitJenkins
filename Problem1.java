import java.util.*;
import java.math.*;
class Problem1{
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		Problem1 prob=new Problem1();
		System.out.println("Problem-1 ");
		System.out.print("Enter the Letter :");
		String word=prob.in.nextLine();
		int count=0;
		for (int i=0; i<word.length();i++) {
			if(prob.isVowel(word.charAt(i))){
				count++;
			}
		}
		System.out.println("Total no of vowels in the word is "+count);
		System.out.println("Problem-2 ");
		prob.palindrome();
		System.out.println("Problem-3 ");
		System.out.print("Enter the number :");
		int num=prob.in.nextInt();
		if(prob.isPrime(num)){
			System.out.println("The Given no is Prime");
		}else{
			System.out.println("The Given no is not a Prime");
		}
		System.out.println("The Prime Numbers from 1 to 500 :");
		for(int i=0;i<500;i++){
			if(i>1){
			if (prob.isPrime(i)) {
				System.out.print(i+",");
			}
		}
		}
		System.out.println("\nProblem-4");
		prob.circle();
		System.out.println("Problem-5");
		prob.fact();
	}
	public boolean isVowel(char input){
		if (input=='a'||input=='A'||input=='e'||input=='E'||input=='i'||input=='I'||input=='o'||input=='O'||input=='u'||input=='U'){
			return true;
		}else{
			return false;
		}
	}
	public void palindrome(){
		System.out.print("Enter the Number :");
		int num=in.nextInt();
		if(num>=0){
			if(pali(num)){
				System.out.println(num+" Is Palindrome");
			}else{
				System.out.println(num+" Is not a Palindrome");
			}
		}else{
			System.out.println("Positive numbers only!");
		}
	}
	public boolean pali(int num){
		int od,rev=0,temp=num;
		while(num!=0){
			od=num%10;
			rev=rev*10+od;
			num=(int)num/10;
		}
		if (temp==rev) {
			return true;
		}else{
		return false;
	}
	}

	public boolean isPrime(int num){
		int count=0;
		if(num>1){
			for(int i=2;i<num;i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	public void circle(){
		System.out.print("Enter the Radius of the Circle :");
		int radius=in.nextInt();
		System.out.println("The Area is "+Math.PI*(radius*radius)+"\nCircumference is "+2*(Math.PI*(radius*radius)));
	}
	public void fact(){
		System.out.print("Enter the Number:");
		int fact=1,num=in.nextInt();
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial of a Number is "+fact);
	}
}
