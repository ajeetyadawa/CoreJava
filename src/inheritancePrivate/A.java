package inheritancePrivate;

public class A {
int i; // public by default
private int j; // private to A

void setij(int x,int y) {
	i=x;
	j=y;
}
}
