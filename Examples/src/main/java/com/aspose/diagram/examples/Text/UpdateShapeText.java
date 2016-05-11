package com.aspose.diagram.examples.Text;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.Txt;
import com.aspose.diagram.examples.Utils;

public class UpdateShapeText {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:UpdateShapeText
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UpdateShapeText.class); 
        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir + "UpdateShapeText.vsd");
        // get page by name
        Page page = diagram.getPages().getPage("Flow 1");
        //Find a particular shape and update its text
        for (Shape shape :(Iterable<Shape>) page.getShapes())
        {
            if (shape.getNameU().toLowerCase() == "process" && shape.getID() == 1)
            {
                shape.getText().getValue().clear();
                shape.getText().getValue().add(new Txt("New Text"));
            }
        }
        // save diagram
        diagram.save(dataDir + "UpdateShapeText_Out.vdx", SaveFileFormat.VDX);
        //ExEnd:UpdateShapeText
	}
}
