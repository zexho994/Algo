package struct.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors;
    public Node(int v, ArrayList<Node> neighbors){
        this.val = v;
        this.neighbors = neighbors;
    }
}
