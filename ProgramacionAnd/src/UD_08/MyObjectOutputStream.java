package UD_08;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream{

	
	
	
	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
		//super.writeStreamHeader();
	}
	//constructores
	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}
	protected MyObjectOutputStream() throws IOException, SecurityException {
		super();
	}
	
	

}
