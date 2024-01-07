package tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class VisualizerVisitor implements ParserVisitor{

    private DefaultMutableTreeNode rootNode;

    public JTree getJTree() {
        return new JTree(new DefaultTreeModel(rootNode));
    }

    private void visitChildren(Node node, DefaultMutableTreeNode treeNode) {
        for(int i = 0; i < node.jjtGetNumChildren(); i++) {
            Node child =  node.jjtGetChild(i);
            child.jjtAccept(this, treeNode);
        }
    }

    private void addNode(SimpleNode node, Object data) {
        DefaultMutableTreeNode simpleNode = new DefaultMutableTreeNode(node);
        ((DefaultMutableTreeNode) data).add(simpleNode);
        visitChildren(node, simpleNode);
    }

    @Override
    public Object visit(SimpleNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTProgram node, Object data) {
        rootNode = new DefaultMutableTreeNode(node);
        visitChildren(node, rootNode);
        return data;
    }

    @Override
    public Object visit(ASTIdentifier node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTMainClass node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTClassDecl node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTInheritance node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTVarDecls node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTMethodDecls node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTVarDecl node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTMethodDecl node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTArgs node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTRetrun node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTArg node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTType node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTBlock node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTIf node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTWhile node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTPrint node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTAssignment node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTOrNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTAndNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTRelNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTAddNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTMulNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTUnaryNode node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTVecAccess node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTFunctionCall node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTInteger node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTTrue node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTFalse node, Object data) {
        addNode(node, data);
        return data;
    }

    @Override
    public Object visit(ASTThis node, Object data) {
        addNode(node, data);
        return data;
    }


}
