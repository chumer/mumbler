package mumbler.truffle.node.builtin;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;

@GenerateNodeFactory
public abstract class LessThanBuiltinNode extends BuiltinNode {
    @Specialization
    protected boolean lessThan(long value0, long value1) {
        return value0 < value1;
    }
}
