Exercice 2 : Implémentation

Objectif : Implémenter un design pattern pour améliorer un code existant.

Problématique

Vous développez une application de gestion d’une bibliothèque. Chaque livre peut être trié selon différents critères (par titre, par auteur, par année, etc.). Voici le code actuel :

```
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void sortBooks(String criterion) {
        if (criterion.equals("title")) {
            books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        } else if (criterion.equals("author")) {
            books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
        } else if (criterion.equals("year")) {
            books.sort((b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
        }
    }
}
```

Tâche
1.	Refactorisez ce code pour supprimer les conditions (if/else) dans la méthode sortBooks.
2.	Appliquez un design pattern pour permettre de gérer dynamiquement les différents critères de tri.
3.	Expliquez quel pattern vous avez choisi et pourquoi.