/*
```python
# Let's solve the problem seen in page 124 viewport screenshot.
# Code snippet inside the screenshot:
# public int fruitFrequency(string input1)
# {
#     //Read only region start
#     //Write code here
#     ...
# }
# Let's find the exact text or write a python script to emulate and verify the problem.
# Wait, let's look at the text on the viewport:
# "You are given a string S containing fruits, where each character represents a fruit type. Your task is to find and return an integer value representing the largest absolute difference between the count of the fruit with the maximum odd frequency and the count of the fruit with the minimum even frequency."
# "Note: Fruits contain at least one character with an odd frequency and one with an even frequency."
# "Input Specification: input1: A string S, representing different types of fruits."
# "Output Specification: Return an integer representing the absolute difference between the count of the fruit with the maximum odd frequency and the count of the fruit with the minimum even frequency."
# "Example 1: input1: aartfu"

from collections import Counter

def solve(s):
    counts = Counter(s)
    odd_freqs = [count for count in counts.values() if count % 2 != 0]
    even_freqs = [count for count in counts.values() if count % 2 == 0]
    
    max_odd = max(odd_freqs) if odd_freqs else 0
    min_even = min(even_freqs) if even_freqs else 0
    
    return abs(max_odd - min_even)

print("Example 1 ('aartfu'):", solve("aartfu"))
# Let's check counts for 'aartfu':
# a: 2 (even)
# r: 1 (odd)
# t: 1 (odd)
# f: 1 (odd)
# u: 1 (odd)
# Odd frequencies: [1, 1, 1, 1] -> max = 1
# Even frequencies: [2] -> min = 2
# abs(1 - 2) = 1


```

```text
Example 1 ('aartfu'): 1


```

**Question**

You are given a string $S$ containing fruits, where each character represents a fruit type. Your task is to find and return an integer value representing the absolute difference between the count of the fruit with the maximum odd frequency and the count of the fruit with the minimum even frequency.

*Note:* Fruits contain at least one character with an odd frequency and one with an even frequency.

**Input Specification:**

* `input1`: A string $S$, representing different types of fruits.

**Output Specification:**

* Return an integer representing the absolute difference between the count of the fruit with the maximum odd frequency and the count of the fruit with the minimum even frequency.

**Example 1:**

* **input1:** `aartfu`
* **Output:** `1` *(Frequencies: 'a'=2 (even), 'r'=1 (odd), 't'=1 (odd), 'f'=1 (odd), 'u'=1 (odd). Max odd = 1, Min even = 2; $\vert{}1 - 2\vert{} = 1$)*
*/


import java.util.HashMap;
import java.util.Map;

public class UserMainCode {
    public int fruitFrequency(String input1) {
        // Read only region start
        if (input1 == null || input1.isEmpty()) {
            return 0;
        }

        // Count frequencies of each character/fruit type
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Find max odd frequency and min even frequency
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                if (count > maxOdd) {
                    maxOdd = count;
                }
            } else {
                if (count < minEven) {
                    minEven = count;
                }
            }
        }

        // Return absolute difference
        return Math.abs(maxOdd - minEven);
        // Read only region end
    }
}