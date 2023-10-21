package main;

import parser.ParseException;
import parser.Parser;
import tree.Node;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Reader reader = new FileReader("src/main/resources/input.mj");
        Parser parser = new Parser(reader);
        Node n = parser.Program();
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("AST Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTree astTree = createASTTree(n);
            frame.add(new JScrollPane(astTree));

            expandAllNodes(astTree, 0, astTree.getRowCount());

            frame.pack();
            frame.setSize(800,800);
            frame.setVisible(true);
        });
        reader.close();
    }

    private static void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; i++) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
    }

    private static JTree createASTTree(Node n) {
        DefaultMutableTreeNode treeNode = convertASTToTree(n);
        return new JTree(new DefaultTreeModel(treeNode));
    }

    private static DefaultMutableTreeNode convertASTToTree(Node node) {
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(node);

        for(int i = 0; i < node.jjtGetNumChildren(); i++) {
            DefaultMutableTreeNode childTreeNode = convertASTToTree(node.jjtGetChild(i));
            treeNode.add(childTreeNode);
        }

        return treeNode;
    }
}
