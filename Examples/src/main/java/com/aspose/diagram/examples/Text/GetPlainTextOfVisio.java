package com.aspose.diagram.examples.Text;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TypeValue;
import com.aspose.diagram.examples.Utils;

public class GetPlainTextOfVisio {
	//ExStart:GetPlainTextOfVisio
	static String text = "";
	public static void main(String[] args) throws Exception
	{
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetPlainTextOfVisio.class);
        // load diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // get Visio diagram page
        Page page = diagram.getPages().getPage("Page-1");

        // iterate through the shapes
        for (Shape shape :(Iterable<Shape>) page.getShapes())
        {
            // extract plain text from the shape
            GetShapeText(shape);
        }
        // display extracted text
        System.out.println(text);
	}
    private static void GetShapeText(Shape shape)
    {
    	// filter shape text
        if (shape.getText().getValue().getText() != "")
        	text += (shape.getText().getValue().getText().replaceAll("\\<.*?>",""));

        // for image shapes
        if (shape.getType() == TypeValue.FOREIGN)
            text += (shape.getName());

        // for group shapes
        if (shape.getType() == TypeValue.GROUP)
            for(Shape subshape : (Iterable<Shape>) shape.getShapes())
            {
                GetShapeText(subshape);
            }
    }
    //ExEnd:GetPlainTextOfVisio

}
