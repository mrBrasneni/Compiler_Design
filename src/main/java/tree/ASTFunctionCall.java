/* Generated By:JJTree: Do not edit this line. ASTFunctionCall.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTFunctionCall extends SimpleNode {
  public ASTFunctionCall(int id) {
    super(id);
  }

  public ASTFunctionCall(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7aef0419ff3f94fb16bc99c7410d5e3b (do not edit this line) */
