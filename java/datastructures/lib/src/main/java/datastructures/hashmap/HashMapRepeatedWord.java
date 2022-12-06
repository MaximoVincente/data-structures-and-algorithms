package datastructures.hashmap;


public class HashMapRepeatedWord {

  public String repeatedWord(String word) {
    HashMap<String, Boolean> hashmap = new HashMap<>(1024);
    String current = "";
    for (int i = 0; i < word.length(); i++) {
      char character = Character.toLowerCase(word.charAt(i));
      if ((character >= 'a' && character <= 'z') || character == '\'')
        current = current + character;
      else if (character == ' ' || i == word.length() - 1) {
        if (hashmap.contains(current))
          return current;
        hashmap.set(current, true);
        current = "";
      }
    }
    return "";
  }
}
