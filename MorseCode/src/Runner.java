
public class Runner {
	

	public static void main(String[]args) {
		
		MorseCode m = new MorseCode();
		
		
			
		String str = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		String[] morseWords = str.split(" ");
		String blank = "";
		
		
		for (int i = 0 ; i < morseWords.length ; i++ ) {
			
		blank = blank + m.M2T(morseWords[i]);
	
		}
		
		System.out.println(blank);
		
		
	}
}
