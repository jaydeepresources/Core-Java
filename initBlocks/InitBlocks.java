package initBlocks;

public class InitBlocks {

	static int i;
	
	static{
		System.out.println("Static Init Block");
	}
	
	{
		System.out.println("Init Block");
	}

	public InitBlocks() {
		System.out.println("Constructor");
	}

}