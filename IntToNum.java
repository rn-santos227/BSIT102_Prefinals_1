public class IntToNum {

    public static void main (String args[])
    {
    	int num = new java.util.Scanner(System.in).nextInt();
    	//Get the ones
    	int ones = num%10; 
    	//Get the tenths
    	int tenths = (num %100)/ 10;
    	//Get the hundredths
    	int hundredths = (num %1000)/ 100;
    	//Get the thousandths
    	int thousandths = (num %10000)/ 1000;
    	//Check first if tenths is not equal to zero
    	String final_word = tenths != 0 ? hun_and_thou_words(thousandths, "Thousand") + hun_and_thou_words(hundredths, "Hundred " + tenths_words(tenths, ones)) : ones_word(ones);
    	//PRINT
    	System.out.print(final_word);
    }
    
    static String tenths_words(int tenths, int ones)
    {
    	//This function is used to convert tenths and ones to words by first checking if tenths is one or not.
    	String words = "";
    	switch(tenths)
    	{
    		case 1:
    			switch(ones)
		    	{
		    		case 1:
		    			words += "Eleven";
		    			break;
		    		case 2:
		    			words += "Twelve";
		    			break;
		    		case 3:
		    			words += "Thirteen";
		    			break;
		    		case 4:
		    			words += "Fourteen";
		    			break;
		    		case 5:
		    			words += "Fifteen";
		    			break;
		    		case 6:
		    			words += "Sixteen";
		    			break;
		    		case 7:
		    			words += "Seventeen";
		    			break;
		    		case 8:
		    			words += "Eighteen";
		    			break;
		    		case 9:
		    			words += "Nineteen";
		    			break;
		    	}
    			break;
    		case 2:
    			words += "Twenty " + ones_word(ones);
    			break;
    		case 3:
    			words += "Thirty " + ones_word(ones);
    			break;
    		case 4:
    			words += "Fourty " + ones_word(ones);
    			break;
    		case 5:
    			words += "Fifty " + ones_word(ones);
    			break;
    		case 6:
    			words += "Sixty " + ones_word(ones);
    			break;
    		case 7:
    			words += "Seventy " + ones_word(ones);
    			break;
    		case 8:
    			words += "Eighty " + ones_word(ones);
    			break;
    		case 9:
    			words += "Ninety " + ones_word(ones);
    			break;
    	}
    	return words;
    }
    
    static String ones_word(int ones)
    {
    	//This is used to convert ones to words
    	String words= "";
    	switch(ones)
    	{
    		case 1:
    			words += " One";
    			break;
    		case 2:
    			words += " Two";
    			break;
    		case 3:
    			words += " Three";
    			break;
    		case 4:
    			words += " Four";
    			break;
    		case 5:
    			words += " Five";
    			break;
    		case 6:
    			words += " Six";
    			break;
    		case 7:
    			words += " Seven";
    			break;
    		case 8:
    			words += " Eight";
    			break;
    		case 9:
    			words += " Nine";
    			break;
    	}
    	return words;
    }
    
    static String hun_and_thou_words(int num, String wordie)
    {
    	//This is used to convert a hundredths and thousandths to words. 
    	String words = "";
    	switch(num)
    	{
    		case 1:
    			words += "One " + wordie;
    			break;
    		case 2:
    			words += "Two " + wordie;
    			break;
    		case 3:
    			words += "Three " + wordie;
    			break;
    		case 4:
    			words += "Four " + wordie;
    			break;
    		case 5:
    			words += "Five " + wordie;
    			break;
    		case 6:
    			words += "Six " + wordie;
    			break;
    		case 7:
    			words += "Seven " + wordie;
    			break;
    		case 8:
    			words += "Eight " + wordie;
    			break;
    		case 9:
    			words += "Nine " + wordie;
    			break;
    	}
    	return words;
    }
}