/* Generated By:JJTree: Do not edit this line. ASTType.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;
import parser.Parser;
public
class ASTType extends SimpleNode {
  private String type;
  private boolean isVector = false;

  public ASTType(int id) {
    super(id);
  }

  public ASTType(Parser p, int id) {
    super(p, id);
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setVector(boolean isVector) {
    this.isVector = isVector;
  }

  @Override
  public String toString() {
    return super.toString() + ": " + type + "(vector: " + isVector + ")";
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6afeaff7022df2268fe67dce43c4b970 (do not edit this line) */
