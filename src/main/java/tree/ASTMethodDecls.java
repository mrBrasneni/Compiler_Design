/* Generated By:JJTree: Do not edit this line. ASTMethodDecls.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTMethodDecls extends SimpleNode {
  public ASTMethodDecls(int id) {
    super(id);
  }

  public ASTMethodDecls(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ee6027edbae0247fcd9700e4e2e9d28b (do not edit this line) */
