import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tree> treeList = new ArrayList<>();
        Tree tree1 = new Tree("d", 1.0, 20);
        treeList.add(tree1);

        Tree lisc1 = new DeciduousTree("dab",2.0, 1000, 30);
        treeList.add(lisc1);
        DeciduousTree lisc2 = new DeciduousTree("dab",10.0, 5000, 100);
        treeList.add(lisc2);

        Tree conifer1 = new Conifer("sosna", 5.0, 300);
        treeList.add(conifer1);
        Conifer conifer2 = new Conifer("iglak", 2.5, 250);
        treeList.add(conifer2);

        for(Tree t : treeList)
        {
            System.out.println(t);
        }

        Tree.grow(tree1);


        Tree.grow(lisc1);
        DeciduousTree.grow(lisc2);
        DeciduousTree.growLeaves((DeciduousTree) lisc1);
        DeciduousTree.dropLeaves(lisc2);

        Tree.grow(conifer1);
        Conifer.grow(conifer2);


        System.out.println("----------------");
        for(Tree t : treeList)
        {
            System.out.println(t);
        }



    }
}
