package instrumentos;

import instrumentos.tipos.*;
import java.util.HashMap;
import java.util.Map;

public class FabricaInstrumentos {

    private static final Map<String, Instrumento> prototipos = new HashMap<>();

    static {
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new Violao7Cordas());
        prototipos.put("12cordas", new Violao12Cordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duplozero", new ViolaoDuploZero());
        prototipos.put("triplozero", new ViolaoTriploZero());
    }

    public static Instrumento getInstrumento(String tipo) {
        Instrumento prototipo = prototipos.get(tipo.toLowerCase());
        if (prototipo != null) {
            return prototipo.clonar(); // 🔹 retorna CLONE
        }
        return null;
    }
}