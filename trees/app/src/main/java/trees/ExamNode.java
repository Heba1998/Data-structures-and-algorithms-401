package trees;

public class ExamNode {
  public int content;
  public ExamNode nextcontent;
  public ExamNode left;
  public ExamNode right;


  public ExamNode(int content) {
    this.content = content;
  }

  public int getContent() {
    return content;
  }

  public void setContent(int content) {
    this.content = content;
  }

  public ExamNode getLeft() {
    return left;
  }

  public ExamNode getRight() {
    return right;
  }


  public void setLeft(ExamNode left) {
    this.left = left;
  }

  public void setRight(ExamNode right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "content" + content;
  }
}
