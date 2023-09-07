public class Job1 extends banq {
    private int soldee;

    public Job1(int soldec, int soldee, int inte) {
        super(soldec, soldee, inte);
        Courant(soldec);
        Epargne(soldee);
        Addinte(inte);
    }

    public void Courant(int soldec) {
        super.setSolde(soldec);
        getsolde();
        System.out.println(getsolde());
    }
    public void Epargne(int soldee) {
        super.setSolde(soldee);
        this.soldee = soldee;
        getsolde();
        System.out.print(getsolde());
    }

    public void Addinte(int inte) {
        float i = (inte * soldee) / 100.0f; // Calcule les intérêts en pourcentage du solde
        float a = soldee + i; // Ajoute les intérêts au solde
        System.out.println(a);
    }





    public static void main(String[] args) {
        Job1 b = new Job1(100, 200, 2);
    }
}
