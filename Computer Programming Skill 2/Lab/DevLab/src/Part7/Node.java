package Part7;

public class Node {

    private int info;
    private Node link;

    public Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }

    public Node(int info) {
        this(info, null);
    }

    public Node() {
        this(0, null);
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getLink() {
        return link;
    }

    public int getInfo() {
        return info;
    }
}
