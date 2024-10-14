public class StateInactif extends State {

    @Override
    public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
        machineACafe.afficherPasAssez(toucheBoisson);
    }

    @Override
    public void rendreMonnaie(MachineACafe machineACafe) {
        machineACafe.setState(new StateInactif());
    }
}
