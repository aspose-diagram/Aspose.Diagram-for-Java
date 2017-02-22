package com.aspose.diagram.examples.License;
import com.aspose.diagram.Metered;

public class PublicAndPrivateKeys {

	public static void main(String[] args) throws Exception 
	{
        // Initialize a Metered license class object
        Metered metered = new Metered();
        // apply public and private keys
        metered.setMeteredKey("your-public-key", "your-private-key");
	}

}
