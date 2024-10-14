public abstract class State {

    public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
        machineACafe.setMontantEnCourst(machineACafe.getMontantEnCourst() + piece.getValeur());
        machineACafe.afficherMontant();

        machineACafe.setState(new StateCollecte());
    }

    public abstract void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson);

    public void rendreMonnaie(MachineACafe machineACafe) {
        machineACafe.afficherRetour();
        machineACafe.setMontantEnCourst(0);
        machineACafe.setBoisson(null);
        machineACafe.setState(new StateInactif());
    }
}
