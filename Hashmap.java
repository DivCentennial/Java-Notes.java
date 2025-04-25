🔹 What is a HashMap?
A HashMap is part of Java’s java.util package. It stores key-value pairs and allows fast access, insertion, and deletion based on the key.

✅ Key Features:
Keys are unique

Values can be duplicated

No guaranteed order (use LinkedHashMap if you want order)

Allows one null key and multiple null values

Backed by a hash table

🔹 Creating a HashMap
java
Copy
Edit
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
🔹 Basic Operations
java
Copy
Edit
map.put(1, "Apple");       // Add key-value pair
map.put(2, "Banana");
map.put(3, "Cherry");

String value = map.get(2); // Returns "Banana"

map.remove(3);             // Removes key 3
map.containsKey(1);        // true
map.containsValue("Apple");// true
🔹 Iterating Over a HashMap
java
Copy
Edit
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}
🔹 Time Complexity (Average Case)

Operation	Time Complexity
put(key, val)	O(1)
get(key)	O(1)
remove(key)	O(1)
containsKey()	O(1)
Worst case is O(n) — rare, only when many keys collide (bad hash function).

🔹 Example Use Case
java
Copy
Edit
HashMap<String, Integer> wordCount = new HashMap<>();

String[] words = {"apple", "banana", "apple", "orange"};

for (String word : words) {
    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}

System.out.println(wordCount); // {orange=1, banana=1, apple=2}
🔹 When to Use HashMap
You want to associate keys with values

You need fast lookup by key

You don’t care about ordering