/* Generated By:JJTree: Do not edit this line. ASTAndNode.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;

import parser.Parser;
public
class ASTAndNode extends SimpleNode {
  public ASTAndNode(int id) {
    super(id);
  }

  public ASTAndNode(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=180f9e64ecafda4b054102120f1d077a (do not edit this line) */
