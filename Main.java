public class Main {
    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();

        list.add('A', 'B');
        list.add('A', 'D');
        list.add('A', 'E');
        list.add('D', 'G');
        list.add('G', 'H');
        list.add('H', 'I');
        list.add('I', 'F');
        list.add('F', 'C');
        list.add('F', 'H');
        list.add('C', 'B');
        list.add('B', 'E');
        list.add('E', 'H');
        list.add('E', 'F');
        System.out.println(list.toString());
    }
}
