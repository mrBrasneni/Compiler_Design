/* Generated By:JJTree: Do not edit this line. ASTFalse.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTFalse extends SimpleNode {
  public ASTFalse(int id) {
    super(id);
  }

  public ASTFalse(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=faadc28ae19e54d922f18fbcae52a8c3 (do not edit this line) */
