package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class GroupShapes {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GroupShapes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GroupShapes.class);
        // load a Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-3");

        // Initialize an array of shapes
        Shape[] ss = new Shape[3];

        // extract and assign shapes to the array
        ss[0] = page.getShapes().getShape(15);
        ss[1] = page.getShapes().getShape(16);
        ss[2] = page.getShapes().getShape(17);

        // mark array shapes as group
        page.getShapes().group(ss);

        // save visio diagram
        diagram.save(dataDir + "GroupShapes_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:GroupShapes
	}

}
