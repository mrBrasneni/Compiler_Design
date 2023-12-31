/* Generated By:JavaCC: Do not edit this line. ParserDefaultVisitor.java Version 7.0.11 */
package tree;

public class ParserDefaultVisitor implements ParserVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTProgram node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIdentifier node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMainClass node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTClassDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTInheritance node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVarDecls node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMethodDecls node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVarDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMethodDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTArgs node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRetrun node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTArg node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTType node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBlock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIf node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTWhile node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTPrint node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssignment node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOrNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAndNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRelNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAddNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMulNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTUnaryNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVecAccess node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunctionCall node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTInteger node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTrue node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFalse node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTThis node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=b5ac5c0875eb8a963d22f981533ffdec (do not edit this line) */
