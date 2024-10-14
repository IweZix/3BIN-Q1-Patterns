public class StateCollecte extends State {

    @Override
    public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
        if (toucheBoisson.getPrix() > machineACafe.getMontantEnCourst()) {
            machineACafe.setBoisson(toucheBoisson);
            machineACafe.afficherPasAssez(toucheBoisson);
            machineACafe.setBoisson(toucheBoisson);
            machineACafe.setState(new StatePasAssez());
            return;
        }

        machineACafe.setMontantEnCourst(machineACafe.getMontantEnCourst() - toucheBoisson.getPrix());
        machineACafe.afficherBoisson(toucheBoisson);
        machineACafe.afficherMontant();
        if (machineACafe.getMontantEnCourst() == 0) {
            machineACafe.setState(new StateInactif());
        } else {
            machineACafe.setState(new StateCollecte());
        }
    }
}
