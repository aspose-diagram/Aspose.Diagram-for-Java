/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.layoutshapesautomatically.layingoutshapesincompacttreestyle.java;

import com.aspose.diagram.*;

public class LayingOutShapesInCompactTreeStyle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/layoutshapesautomatically/layingoutshapesincompacttreestyle/data/";



        String fileName = dataDir+ "drawing.vdx";
//Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(fileName);

        LayoutOptions compactTreeOptions = new LayoutOptions();
        compactTreeOptions.setLayoutStyle(LayoutStyle.COMPACT_TREE);
        compactTreeOptions.setEnlargePage(true);

        compactTreeOptions.setDirection(LayoutDirection.DOWN_THEN_RIGHT);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir+ "sample_down_right.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        compactTreeOptions.setDirection(LayoutDirection.DOWN_THEN_LEFT);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir+ "sample_down_left.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        compactTreeOptions.setDirection(LayoutDirection.RIGHT_THEN_DOWN);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir+ "sample_right_down.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        compactTreeOptions.setDirection(LayoutDirection.LEFT_THEN_DOWN);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir+ "sample_left_down.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}




