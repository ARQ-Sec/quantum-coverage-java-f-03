package legacy.coverage;
import java.security.spec.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0201-java
        // evidence_anchor: new NamedParameterSpec("X448")
        // regex_sample: NamedParameterSpec\_EwEIkp=FZ}/vTF:0HL~L`[s1uW/D8{#=%yqzLsuz?|0v  <A@SJ,7= r}d4+b6wd]sn_@yeX448
        // keywords: NamedParameterSpec | X448
        new NamedParameterSpec("X448");
    }
}
