package legacy.coverage;
import java.security.spec.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0202-java
        // evidence_anchor: new NamedParameterSpec("X25519")
        // regex_sample: NamedParameterSpecn2my7Y=X+^Cc~k%0$62`,;'M>X25519
        // keywords: NamedParameterSpec | X25519
        new NamedParameterSpec("X25519");
    }
}
