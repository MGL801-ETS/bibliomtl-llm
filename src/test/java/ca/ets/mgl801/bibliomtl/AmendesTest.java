package ca.ets.mgl801.bibliomtl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Un cas de test par scénario d'acceptation de US-7.
 * Colonnes : échéance, retour, prix de remplacement, âge de l'usager, amende attendue.
 */
class AmendesTest {

    @ParameterizedTest(name = "Scénario {index} : attendu {4} $")
    @CsvSource({
        "2026-11-02, 2026-11-06, 20, 30, 1.00",   // 1. Retard simple (lundi au vendredi)
        "2026-11-13, 2026-11-16, 20, 30, 0.25",   // 2. Fin de semaine (vendredi au lundi)
        "2026-09-01, 2026-12-31, 12, 30, 12.00",  // 3. Plafond au prix de remplacement
        "2026-11-02, 2026-11-06, 20, 70, 0.00"    // 4. Exemption 65 ans et plus
    })
    void us7(LocalDate echeance, LocalDate retour, BigDecimal prix, int age, BigDecimal attendu) {
        BigDecimal obtenu = Amendes.calculerAmende(echeance, retour, prix, age);
        // compareTo et non equals : pour BigDecimal, 12 et 12.00 ne sont pas « equals ».
        assertEquals(0, attendu.compareTo(obtenu),
                () -> "attendu " + attendu + " $, obtenu " + obtenu + " $");
    }
}
