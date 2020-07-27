package wang.joye.tins.ast.stmt;

import wang.joye.tins.ast.node.StmtNode;
import wang.joye.tins.util.DumpUtil;

/**
 * 顶层结点
 */
public class ContinueStmtNode extends StmtNode {

    @Override
    public void dump(int level) {
        DumpUtil.dump(level, "continue");
    }
}
