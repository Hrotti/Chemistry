import java.util.Arrays;

/**
 * Created by Alex on 3/16/2019.
 */
public class Atom {
    public enum STATE {Solid, Liquid, Gas, Plasma}
    public enum ELEMENTAL_GROUP {Noble_Gas,Nonmetal,Metaloid,Transition_Metal,Lanthanoid,Actinoid,Alkaline_Earth_Metal,Alkali_Metal,PostTransition_Metal,None}
    public static final Integer[] ELECTRON_SHELL = {2,8,18,32,50,72,98}; // 2(n^2)
    public static final String[] SHELL_LETTER = {"K","L","M","N","O","P"};
    private static final int[][] FILL_ORDERING = {{1,2},{2,8},{3,8},{4,2},{3,10},{4,6}
    ,{5,2},{4,10},{5,6},{6,2},{4,14},{5,10},{6,6},{7,2},{5,14},{6,10},{7,6}};
    private static final int[] nonMetal = {1,6,7,8,9,15,16,17,34,35,53};
    private static final int[] transitionMetal = {21,22,23,24,25,26,27,28,29,30,39,40,41,42,43,44,45,46,47,48,72,73,74,75,76,77,78,79,90,104,105,106,107,108,112};
    private static final int[] alkaliMetals = {3,11,19,37,55,87};
    private static final int[] alkalineEarthMetals = {4,12,20,29,56,88};
    private static final int[] lanthanoids = {57,58,59,60,61,62,63,64,65,66,67,68,69,70,71};
    private static final int[] actinoids = {89,90,91,92,93,94,95,96,97,98,99,100,101,102,103};
    private static final int[] postTransitionMetals = {13,31,49,50,81,82,83,84,114};
    private static final int[] NobleGases = {2,10,18,36,54,86};
    private static final int[] metaloids = {5,14,32,33,51,52,85};
    public static final int MAX_ELECTRONS = 118;
    /* fill order of electron shells
    1 full at 1
    2 full at 2
    3 full at 5
    4 full at 11
    5 full at 15
     */

    private int protons;
    private int neutrons;
    private int electrons;
    private int charge;
    private int weight;
    private int[] shells = new int[ELECTRON_SHELL.length];
    private int shellsFilled = 0;
    private ELEMENTAL_GROUP group;

    public Atom (int electrons, int protons, int neutrons){
        this.electrons = electrons;
        this.protons = protons;
        this.neutrons = neutrons;
        fillShell();
        calculateCharge();
        calculateWeight();
        calculateFullShells();
        calculateGroup();
    }

    //region Calculators
    private void calculateCharge () {
        charge = protons - electrons;
    }

    private void calculateWeight () {
        weight = neutrons + protons;
    }

    private void calculateFullShells () {
        for (int i = 0; i < shells.length; i++) {
            if (shells[i] == ELECTRON_SHELL[i]) {
                shellsFilled++;
            }
        }
    }

    private void calculateGroup () {
        boolean found = false;
        for (int i = 0; i < nonMetal.length && !found; i++) {
            if (nonMetal[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Nonmetal;
            }
        }
        for (int i = 0; i < NobleGases.length && !found; i++) {
            if (NobleGases[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Noble_Gas;
            }
        }
        for (int i = 0; i < metaloids.length && !found; i++) {
            if (metaloids[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Metaloid;
            }
        }
        for (int i = 0; i < postTransitionMetals.length && !found; i++) {
            if (postTransitionMetals[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.PostTransition_Metal;
            }
        }
        for (int i = 0; i < transitionMetal.length && !found; i++) {
            if (transitionMetal[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Transition_Metal;
            }
        }
        for (int i = 0; i < lanthanoids.length && !found; i++) {
            if (lanthanoids[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Lanthanoid;
            }
        }
        for (int i = 0; i < actinoids.length && !found; i++) {
            if (actinoids[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Actinoid;
            }
        }
        for (int i = 0; i < alkaliMetals.length && !found; i++) {
            if (alkaliMetals[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Alkali_Metal;
            }
        }
        for (int i = 0; i < alkalineEarthMetals.length && !found; i++) {
            if (alkalineEarthMetals[i] == protons){
                found = true;
                group = ELEMENTAL_GROUP.Alkaline_Earth_Metal;
            }
        }
        if (!found) {
            group = ELEMENTAL_GROUP.None;
        }
    }
    //endregion

    private void fillShell () {
        shells = new int[ELECTRON_SHELL.length];
        int tracker = electrons;
        for (int j = 0; j < FILL_ORDERING.length && tracker > 0; j++) {
            for (int i = 0; i < FILL_ORDERING[j][1] && tracker > 0; i++) {
                shells[FILL_ORDERING[j][0]-1]++;
                tracker--;
            }
        }
    }

    //region Getters and Setters
    private void setElectrons (int tElectrons) {
        tElectrons = Math.min(MAX_ELECTRONS,tElectrons);
        electrons = tElectrons;
    }
    private void setProtons(int tProtons) {
        protons = tProtons;
    }

    private void setNeutrons(int tNeutrons) {
        neutrons = tNeutrons;
    }
    public int[] getShells () {
        return Arrays.copyOf(shells,shells.length);
    }

    public int getWeight() {
        return weight;
    }

    public int getCharge() {
        return charge;
    }

    public int getProtons () {
        return protons;
    }

    public int getNeutrons () {
        return neutrons;
    }

    public int getElectrons() {
        return electrons;
    }

    public int getShellsFilled() {
        return shellsFilled;
    }
    public ELEMENTAL_GROUP getElementalGroup() {
        return group;
    }
    //endregion

    public Atom clone () {
        return new Atom(electrons,protons,neutrons);
    }

    public String toString () {
        return (new StringBuilder(30))
                .append(String.format("%-19s %s","Element Group: ",group.toString().replaceAll("_"," ")))
                .append(String.format("%-20s %s","\nProtons: ",protons))
                .append(String.format("%-20s %s","\nElectrons: ",electrons))
                .append(String.format("%-20s %s","\nNeutrons: ",neutrons))
                .append(String.format("%-20s %s","\nWeight: ",weight))
                .append(String.format("%-20s %s","\nElectron Shells: ","1:" + shells[0] + ", " + "2:" + shells[1] + ", " +
                        "3:" + shells[2] + ", " + "4:" + shells[3] + ", " + "5:" + shells[4] + ", " + "6:" +
                        shells[5] + ", " + "7:" + shells[6])).toString();
    }

}
