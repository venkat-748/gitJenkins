import java.util.*;
class Problem2{
	public static void main(String[] args) {
	String password="-124";
	if(password.length()==4 || password.length()==6){
		for (int i=0;i<password.length();i++) {
			if(password.charAt(i)!='.'&&password.charAt(i)!=','&&password.charAt(i)!='+'&&password.charAt(i)!='-'){
			if(!Character.isAlphabetic(password.charAt(i))){
				System.out.print(password.charAt(i));
			}else{
				System.out.print("alpha");
			}
}else{
	System.out.print("alpha");
}
		}
	}else{
		System.out.print("alpha");
	}
}
}