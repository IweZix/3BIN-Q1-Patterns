Exercice 2 : Implémentation

Objectif : Refactoriser un code pour utiliser un design pattern.

Problématique :

Vous développez un système de création de rapports financiers. Actuellement, le code génère des rapports de manière fixe (en PDF uniquement), ce qui limite son extensibilité.

```
public class ReportGenerator {
    public void generateReport(String data) {
        System.out.println("Generating PDF report with data: " + data);
        // Logic to generate a PDF report
    }
}
```

Tâche :
1.	Refactorisez ce code pour permettre la génération de rapports dans différents formats (par exemple, PDF, HTML, Excel).
2.	Appliquez un design pattern pour rendre ce système extensible sans modifier le ReportGenerator lorsqu’un nouveau format est ajouté.