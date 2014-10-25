package mumbler.graal.node;

import mumbler.graal.type.MumblerNull;

import com.oracle.truffle.api.frame.VirtualFrame;

public class ReadArgumentNode extends MumblerNode {
    private final int index;

    public ReadArgumentNode(int index) {
        this.index = index;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        Object[] args = virtualFrame.getArguments();
        if (this.index < args.length) {
            return args[this.index];
        }
        return MumblerNull.EMPTY;
    }
}