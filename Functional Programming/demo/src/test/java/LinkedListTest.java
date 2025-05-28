import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {

    @Test
    void whenInitializingListFromCollection_ShouldReturnCollectionsElements() {
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        Object[] linkedListElements = linkedList.toArray();
        Object[] collectionElements = arrayList.toArray();

        List<Integer> list = arrayList.stream().toList();
        List<Integer> list2 = linkedList.stream().toList();

        Assertions.assertArrayEquals(linkedListElements, collectionElements);
    }

    @Test
    void whenAddingElementsInLinkedListAtSpecificPosition_ShouldReturnElementsInProperSequence() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("ONE");
        linkedList.addLast("THREE");
        linkedList.add("FOUR"); //Adds an element at the end of a list
        linkedList.add(1, "TWO"); // 	Adds an element at index position i of a list

        List<String> linkedListElements = linkedList.stream().toList();
        List<String> expectedElements = List.of("ONE", "TWO", "THREE", "FOUR");

        Assertions.assertEquals(linkedListElements, expectedElements);
    }

    @Test
    void shouldPeekWithoutRemoving() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("ONE");

        String firstPeek = queue.peek();

        Assertions.assertEquals("ONE", firstPeek);
        Assertions.assertEquals(1, queue.size());
    }

    @Test
    void shouldHandleMixedOperationsCorrectly() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.poll();
        queue.offer("C");

        String firstPeek = queue.peek();

        Assertions.assertEquals("B", firstPeek);
    }
}
