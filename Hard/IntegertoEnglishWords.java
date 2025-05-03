//Leetcode 273 : Integer to English Words
//Topic : Math, String, Recursion
package Hard;
class IntegertoEnglishWords {
    private final String[] LESS_THAN_20 = {
    "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
};
private final String[] TENS = {
    "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
};
private final String[] THOUSANDS = {
    "", "Thousand", "Million", "Billion"
};
public String numberToWords(int num) {
    // If the number is zero, return "Zero" immediately
    if (num == 0) return "Zero";

    int i = 0; // Counter to track the position of thousands (1 for Thousand, 2 for Million, etc.)
    String words = ""; // Variable to store the final word representation of the number
    
    // Process each group of three digits (hundreds, thousands, millions, etc.)
    while (num > 0) {
        // If the current three-digit group is not zero, convert it to words
        if (num % 1000 != 0) {
            words = helper(num % 1000) + THOUSANDS[i] + " " + words;
        }
        num /= 1000; // Move to the next group of three digits
        i++; // Increment thousand counter
    }
    return words.trim(); // Remove any leading/trailing spaces and return the final result
}
// Helper function to convert a three-digit number to words
private String helper(int num) {
    // Base case: If the number is zero, return an empty string
    if (num == 0) return "";
    // If number is less than 20, return corresponding word from LESS_THAN_20 array
    else if (num < 20) return LESS_THAN_20[num] + " ";
    // If number is between 20 and 99, get the tens place word and recurse for the ones place
    else if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
    // If number is 100 or greater, get the hundreds place word and recurse for the remainder
    else return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
}
}
