import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tp7_5.LinkedBinaryTree;
import tp7_5.Position;

public class LinkedBinaryTreeTest {

    @Test
    public void testAddRoot() {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        Position<Integer> root = tree.addRoot(1);
        assertEquals(1, root.getElement());
        assertEquals(1, tree.size());
    }

    @Test
    public void testAddLeft() {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        Position<Integer> root = tree.addRoot(1);
        Position<Integer> leftChild = tree.addLeft(root, 2);
        assertEquals(2, leftChild.getElement());
        assertEquals(2, tree.size());
    }

    @Test
    public void testAddRight() {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        Position<Integer> root = tree.addRoot(1);
        Position<Integer> rightChild = tree.addRight(root, 3);
        assertEquals(3, rightChild.getElement());
        assertEquals(2, tree.size());
    }

    // Agrega más pruebas según sea necesario...
}
