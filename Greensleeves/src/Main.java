import java.util.ArrayList;
import essay.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Essay e = new Essay("lib/test.txt");
		EssayProcessor ep = new EssayProcessor(e);
		ArrayList<ArrayList<Double>> output;
		/*for(int i = 0; i < e.getNumOfParas(); i++){
			for(int j = 0; j < e.getParagraph(i).getNumOfSents(); j++){
				System.out.println(e.getParagraph(i).getSentenceStr(j)+"\n" +"\tParagrah " + i);
			}
		}*/
		output = ep.getRating();
		for (int i =0; i < output.size(); i++){
			System.out.println("Paragraph "+i);
			for (int j = 0; j < output.get(i).size(); j++)
				System.out.println(output.get(i).get(j));
	
		}
	}
}
