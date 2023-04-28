/**
 * Palindrome is a sequence of characters that reads the same backward or forward.
 *
 * Note: In the blog write 2 sets of requirements and write solutions for both of them.
 *
 * Challenge #1
 *
 * 1. Characters comparisons are case-insensitive
 * 2. We won't ignore any other characters like !@#%&)_*..
 * 3. Space matters: E.g. "att a" -> is not palindrome but "at ta" is
 *
 * Challenge #2
 * 1. Characters comparisons are case-insensitive
 * 2. We ignore all other characters but [a-zA-Z] - A#@!b  b#@!a is palindrome
 * 3. Space doesn't matter
 * 4. Numbers are also ignored
 */
public class Main {

  /**
   * The first version starts with an initial checks for input not being null or blank.
   *
   * Then reverses the input and checks if it's the same as the original one.
   * If it is -> palindrome, otherwise not.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static boolean isPalindromeV1(String input) {
    if (input == null || input.isBlank()) {
      return false;
    }

    String reversed = new StringBuilder(input).reverse().toString();

    return input.equalsIgnoreCase(reversed);
  }

  /**
   * The second version finds the middle index and start the traversal process from 0th index up to middle one (exclusive)
   * and checks if the character at the current position equals to the character at the opposite position. If only 1 such check fails -> not a palindrome.
   * If all checks pass -> palindrome.
   *
   * <i>The solution is developed for usage with English language only.</i>
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isPalindromeV2(String input) {
    if (input == null || input.isBlank()) {
      return false;
    }

    int mid = input.length() / 2;

    for (int i = 0; i < mid; i++) {
      int oppositeIx = (input.length() - 1) - i;
      if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(oppositeIx))) {
        return false;
      }
    }

    return true;
  }

  /**
   * To satisfy the requirements, we'll initialize two indexes - left (starting from 0th position) and right (starting from length - 1 position).
   * They will be incremented/decremented accordingly to check the l-th character from left and r-th character from right and as long
   * as the characters are the same - we have a palindrome, otherwise not.
   *
   * E.g. if the 1st valid character from the left side is not the same as the 1st valid character from the right side -> not a palindrome, otherwise
   * proceed further by incrementing both indexes to advance to the next set of characters to check, until the left or the right index exceeds the other.
   *
   * We also need to establish if the input is not a sequence of non-letter characters only.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isPalindromeV3(String input) {
    if (input == null || input.isBlank()) {
      return false;
    }

    int left = 0;
    int right = input.length() - 1;
    boolean isValid = false;

    while (left <= right) {

      // advance left index to 1st valid character if the current isn't
      while (left <= right) {
        if (!Character.isLetter(input.charAt(left))) {
          left++;
        } else {
          // If there is at least 1 letter -> valid, otherwise not
          isValid = true;
          break;
        }
      }

      // decrease right index to 1st valid character if the current isn't
      while (right >= left && !Character.isLetter(input.charAt(right))) {
        right--;
      }

      // If not equals -> terminate
      if (left < right && Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
        return false;
      }

      left++;
      right--;
    }

    return isValid;
  }
}
