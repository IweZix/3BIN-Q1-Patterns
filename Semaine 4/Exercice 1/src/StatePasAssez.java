public class StatePasAssez extends State {

    @Override
    public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
        machineACafe.setMontantEnCourst(machineACafe.getMontantEnCourst() + piece.getValeur());
        machineACafe.afficherMontant();

        if (machineACafe.getBoisson().getPrix() > machineACafe.getMontantEnCourst()) {
            machineACafe.afficherPasAssez(machineACafe.getBoisson());
        } else {
            machineACafe.setMontantEnCourst(machineACafe.getMontantEnCourst() - machineACafe.getBoisson().getPrix());
            machineACafe.afficherBoisson(machineACafe.getBoisson());
            machineACafe.setBoisson(null);
            machineACafe.afficherMontant();
            if (machineACafe.getMontantEnCourst() == 0) {
                machineACafe.setState(new StateInactif());
            } else {
                machineACafe.setState(new StateCollecte());
            }
        }
    }

    @Override
    public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
        throw new IllegalStateException();
    }
}
