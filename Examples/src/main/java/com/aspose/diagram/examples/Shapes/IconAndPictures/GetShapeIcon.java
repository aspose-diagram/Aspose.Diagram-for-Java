package com.aspose.diagram.examples.Shapes.IconAndPictures;

import java.io.FileOutputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Master;
import com.aspose.diagram.examples.Utils;

public class GetShapeIcon {

	public static void main(String[] args) throws Exception {
		// ExStart:GetShapeIcon
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetShapeIcon.class) + "Shapes/";
		// Load stencil file to a diagram object
		Diagram stencil = new Diagram(dataDir + "Timeline.vss");
		// get master
		Master master = stencil.getMasters().getMasterByName("Triangle");
		// get byte array
		byte[] bytes = master.getIcon();
		// create an image file
		FileOutputStream fos = new FileOutputStream(dataDir + "MasterIcon_Out.png");
		// write byte array of the image
		fos.write(bytes);
		// close array
		fos.close();
		// ExEnd:GetShapeIcon
	}

}
