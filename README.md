# Lab-24 New and improved PigLatin Converter

Pig Latin is a made-up language sometimes used by children. The rules for converting an English word to Pig Latin will be shown below.
Consider the following incomplete declarations of a PigLatinConverter class that allows a line of text to be  to Pig Latin. The line of text is stored internally as a String. 
# Method Requirements

### a) Complete method `isVowel()`
The method should return `true` if the single string character is a vowel (a, e, i, o, or u).

### b) Complete method `toPig()`
Here are the “more official” rules for converting a word to Pig Latin:

- If the word begins with a consonant, move the consonant to the end of the word and add "ay" after it.
- If the word begins with a vowel, add "yay" to the end of the word.

#### Example:

| English  | Pig Latin |
|----------|-----------|
| dog      | ogday     |
| Apple    | Appleyay  |
| easy     | easyyay   |
| Cattle   | attleCay  |

### c) Write the method `getLineWords()`
The method returns an `ArrayList` of words contained in `line`. You may assume that `line` contains at least one word, there is no punctuation, and the words in `line` are separated by one space.

For example:
- If `line` is the string “What a lovely day”, a call to `getLineWords()` will return the `ArrayList`: `["What", "a", "lovely", "day"]`.

### d) Write the method `pigLatin()`
This method converts all the words in `line` to Pig Latin.

For example:
- If `line` is the string “What a lovely day”, a call to `pigLatin()` will change `line` to the string “hatWay ayay ovelylay ayday”.

In writing `pigLatin()`, you should call the other methods in the class.

---

Source URL: [CrackAP - FRQ Test 3](https://www.crackap.com/ap/computer-science-a/frq-test3.html)

