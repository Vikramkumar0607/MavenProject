package assignment;

public class Assignment15 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		String [] words = sentence.split(" ");
		//Count the total number of words in the sentence.
		System.out.println(sentence.length());

		//Print the sentence words in reverse order.
		String reverseSentence = "";
		for(int i = words.length-1 ; i>=0;i--) {
			reverseSentence =reverseSentence+words[i]+" ";

		}
		System.out.println("Reverse Sentence is: " + reverseSentence);
		
		//Convert the first character of each word to uppercase and print original sentence
		String finalvalue="";
		for(int j =0; j<words.length;j++) {
			finalvalue = finalvalue+Character.toUpperCase(words[j].charAt(0))+words[j].substring(1)+" ";

		}
		String uppercaseSentence = "";
		System.out.println(finalvalue);
		for (String word : words) {
			// Capitalize first character + keep rest of the word as is, then add a space
			uppercaseSentence = uppercaseSentence + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}

	}

}
