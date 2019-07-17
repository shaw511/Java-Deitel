import java.util.Random;

public class RandomSentences{
	
	
	public static void main(String[] args){
		Random number = new Random();
		String[] articles = {"the", "a", "one", "some"};
		String[] nouns = {"boy", "girl", "dog", "car", "town"};
		String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] prepositions = {"to", "from", "over", "under", "on"};
	
		for(int i =0; i<20; i++){
			String[] sentence = new String[6];
			sentence[0] = articles[number.nextInt(4)];
			sentence[1] = nouns[number.nextInt(5)];
			sentence[2] = verbs[number.nextInt(5)];
			sentence[3] = prepositions[number.nextInt(5)];
			sentence[4] = articles[number.nextInt(4)];
			sentence[5] = nouns[number.nextInt(5)];
			char[] capitaliser  = sentence[0].toCharArray();
			capitaliser[0] = Character.toUpperCase(capitaliser[0]);
			sentence[0] = new String(capitaliser);
			for(String words: sentence){
				System.out.print(words);
				System.out.print(" ");
			}
			System.out.print(".");
			System.out.println();
			
		}
	
	}

}