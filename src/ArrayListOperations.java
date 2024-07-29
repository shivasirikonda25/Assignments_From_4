import java.util.*;

public class ArrayListOperations {

    // 1. Find the Duplicate Elements
    public static List<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (Integer num : list) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    // 2. Remove Duplicates
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    // 3. Find the Intersection of Two Lists
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        List<Integer> intersection = new ArrayList<>();
        for (Integer num : list2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    // 4. Find the Union of Two Lists
    public static List<Integer> findUnion(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new LinkedHashSet<>(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    // 5. Reverse an ArrayList
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    // 6. Rotate an ArrayList
    public static List<Integer> rotateList(List<Integer> list, int k) {
        List<Integer> rotated = new ArrayList<>(list);
        int n = list.size();
        Collections.rotate(rotated, k % n);
        return rotated;
    }

    // 7. Sort an ArrayList
    public static List<Integer> sortList(List<Integer> list) {
        List<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        return sorted;
    }

    // 8. Find the Largest and Smallest Elements
    public static int findLargest(List<Integer> list) {
        return Collections.max(list);
    }

    public static int findSmallest(List<Integer> list) {
        return Collections.min(list);
    }

    // 9. Check for Palindrome
    public static boolean isPalindrome(List<Character> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            if (!list.get(i).equals(list.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    // 10. Find the First Non-Repeated Element
    public static Integer findFirstNonRepeated(List<Integer> list) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (Integer num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6, 7));

        System.out.println("Original list: " + list1);
        System.out.println("Duplicates: " + findDuplicates(list1));
        System.out.println("Without duplicates: " + removeDuplicates(list1));
        System.out.println("Intersection: " + findIntersection(list1, list2));
        System.out.println("Union: " + findUnion(list1, list2));
        System.out.println("Reversed list: " + reverseList(list1));
        System.out.println("Rotated list by 2 positions: " + rotateList(list1, 2));
        System.out.println("Sorted list: " + sortList(list1));
        System.out.println("Largest element: " + findLargest(list1));
        System.out.println("Smallest element: " + findSmallest(list1));

        List<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'b', 'a'));
        System.out.println("Is palindrome: " + isPalindrome(charList));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5));
        System.out.println("First non-repeated element: " + findFirstNonRepeated(list3));
    }
}