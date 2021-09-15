public class DeciduousTree extends Tree {

    private int leaves;

    public DeciduousTree(String name, double trunk, int branches, int leaves) {
        super(name, trunk, branches);
        this.leaves = leaves;
    }

    //method that drops leaves
    public static void dropLeaves(DeciduousTree deciduousTree)
    {
        deciduousTree.setLeaves( 0 );
    }

    //method that grows leaves, after winter, if there are no leaves
    public static void growLeaves(DeciduousTree deciduousTree)
    {
        if(deciduousTree.getLeaves() == 0)
            deciduousTree.setLeaves(1000);
    }


    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }


    @Override
    public String toString() {
        return "DeciduousTree{" +
                "name='" + this.getName() + '\'' +
                ", trunk=" + this.getTrunk() +
                ", branches=" + this.getBranches() +
                ", leaves=" + this.getLeaves() +
                '}';
    }
}
