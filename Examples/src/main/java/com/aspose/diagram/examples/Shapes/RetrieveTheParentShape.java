package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RetrieveTheParentShape {

	public static void main(String[] args) throws Exception 
	{
	    // The path to the documents directory.
	    String dataDir = Utils.getSharedDataDir(RetrieveTheParentShape.class) + "Shapes\\";
		
            // Call a Diagram class constructor to load the VSD diagram
            Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
            // get a sub-shape by page name, group shape ID, and then sub-shape ID
            Shape shape = diagram.getPages().getPage("Page-3").getShapes().getShape(13).getShapes().getShape(2);
            Shape parentShape = shape.getParentShape();
            System.out.println("Parent Shape's Properties:");
            System.out.println("Shape ID: " + parentShape.getID());
            System.out.println("Shape Name: " + parentShape.getName());
            System.out.println("Shape Type: " + parentShape.getType());
	}

}
