/* Generated By:JJTree: Do not edit this line. ASTArgs.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTArgs extends SimpleNode {
  public ASTArgs(int id) {
    super(id);
  }

  public ASTArgs(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=17b4996040e8d82dca832d7af15d6c19 (do not edit this line) */
