/* Generated By:JJTree: Do not edit this line. ASTArg.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;


import parser.Parser;
public
class ASTArg extends SimpleNode {
  public ASTArg(int id) {
    super(id);
  }

  public ASTArg(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=cb15baeaf66ad062cc5309ccf784a19c (do not edit this line) */
