public class PigLatinConverter{

    private String line;


  /** Constructor for line - Precondition :
  * - sentence contains at least one word.
  * - words are separated by exactly one space.
  * - there is no punctuation in sentence.
  */ 
  public PigLatinConverter(String sentence){
      line = sentence;
  }

  /**Precondition:  ch a single-character string.
  * returns true if ch is a vowel (a, e, i, o, u), false otherwise.
  */

  private boolean isVowel(String ch)
  {


  }


  /**Returns the Pig Latin form of word, as described in the instructions.  
  *  Precondition:  word is not null and may begin with a vowel or consonant.
  */

  public String toPig(String word){


  }


  /**Returns a list of words in a line.
  *Precondition:  
  *line contains at least one word.
  * - words are separated by exactly one space.
  * - there is no punctuation in line.
  Postcondition:  line is unchanged.
  */

  private ArrayList<String> getLineWords()
  {

  }

/**Converts line to Pig Latin , with Pig Latin words separated by one space.  
  *Precondition :
  * - line contains at least one word.
  * - words are separated by exactly one space.
  * - there is no punctuation in line.
  */


  public void pigLatin()
  {

  }

  /** toString() method –
  *Postcondition: returns the line object as a string
  */ 

  public String toString(){
    return line;
  }


}