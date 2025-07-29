package homework.Andrei.Paun.java2Homework;

public class RunAnnalyns {
    public static void main(String[] args) {

    }

    public class RunAnnalynsInfiltration {
        public static void main(String[] args) {
            // Testez metodele în limba română:
            System.out.println(" Poate ataca rapid (cavalerul e treaz): " + AnnalynsInfiltration.canFastAttack(true)); // false
            System.out.println(" Poate spiona (numai arcașul e treaz): " + AnnalynsInfiltration.canSpy(false, true, false)); // true
            System.out.println(" Poate semnaliza prizonierul (arcașul doarme, prizonierul e treaz): " + AnnalynsInfiltration.canSignalPrisoner(false, true)); // true
            System.out.println(" Poate elibera prizonierul (fără câine, cavalerul și arcașul dorm, prizonierul e treaz): " + AnnalynsInfiltration.canFreePrisoner(false, false, true, false)); // true
        }
    }

}
