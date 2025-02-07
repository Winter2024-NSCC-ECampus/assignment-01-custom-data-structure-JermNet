public class Main {
    public static void main(String[] args) {
        MyDataStructure myDataStructure = new MyDataStructure();


        myDataStructure.append(12);
        myDataStructure.append(13);
        myDataStructure.append(14);
        myDataStructure.append(15);
        myDataStructure.prepend(16);

        System.out.println(myDataStructure.size());
        myDataStructure.pop();

        System.out.println(myDataStructure.size());
        System.out.println(myDataStructure.head().data);
        System.out.println(myDataStructure.tail().data);
        System.out.println(myDataStructure.at(0).data);
        System.out.println(myDataStructure.contains(13));
        System.out.println(myDataStructure.contains(25));
        System.out.println(myDataStructure.ind(12));
    }
}