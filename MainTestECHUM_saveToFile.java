

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;




/**
 * Example of how to run the EFIM algorithm from the source code, and save the result to an output file.

 */
public class MainTestECHUM_saveToFile {

	public static void main(String [] arg) throws IOException{

	
		String input="/home/aman/Desktop/retail";

		String output = ".//output1.txt";
		
		// the minutil threshold
		double minutil = 0.0001; 
		
		double minCor=0.1;

		// Run the  algorithm
		AlgoECHUM algo = new AlgoECHUM();
		algo.runAlgorithm(minutil, minCor, input, output, true, Integer.MAX_VALUE, true );
		// Print statistics
		algo.printStats();

		
		// if true in next line it will find only closed itemsets, otherwise, all frequent itemsets
		//===================
//		Itemsets itemsets = algo.runAlgorithm(minutil,  input, null, activateMerging, maximumNumberOfTransactions, activateSubTreeUtilityPruning);
//		//==========================
//		itemsets.printItemsets();
	}
	
	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestEFIM_saveToFile.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
