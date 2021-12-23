package chapter6acloserlookatmethodsandclasses;

// Object can be passed to methods.
class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defines same block
    boolean sameBlock(Block ob) { // use object type for parameter.
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Return true if ob has same volume.
    boolean sameVolume(Block ob) { // use object type for parameter.
        if (ob.volume == volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2)); // Pass an object.
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3)); // Pass an object.
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3)); // Pass an object.
    }
}
