package com.aspose.diagram.examples.Shapes.Glue;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.GluedShapesFlags;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class GetGluedConnectors {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GetGluedConnectors
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetGluedConnectors.class);   
        // call a Diagram class constructor to load the VSD diagram
        Diagram diagram = new Diagram(dataDir + "RetrieveShapeInfo.vsd");
        // get shape by an ID
        Shape shape = diagram.getPages().get(0).getShapes().getShape(90);
        // get all glued 1D shapes
        long[] gluedShapeIds = shape.gluedShapes(GluedShapesFlags.GLUED_SHAPES_ALL_1_D, null, null);

        // display shape ID and name
        for (long id : gluedShapeIds)
        {
            shape = diagram.getPages().get(0).getShapes().getShape(id);
            System.out.println("ID: " + shape.getID() + "\t\t Name: " + shape.getName());
        }
        //ExEnd:GetGluedConnectors
	}

}
