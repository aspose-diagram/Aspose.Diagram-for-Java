package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.ConnectedShapesFlags;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class GetAllConnectedShapes {
	public static void main(String[] args) throws Exception
	{
    	//ExStart:GetAllConnectedShapes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetAllConnectedShapes.class);
        // call a Diagram class constructor to load the VSDX diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get shape by id
        Shape shape = diagram.getPages().getPage("Page-3").getShapes().getShape(16);
        // get connected shapes
        long[] connectedShapeIds = shape.connectedShapes(ConnectedShapesFlags.CONNECTED_SHAPES_ALL_NODES, null);

        for (long id : connectedShapeIds)
        {
            shape = diagram.getPages().getPage("Page-3").getShapes().getShape(id);
            System.out.println("ID: " + shape.getID() + "\t\t Name: " + shape.getName());
        }
        //ExEnd:GetAllConnectedShapes
	}
}
