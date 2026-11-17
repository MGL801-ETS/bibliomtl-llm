package ca.ets.mgl801.bibliomtl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Exemple du cours : code généré par un LLM à partir de l'exigence US-7.
 *
 * US-7 : « L'amende de retard est de 0,25 $ par jour ouvrable de retard et par
 * document, plafonnée au prix de remplacement du document. Les usagers de
 * 65 ans et plus en sont exemptés. »
 *
 * Version 1 : lancez AmendesTest. Un scénario échoue. Pourquoi ?
 */
public class Amendes {

    static final BigDecimal TAUX = new BigDecimal("0.25");

    public static BigDecimal calculerAmende(LocalDate echeance, LocalDate retour,
                                            BigDecimal prix, int age) {
        if (age >= 65) return BigDecimal.ZERO;
        long jours = ChronoUnit.DAYS.between(echeance, retour);
        if (jours <= 0) return BigDecimal.ZERO;
        return TAUX.multiply(BigDecimal.valueOf(jours)).min(prix);
    }
}
