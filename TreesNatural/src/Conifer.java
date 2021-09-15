public class Conifer extends Tree {

    private String name;
    private double trunk;
    private int branches;

    public Conifer(String name, double trunk, int branches) {
        super(name, trunk, branches);
    }


    @Override
    public String toString() {
        return "Conifer{" +
                "name='" + this.getName() + '\'' +
                ", trunk=" + this.getTrunk() +
                ", branches=" + this.getBranches() +
                '}';
    }
}
