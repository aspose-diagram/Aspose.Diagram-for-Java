package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.Txt;
import com.aspose.diagram.TypeValue;
import com.aspose.diagram.examples.Utils;

public class AddingNewShape {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:AddingNewShape
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingNewShape.class);  
      //Load a diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-2");

        // Add master with stencil file path and master id
        String masterName = "Rectangle";
        // Add master with stencil file path and master name
        diagram.addMaster(dataDir + "Basic Shapes.vss", masterName);
                    
        // page indexing starts from 0
        int PageIndex = 1;
        double width = 2, height = 2, pinX = 4.25, pinY = 4.5;
        //Add a new rectangle shape
        long rectangleId = diagram.addShape(pinX, pinY, width, height, masterName, PageIndex);
                    
        // set shape properties 
        Shape rectangle = page.getShapes().getShape(rectangleId);
        rectangle.getXForm().getPinX().setValue(5);
        rectangle.getXForm().getPinY().setValue(5);
        rectangle.setType(TypeValue.SHAPE);
        rectangle.getText().getValue().add(new Txt("Aspose Diagram"));
        rectangle.setTextStyle(diagram.getStyleSheets().get(3));
        rectangle.getLine().getLineColor().setValue("#ff0000");
        rectangle.getLine().getLineWeight().setValue(0.03);
        rectangle.getLine().getRounding().setValue(0.1);
        rectangle.getFill().getFillBkgnd().setValue("#ff00ff");
        rectangle.getFill().getFillForegnd().setValue("#ebf8df");

        diagram.save(dataDir + "AddShape_Out.vsdx", SaveFileFormat.VSDX);
        System.out.println("Shape has been added.");
        //ExEnd:AddingNewShape
	}

}
