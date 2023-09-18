package day10;

interface D {
	Integer getNumber();
}

interface E {
	Number getNumber();
	//String getNumber();
}

interface F extends D, E {
	// 若第9行實現時會發生
	// The return types are incompatible for the inherited methods 
	// D.getNumber(), E.getNumber()
}

class FImpl implements F {

	@Override
	public Integer getNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class InterfaceDemo3 {

}
