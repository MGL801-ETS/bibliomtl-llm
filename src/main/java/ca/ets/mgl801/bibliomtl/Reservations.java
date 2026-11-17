package ca.ets.mgl801.bibliomtl;

import java.time.LocalDate;

/**
 * Exercice 2 : gestion des réservations.
 *
 * US-9 : « Un usager peut avoir au plus 5 réservations actives. Quand un
 * document réservé devient disponible, l'usager est avisé ; la réservation
 * expire 3 jours ouvrables après l'avis. Les réservations sont servies par
 * ordre d'arrivée. »
 *
 * Ne modifiez pas les signatures : vos tests en dépendent.
 * Remplacez le corps des méthodes par le code généré par le LLM (étape 3).
 */
public class Reservations {

    /**
     * L'usager réserve un document.
     * @return true si la réservation est acceptée, false si elle est refusée.
     */
    public boolean reserver(String usager, String document) {
        throw new UnsupportedOperationException("À générer à l'étape 3");
    }

    /**
     * Le document devient disponible à la date donnée : l'usager à servir est avisé.
     * @return l'identifiant de l'usager avisé, ou null si personne n'attend ce document.
     */
    public String documentDisponible(String document, LocalDate dateAvis) {
        throw new UnsupportedOperationException("À générer à l'étape 3");
    }

    /**
     * @return true si la réservation de cet usager pour ce document est expirée à la date donnée.
     */
    public boolean estExpiree(String usager, String document, LocalDate date) {
        throw new UnsupportedOperationException("À générer à l'étape 3");
    }

    /**
     * @return le nombre de réservations actives de l'usager.
     */
    public int reservationsActives(String usager) {
        throw new UnsupportedOperationException("À générer à l'étape 3");
    }
}
