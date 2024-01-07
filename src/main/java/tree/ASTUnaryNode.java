/* Generated By:JJTree: Do not edit this line. ASTUnaryNode.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTUnaryNode extends SimpleNode {
  public ASTUnaryNode(int id) {
    super(id);
  }

  public ASTUnaryNode(Parser p, int id) {
    super(p, id);
  }

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
//    return super.toString() + ": " + name;
    return super.toString() + ((name != null)?(": " + name):(""));
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3dbb33c3fa3ead74dea1bbbbea5fc4cb (do not edit this line) */
