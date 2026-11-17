package ca.ets.mgl801.bibliomtl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Exercice 2, étape 2 : un test par scénario écrit dans SCENARIOS.md.
 *
 * Le premier test est un modèle. Il échoue tant que le code n'est pas généré
 * (étape 3) : c'est normal.
 */
class ReservationsTest {

    @Test
    @DisplayName("Modèle : le premier arrivé est avisé en premier")
    void premierArrivePremierServi() {
        // Étant donné que Alice puis Bruno réservent le document D1
        Reservations r = new Reservations();
        r.reserver("alice", "D1");
        r.reserver("bruno", "D1");

        // Quand D1 devient disponible le lundi 2 novembre 2026
        String avise = r.documentDisponible("D1", LocalDate.of(2026, 11, 2));

        // Alors Alice est avisée
        assertEquals("alice", avise);
    }

    // TODO Scénario 1 : copiez ici le titre de votre scénario et écrivez le test.

    // TODO Scénario 2 :

    // TODO Scénario 3 :

    // TODO Scénario 4 :

    // TODO Scénario 5 :
}
