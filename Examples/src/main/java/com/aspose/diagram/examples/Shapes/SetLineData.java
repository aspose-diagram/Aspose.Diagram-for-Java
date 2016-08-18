/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class SetLineData
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:SetLineData
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetLineData.class);

        // load a Visio diagram
        Diagram diagram = new Diagram(dataDir + "SetLineData.vsd");
        // get the page by its name
        Page page1 = diagram.getPages().getPage("Page-1");
        // get shape by its ID
        Shape shape = page1.getShapes().getShape(1);
        // set line dash type by index
        shape.getLine().getLinePattern().setValue(4);
        // set line weight, defualt in PT
        shape.getLine().getLineWeight().setValue(2);
        // set color of the shape's line
        shape.getLine().getLineColor().getUfe().setF("RGB(95,108,53)");
        // set line rounding, default in inch
        shape.getLine().getRounding().setValue(0.3125);
        // set line caps
        shape.getLine().getLineCap().setValue(BOOL.TRUE);
        // set line color transparency in percent
        shape.getLine().getLineColorTrans().setValue(50);

        /* add arrows to the connector or curve shapes */
        // select arrow type by index
        shape.getLine().getBeginArrow().setValue(4);
        shape.getLine().getEndArrow().setValue(4);
        // set arrow size 
        shape.getLine().getBeginArrowSize().setValue(ArrowSizeValue.LARGE);
        shape.getLine().getBeginArrowSize().setValue(ArrowSizeValue.LARGE);

        // save the Visio
        diagram.save(dataDir + "SetLineData_Out.vsdx", SaveFileFormat.VSDX);
        // save diagram
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);
      //ExEnd:SetLineData
    }
}




