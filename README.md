# MGL801 – BiblioMTL : des exigences au code

Ce dépôt accompagne la séance sur les LLM en ingénierie des exigences. BiblioMTL est le système de prêt fictif d'une bibliothèque municipale.

## 1. Ouvrir le projet (2 minutes)

1. Sur la page GitHub de votre dépôt, cliquez sur le bouton vert **Code**, puis sur l'onglet **Codespaces**, puis sur **Create codespace on main**.
2. Attendez que l'environnement se prépare (la première fois, 2 à 3 minutes). Java, Maven et JUnit sont déjà installés.
3. Rien d'autre à installer.

## 2. Lancer les tests

- **Avec la souris :** ouvrez l'icône en forme de fiole (Testing) dans la barre de gauche, puis cliquez sur le triangle ▶ en haut. Chaque test s'affiche en vert (réussi) ou en rouge (échec).
- **Au terminal :** tapez `mvn test`.

## 3. L'exemple du cours : les amendes (US-7)

- `src/main/java/.../Amendes.java` : le code généré par un LLM (version 1).
- `src/test/java/.../AmendesTest.java` : un test par scénario d'acceptation.

Lancez `AmendesTest` : un scénario échoue. Relisez US-7 et trouvez pourquoi.

## 4. Exercice 2 : les réservations (US-9), 40 minutes

| Durée | Étape | Fichier |
| --- | --- | --- |
| 10 min | Écrire au moins 5 scénarios d'acceptation, **sans LLM** | `SCENARIOS.md` |
| 10 min | Traduire vos scénarios en tests JUnit (le LLM peut aider ; relisez chaque test) | `ReservationsTest.java` |
| 5 min | Générer le code avec un prompt qui contient **US-9 et les signatures seulement**, pas vos scénarios ; coller le code dans `Reservations.java` | `Reservations.java` |
| 10 min | Lancer les tests. Pour chaque échec : erreur du code ou trou dans l'exigence ? | – |
| 5 min | Écrire les questions à poser à la responsable du prêt | `SCENARIOS.md` |

Notez vos prompts et la réponse du LLM dans `PROMPTS.md`.

## Règles

- N'utilisez que l'outil d'IA indiqué par l'enseignante.
- Ne saisissez aucun renseignement personnel (nom, matricule, courriel) dans l'outil d'IA.
- Ne modifiez pas les signatures des méthodes de `Reservations.java` : vos tests en dépendent.
