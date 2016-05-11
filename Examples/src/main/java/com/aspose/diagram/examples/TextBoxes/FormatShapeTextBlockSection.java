package com.aspose.diagram.examples.TextBoxes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.DoubleValue;
import com.aspose.diagram.MeasureConst;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TextDirectionValue;
import com.aspose.diagram.VerticalAlignValue;
import com.aspose.diagram.examples.Utils;

public class FormatShapeTextBlockSection {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:FormatShapeTextBlockSection
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FormatShapeTextBlockSection.class); 
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // get the page by its name
        Page page1 = diagram.getPages().getPage("Page-1");
        // get shape by its ID
        Shape shape = page1.getShapes().getShape(1);
     // set orientation angle
        DoubleValue margin = new DoubleValue(4, MeasureConst.PT);

        // set left, right, top and bottom margins of the shape's text block
        shape.getTextBlock().setLeftMargin(margin);
        shape.getTextBlock().setRightMargin(margin);
        shape.getTextBlock().setTopMargin(margin);
        shape.getTextBlock().setBottomMargin(margin);

        // set the text direction
        shape.getTextBlock().getTextDirection().setValue(TextDirectionValue.VERTICAL);
        // set the text alignment
        shape.getTextBlock().getVerticalAlign().setValue(VerticalAlignValue.MIDDLE);
        // set the text block background color
        shape.getTextBlock().getTextBkgnd().getUfe().setF("RGB(95,108,53)");
        // set the background color transparency in percent
        shape.getTextBlock().getTextBkgndTrans().setValue(50);
        // set the distance between default tab stops for the selected shape.
        shape.getTextBlock().getDefaultTabStop().setValue(2);

        // save Visio
        diagram.save(dataDir + "FormatShapeTextBlockSection_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:FormatShapeTextBlockSection
	}

}
