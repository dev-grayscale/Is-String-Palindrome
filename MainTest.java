import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void isPalindromeV1() {
    Assertions.assertTrue(Main.isPalindromeV1("teet"));
    Assertions.assertTrue(Main.isPalindromeV1("aa"));
    Assertions.assertTrue(Main.isPalindromeV1("b"));
    Assertions.assertTrue(Main.isPalindromeV1("aba"));
    Assertions.assertTrue(Main.isPalindromeV1("abba"));
    Assertions.assertTrue(Main.isPalindromeV1("a a"));
    Assertions.assertTrue(Main.isPalindromeV1("a   a"));
    Assertions.assertTrue(Main.isPalindromeV1("Civic"));
    Assertions.assertTrue(Main.isPalindromeV1("Dewed"));
    Assertions.assertTrue(Main.isPalindromeV1("Hannah"));
    Assertions.assertTrue(Main.isPalindromeV1("11122111"));
    Assertions.assertTrue(Main.isPalindromeV1("te et"));
    Assertions.assertTrue(Main.isPalindromeV1("test  tset"));

    Assertions.assertFalse(Main.isPalindromeV1("test  tset!"));
    Assertions.assertFalse(Main.isPalindromeV1("111221131"));
    Assertions.assertFalse(Main.isPalindromeV1("Oozy rat in a sanitary zoo"));
    Assertions.assertFalse(Main.isPalindromeV1("Murder for a jar of red rum"));
    Assertions.assertFalse(Main.isPalindromeV1("Was it a car or a cat I saw"));
    Assertions.assertFalse(Main.isPalindromeV1("Never odd or even"));
    Assertions.assertFalse(Main.isPalindromeV1("Taco cat")); // because of space
    Assertions.assertFalse(Main.isPalindromeV1(""));
    Assertions.assertFalse(Main.isPalindromeV1("    "));
    Assertions.assertFalse(Main.isPalindromeV1(null));
    Assertions.assertFalse(Main.isPalindromeV1("Thanks"));
    Assertions.assertFalse(Main.isPalindromeV1("Another Story"));
    Assertions.assertFalse(Main.isPalindromeV1("Playing right"));
    Assertions.assertFalse(Main.isPalindromeV1("Hard time"));
    Assertions.assertFalse(Main.isPalindromeV1("Oozy rat in a sanitary !zoo"));
  }

  @Test
  void isPalindromeV2() {
    Assertions.assertTrue(Main.isPalindromeV2("teet"));
    Assertions.assertTrue(Main.isPalindromeV1("aa"));
    Assertions.assertTrue(Main.isPalindromeV1("b"));
    Assertions.assertTrue(Main.isPalindromeV1("aba"));
    Assertions.assertTrue(Main.isPalindromeV1("abba"));
    Assertions.assertTrue(Main.isPalindromeV1("a a"));
    Assertions.assertTrue(Main.isPalindromeV1("11122111"));
    Assertions.assertTrue(Main.isPalindromeV1("a   a"));
    Assertions.assertTrue(Main.isPalindromeV2("Civic"));
    Assertions.assertTrue(Main.isPalindromeV2("Dewed"));
    Assertions.assertTrue(Main.isPalindromeV2("Hannah"));
    Assertions.assertTrue(Main.isPalindromeV2("te et"));
    Assertions.assertTrue(Main.isPalindromeV2("test  tset"));

    Assertions.assertFalse(Main.isPalindromeV1("111221131"));
    Assertions.assertFalse(Main.isPalindromeV2("test  tset!"));
    Assertions.assertFalse(Main.isPalindromeV2("Oozy rat in a sanitary zoo"));
    Assertions.assertFalse(Main.isPalindromeV2("Murder for a jar of red rum"));
    Assertions.assertFalse(Main.isPalindromeV2("Was it a car or a cat I saw"));
    Assertions.assertFalse(Main.isPalindromeV2("Never odd or even"));
    Assertions.assertFalse(Main.isPalindromeV2("Taco cat")); // because of space
    Assertions.assertFalse(Main.isPalindromeV2(""));
    Assertions.assertFalse(Main.isPalindromeV2("    "));
    Assertions.assertFalse(Main.isPalindromeV2(null));
    Assertions.assertFalse(Main.isPalindromeV2("Thanks"));
    Assertions.assertFalse(Main.isPalindromeV2("Another Story"));
    Assertions.assertFalse(Main.isPalindromeV2("Playing right"));
    Assertions.assertFalse(Main.isPalindromeV2("Hard time"));
    Assertions.assertFalse(Main.isPalindromeV2("Oozy rat in a sanitary !zoo"));
  }

  @Test
  void isPalindromeV3() {
    Assertions.assertTrue(Main.isPalindromeV3("teet"));
    Assertions.assertTrue(Main.isPalindromeV3("aa"));
    Assertions.assertTrue(Main.isPalindromeV3("b"));
    Assertions.assertTrue(Main.isPalindromeV3("aba"));
    Assertions.assertTrue(Main.isPalindromeV3("abba"));
    Assertions.assertTrue(Main.isPalindromeV3("a a"));
    Assertions.assertTrue(Main.isPalindromeV3("a   a"));
    Assertions.assertTrue(Main.isPalindromeV3("Civic"));
    Assertions.assertTrue(Main.isPalindromeV3("Dewed"));
    Assertions.assertTrue(Main.isPalindromeV3("  De  @#we +_)| d"));
    Assertions.assertTrue(Main.isPalindromeV3("Hannah"));
    Assertions.assertTrue(Main.isPalindromeV3("Taco cat"));
    Assertions.assertTrue(Main.isPalindromeV3("T31Ac$$12509o||C^^^A_)(#913t  "));
    Assertions.assertTrue(Main.isPalindromeV3("Never odd or even"));
    Assertions.assertTrue(Main.isPalindromeV3("Was it a car or a cat I saw"));
    Assertions.assertTrue(Main.isPalindromeV3("Murder for a jar of red rum"));
    Assertions.assertTrue(Main.isPalindromeV3("Oozy rat in a sanitary zoo"));
    Assertions.assertTrue(Main.isPalindromeV3("taco123cat"));
    Assertions.assertTrue(Main.isPalindromeV3("a#@!!)(#*&!(*^!)(^3912605-9127365"));
    Assertions.assertTrue(Main.isPalindromeV3("Oozy rat in a sanitary !zoo"));

    Assertions.assertFalse(Main.isPalindromeV3("#!@^*)%!@*#&)@^%_+_#!@~"));
    Assertions.assertFalse(Main.isPalindromeV3("11122111"));
    Assertions.assertFalse(Main.isPalindromeV3("111221131"));
    Assertions.assertFalse(Main.isPalindromeV3(null));
    Assertions.assertFalse(Main.isPalindromeV3(""));
    Assertions.assertFalse(Main.isPalindromeV3("    "));
    Assertions.assertFalse(Main.isPalindromeV3("Thanks"));
    Assertions.assertFalse(Main.isPalindromeV3("Another Story"));
    Assertions.assertFalse(Main.isPalindromeV3("Playing right"));
    Assertions.assertFalse(Main.isPalindromeV3("Hard time"));
  }
}
