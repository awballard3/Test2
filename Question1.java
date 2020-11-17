import java.io.File;
import java.util.*;

/* SPECIAL SYMBOLS:
* 
* 	+ 	-> ADDITION
* 	= 	-> ASSIGNMENT
* 	- 	-> SUBTRACTION
* 	/ 	-> DIVISION
* 	* 	-> MULTIPLICATION
* 	++ 	-> INCREMENT
* 	-- 	-> DECREMENT
* 	% 	-> MODULO_OPERATOR
* 	&& 	-> LOGICAL_AND
* 	|| 	-> LOGICAL_OR
* 	! 	-> LOGICAL_NOT
* 	{ 	-> OPEN_CODE_BLOCK
* 	} 	-> CLOSE_CODE_BLOCK
* 	( 	-> OPEN_FUNC_PARAM
* 	) 	-> CLOSE_FUNC_PARAM 
* 
*/

public class Question1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (new File("Example.txt"));
		while (sc.hasNext()){
	
			String lex = sc.next();
			
			// Checking if IDENTIFIER, must be followed by non-alphanumeric char
			if(lex.charAt(0) == '$' || lex.charAt(0) == '@' || lex.charAt(0) == '%'){
				// If identifier is longer than 1
				if(lex.length() > 1){
					// Check if each subsequent character is valid for identifier
					if (isRestValid(lex) == true){
						System.out.println(lex + ", IDENTIFIER");
					}
					
				}
				// If identifier is just $, @, or %
				else{
					System.out.print(lex + ", IDENTIFIER");
				}
			}
			
			//Checking if STRING literal
			// Checking to see if starts and ends with "
			else if(lex.charAt(0) == '"' && lex.charAt(lex.length()-1) == '"'){
				System.out.println(lex + ", STRING");
			}
			
			// Checking if INT
			else if(Character.isDigit(lex.charAt(0)) && containsDecimal(lex) == false && containsAllNums(lex) == true){
				System.out.println(lex + ", INT");
			}
			
			// Checking if CHAR literal
			// Checking to see if starts and ends with '
			else if(lex.charAt(0) == '\'' && lex.charAt(lex.length()-1) == '\''){
				System.out.println(lex + ", CHAR");
			}
			
			// Checking if FLOAT
			else if(Character.isDigit(lex.charAt(0)) && containsDecimal(lex) == true){
				System.out.println(lex + ", FLOAT");
			}
			
			// Checking if ADDITION symbol
			else if(lex.equals("+")){
				System.out.println(lex + ", ADDITION");
			}
			
			// Checking if ASSIGNMENT symbol
			else if(lex == "="){
				System.out.println(lex + ", ASSIGNMENT");
			}
			
			// Checking if SUBTRACTION symbol
			else if(lex == "-"){
				System.out.println(lex + ", SUBTRACTION");
			}
			
			// Checking if DIVISION symbol
			else if(lex.equals("/")){
				System.out.println(lex + ", DIVISION");
			}
			
			// Checking if MULTIPLICATION symbol
			else if(lex.equals("*")){
				System.out.println(lex + ", MULTIPLICATION");
			}
			
			// Checking if INCREMENT symbol
			else if(lex.equals("++")){
				System.out.println(lex + ", INCREMENT");
			}
			
			// Checking if DECREMENT symbol
			else if(lex.equals("--")){
				System.out.println(lex + ", DECREMENT");
			}
			
			// Checking if MODULO symbol
			else if(lex.equals("%")){
				System.out.println(lex + ", MODULO");
			}
			
			// Checking if LOGICAL_AND symbol
			else if(lex.equals("&&")){
				System.out.println(lex + ", LOGICAL_AND");
			}
			
			// Checking if LOGICAL_OR symbol
			else if(lex.equals("||")){
				System.out.println(lex + ", LOGICAL_OR");
			}
			
			// Checking if LOGICAL_NOT symbol
			else if(lex.equals("!")){
				System.out.println(lex + ", LOGICAL_NOT");
			}
			
			// Checking if OPEN_CODE_BLOCK symbol
			else if(lex.equals("{")){
				System.out.println(lex + ", OPEN_CODE_BLOCK");
			}
			
			// Checking if CLOSE_CODE_BLOCK symbol
			else if(lex.equals("}")){
				System.out.println(lex + ", CLOSE_CODE_BLOCK");
			}
			
			// Checking if OPEN_FUNCTION symbol
			else if(lex.equals("(")){
				System.out.println(lex + ", OPEN_FUNC_PARAM");
			}
			
			// Checking if CLOSE_FUNCTION symbol
			else if(lex.equals(")")){
				System.out.println(lex + ", CLOSE_FUNC_PARAM");
			}
			
			else{
				System.out.println("ERROR");
				//System.exit(0);
			}
			
		}
		
		sc.close();

	}

	// Returns true if all chars in string are a a letter, number, underscore, or digit
	public static boolean isRestValid(String s){
		for (int i = 1; i <= s.length()-1; i++){
			if(!Character.isDigit(s.charAt(i)) || !Character.isLetter(s.charAt(i)) || s.charAt(i) != '_'){
				return true;
			}
		}
		return false;
	}
	
	// Checks if the string contains a period
	public static boolean containsDecimal(String s){
		for (int i = 0; i <= s.length()-1; i++){
			if(s.charAt(i) == '.'){
				return true;
			}
		}
		return false;
	}
	
	// Checks if string is all numbers
	public static boolean containsAllNums(String s){
		for (int i = 0; i <= s.length()-1; i++){
			if(!Character.isDigit(s.charAt(i))){
				return false;
			}
		}
		return true;
	}

}
