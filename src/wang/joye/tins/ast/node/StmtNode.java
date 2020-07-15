package wang.joye.tins.ast.node;

import wang.joye.tins.util.DumpUtil;

/**
 * 顶层结点
 */
public class StmtNode extends Node{

    @Override
    public void dump(int level) {
        DumpUtil.dump(level, "stmt node shouldn't show");
    }
}
