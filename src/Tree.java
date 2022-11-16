public class Tree {

    // trees are undirected graphs, so will use an adjacency matrix to represent the tree
    // referencing X then Y
    int tree[][] = {};

    public void addNode(Node node) {
        tree[node.row][node.column] = 3;
    }
}
