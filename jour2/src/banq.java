public class banq{
    private int solde;

    public banq(int solde, int soldee, int inte) {
        this.solde = solde;
    }

    public int getsolde(){
        return solde;
    }

    public void Deposer(int somme){
        solde = somme + solde;
        System.out.print(somme + "$ a été déposer votre solde et de " + solde + "$\n");
    }

    public void Retrait(int somme){
        if(somme < solde){
            solde = solde - somme;
            System.out.print(somme + "$ a été retirer votre solde et de " + solde + "$\n");
        }
        else {
            System.out.print("tentative de retrait de " + somme + "$ solde insuffisant" + "\n");
        }

    }

    public void setSolde(int soldec) {
        solde = soldec;

    }
}
