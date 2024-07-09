package algorithms;

import com.google.common.collect.ImmutableList;
import org.example.algorithms.DoublyLinkedList;
import org.example.algorithms.DoublyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    void testDLLAddition(){

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        DoublyLinkedListNode<Integer> node1 = linkedList.addElementToLast(1);
        DoublyLinkedListNode<Integer> node2 = linkedList.addElementToLast(2);
        DoublyLinkedListNode<Integer> node3 = linkedList.addElementToLast(3);
        DoublyLinkedListNode<Integer> node4 = linkedList.addElementToLast(4);
        DoublyLinkedListNode<Integer> node5 = linkedList.addElementToLast(5);
        verifyDLL(linkedList, ImmutableList.of(1,2,3,4,5));
    }

    @Test
    void testDeletion() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        DoublyLinkedListNode<Integer> node1 = dll.addElementToLast(1);
        DoublyLinkedListNode<Integer> node2 = dll.addElementToLast(2);
        DoublyLinkedListNode<Integer> node3 = dll.addElementToLast(3);
        DoublyLinkedListNode<Integer> node4 = dll.addElementToLast(4);

        verifyDLL(dll, ImmutableList.of(1, 2, 3, 4));
        dll.detachNode(node1);

        verifyDLL(dll, ImmutableList.of(2, 3, 4));
        dll.detachNode(node2);

        verifyDLL(dll, ImmutableList.of(3, 4));
        dll.detachNode(node3);
        verifyDLL(dll, ImmutableList.of(4));
        dll.detachNode(node4);
        assertFalse(dll.isItemPresent());
    }

    void verifyDLL(DoublyLinkedList<Integer> dll, ImmutableList<Integer> immutableList){
        assertEquals(dll.getLastNode().element, immutableList.get(immutableList.size() - 1));
        assertEquals(dll.getFirstNode().element, immutableList.get(0));

        DoublyLinkedListNode<Integer> node = dll.getFirstNode();
        for (Integer element : immutableList){
            assertNotNull(node);
            assertEquals(node.element, element);
            node = node.next;
        }
        assertNull(node);
    }
}
