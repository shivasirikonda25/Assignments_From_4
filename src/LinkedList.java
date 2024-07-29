class LinkedList {
 private Node head;

 LinkedList() {
  this.head = null;
 }

 void addToEnd(int value) {
  Node newNode = new Node(value);
  if (head == null) {
   head = newNode;
  } else {
   Node current = head;
   while (current.next != null) {
    current = current.next;
   }
   current.next = newNode;
  }
 }

 void deleteFromBeginning() {
  if (head != null) {
   head = head.next;
  }
 }

 void display() {
  Node current = head;
  while (current != null) {
   System.out.print(current.value + " ");
   current = current.next;
  }
  System.out.println();
 }

 void reverse() {
  Node prev = null;
  Node current = head;
  Node next = null;
  while (current != null) {
   next = current.next;
   current.next = prev;
   prev = current;
   current = next;
  }
  head = prev;
 }

 boolean detectCycle() {
  Node slow = head;
  Node fast = head;
  while (fast != null && fast.next != null) {
   slow = slow.next;
   fast = fast.next.next;
   if (slow == fast) {
    return true;
   }
  }
  return false;
 }

 Node findMiddle() {
  Node slow = head;
  Node fast = head;
  while (fast != null && fast.next != null) {
   slow = slow.next;
   fast = fast.next.next;
  }
  return slow;
 }

 static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
  LinkedList mergedList = new LinkedList();
  Node p1 = l1.head;
  Node p2 = l2.head;
  while (p1 != null && p2 != null) {
   if (p1.value <= p2.value) {
    mergedList.addToEnd(p1.value);
    p1 = p1.next;
   } else {
    mergedList.addToEnd(p2.value);
    p2 = p2.next;
   }
  }
  while (p1 != null) {
   mergedList.addToEnd(p1.value);
   p1 = p1.next;
  }
  while (p2 != null) {
   mergedList.addToEnd(p2.value);
   p2 = p2.next;
  }
  return mergedList;
 }

 void removeDuplicates() {
  Node current = head;
  while (current != null && current.next != null) {
   if (current.value == current.next.value) {
    current.next = current.next.next;
   } else {
    current = current.next;
   }
  }
 }

 Node findNthFromEnd(int n) {
  Node first = head;
  Node second = head;
  for (int i = 0; i < n; i++) {
   if (second == null) return null;
   second = second.next;
  }
  while (second != null) {
   first = first.next;
   second = second.next;
  }
  return first;
 }

 static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
  Node p1 = l1.head;
  Node p2 = l2.head;
  LinkedList result = new LinkedList();
  int carry = 0;
  while (p1 != null || p2 != null) {
   int sum = carry;
   if (p1 != null) {
    sum += p1.value;
    p1 = p1.next;
   }
   if (p2 != null) {
    sum += p2.value;
    p2 = p2.next;
   }
   carry = sum / 10;
   result.addToEnd(sum % 10);
  }
  if (carry > 0) {
   result.addToEnd(carry);
  }
  return result;
 }

 LinkedList[] splitIntoTwoHalves() {
  Node slow = head;
  Node fast = head;
  Node prev = null;
  while (fast != null && fast.next != null) {
   prev = slow;
   slow = slow.next;
   fast = fast.next.next;
  }
  LinkedList firstHalf = new LinkedList();
  firstHalf.head = head;
  LinkedList secondHalf = new LinkedList();
  if (prev != null) {
   prev.next = null;
  }
  secondHalf.head = slow;
  return new LinkedList[]{firstHalf, secondHalf};
 }

 void rotateRight(int k) {
  if (head == null || k == 0) return;
  Node current = head;
  int length = 1;
  while (current.next != null) {
   current = current.next;
   length++;
  }
  current.next = head;
  k = k % length;
  int skip = length - k;
  Node newTail = head;
  for (int i = 0; i < skip - 1; i++) {
   newTail = newTail.next;
  }
  head = newTail.next;
  newTail.next = null;
 }

 public static void main(String[] args) {
  LinkedList list1 = new LinkedList();
  list1.addToEnd(1);
  list1.addToEnd(2);
  list1.addToEnd(3);
  list1.display();

  list1.reverse();
  list1.display();

  list1.addToEnd(4);
  list1.addToEnd(5);
  list1.display();
  System.out.println("Middle: " + list1.findMiddle().value);

  LinkedList list2 = new LinkedList();
  list2.addToEnd(2);
  list2.addToEnd(3);
  list2.addToEnd(6);
  list2.display();

  LinkedList mergedList = mergeTwoSortedLists(list1, list2);
  mergedList.display();

  list1.addToEnd(3);
  list1.addToEnd(3);
  list1.removeDuplicates();
  list1.display();

  System.out.println("Nth from end: " + list1.findNthFromEnd(2).value);

  LinkedList sumList = addTwoNumbers(list1, list2);
  sumList.display();

  LinkedList[] halves = list1.splitIntoTwoHalves();
  halves[0].display();
  halves[1].display();
  list1.rotateRight(2);
  list1.display();
 }
}