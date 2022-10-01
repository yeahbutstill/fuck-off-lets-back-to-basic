package data.structuresandalgorithms.deepdive.using.java.tree.challenge1;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(27);
        intTree.insert(15);
        intTree.insert(14);
        intTree.insert(22);
        intTree.insert(17);
        intTree.insert(16);
        intTree.insert(26);
        intTree.insert(30);
        intTree.insert(32);
        intTree.insert(29);
        intTree.insert(28);

        intTree.traverseInOrder();
        System.out.println();

        intTree.traversePreOrder();
        System.out.println();

//
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

    }
}
