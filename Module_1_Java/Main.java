import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant();
        etudiant1.nom = "Alice";
        etudiant1.age = 20;
        etudiant1.numeroEtudiant = "E12345";
        etudiant1.moyenne = 15.5f;
        etudiant1.filiere = "Informatique";
        etudiant1.coursSuivis = new ArrayList<String>();
        etudiant1.coursSuivis.add("Programmation");
        etudiant1.coursSuivis.add("Algorithmes");

        Cours cours1 = new Cours();
        cours1.Nom = "Programmation";
        cours1.Professeur = "M. Dupont";

        System.out.println("Etudiant: " + etudiant1.nom);
        System.out.println("Age: " + etudiant1.age);
        System.out.println("Numero Etudiant: " + etudiant1.numeroEtudiant);
        System.out.println("Moyenne: " + etudiant1.moyenne);
        System.out.println("Filiere: " + etudiant1.filiere);
        System.out.println("Cours Suivis: " + etudiant1.coursSuivis);
    }
}