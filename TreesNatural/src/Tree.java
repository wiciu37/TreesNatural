public class Tree {

    private String name;
    private double trunk;
    //private int leaves;
    private int branches;

    public Tree(String name, double trunk, int branches) {
        this.name = name;
        this.trunk = trunk;
        this.branches = branches;
    }

    //method that grows leaves and trunk
    public static void grow(Tree tree)
    {
        double currentTrunk = tree.getTrunk();
        tree.setTrunk(currentTrunk + 0.01);


        int currentBranches = tree.getBranches();
        tree.setBranches(currentBranches + 5);
    }

    //makes oxygen
    public void photosynthesize()
    {
        //....
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTrunk() {
        return trunk;
    }

    public void setTrunk(double trunk) {
        this.trunk = trunk;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", trunk=" + trunk +
                ", branches=" + branches +
                '}';
    }
}
