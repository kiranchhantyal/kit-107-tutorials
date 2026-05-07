public class List implements ListInterface
{
 protected Node first;

}
 public interface NodeInterface
 {
    // public Node (object o)
  public Object getData();
  public Node getNext();
  public void setData(Object o);
  public void setNext(Node next);
 }
 public void removeMax(){
    Node b, c;
    Node mb, mc;
    int max;
// assume first node is max
max = (int)first.getData();
mb = null;
mc = first;

b=first;
c=first.getNext();
while (c != null)
{
    if((int)c.getData() > max)
    {
        max = (int)c.getData();
        mb = b;
        mc = c;
    }
    b = c;
    c = c.getNext();
}// remove max node
    if(mb == null)
    {first = mc.getNext();}
    else
    {
        mb.setNext(mc.getNext());
    }}