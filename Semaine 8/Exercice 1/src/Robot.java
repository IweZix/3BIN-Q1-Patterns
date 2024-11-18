public interface Robot extends Cloneable {
	
	int getCanon();
	int getShield();
	int getFreq();
	String getName();
	int diffLife(int i);
	Robot clone();
}
