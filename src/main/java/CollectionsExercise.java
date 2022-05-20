import java.util.*;

public class CollectionsExercise {

  void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
    numbers.add(i);
  }

  void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
   // numbers.add(0, i);
    numbers.addFirst(i);
  }

  void removeItemFromTopOfStack(Deque<Integer> stack) {
   // stack.removeFirst();
    stack.pop();
  }

  void removeItemFromFrontOfQueue(Queue<Integer> queue) {
   // queue.remove();
    queue.poll();
  }

  void addItemToTreeSet(Set<String> set, String item) {
    set.add(item);
  }

}
