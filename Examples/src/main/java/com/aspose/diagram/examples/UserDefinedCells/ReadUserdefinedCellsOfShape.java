package com.aspose.diagram.examples.UserDefinedCells;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Shape;
import com.aspose.diagram.User;
import com.aspose.diagram.examples.Utils;

public class ReadUserdefinedCellsOfShape {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReadUserdefinedCellsOfShape
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadUserdefinedCellsOfShape.class);  
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-1");
        // get shape by id
        Shape shape = page.getShapes().getShape(1);
        // extract user defined cells of the shape
        for (User user :(Iterable<User>) shape.getUsers())
        {
            System.out.println(user.getName() + ": " + user.getValue().getVal());
        }     
        //ExEnd:ReadUserdefinedCellsOfShape
	}

}
