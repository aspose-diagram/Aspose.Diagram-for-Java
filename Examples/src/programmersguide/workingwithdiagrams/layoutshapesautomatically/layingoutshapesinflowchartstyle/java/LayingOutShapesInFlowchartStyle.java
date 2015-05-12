/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.layoutshapesautomatically.layingoutshapesinflowchartstyle.java;

import com.aspose.diagram.*;

public class LayingOutShapesInFlowchartStyle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/layoutshapesautomatically/layingoutshapesinflowchartstyle/data/";


        String fileName = dataDir+ "drawing.vdx";
//Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(fileName);

        LayoutOptions flowChartOptions = new LayoutOptions();
        flowChartOptions.setLayoutStyle(LayoutStyle.FLOW_CHART);
        flowChartOptions.setSpaceShapes(1f);
        flowChartOptions.setEnlargePage(true);

        flowChartOptions.setDirection(LayoutDirection.BOTTOM_TO_TOP);
        diagram.layout(flowChartOptions);
        diagram.save(dataDir+ "sample_btm_top.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        flowChartOptions.setDirection(LayoutDirection.TOP_TO_BOTTOM);
        diagram.layout(flowChartOptions);
        diagram.save(dataDir+ "sample_top_btm.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        flowChartOptions.setDirection(LayoutDirection.LEFT_TO_RIGHT);
        diagram.layout(flowChartOptions);
        diagram.save(dataDir+ "sample_left_right.vdx", SaveFileFormat.VDX);

        diagram = new Diagram(fileName);
        flowChartOptions.setDirection(LayoutDirection.RIGHT_TO_LEFT);
        diagram.layout(flowChartOptions);

        // save diagram
        diagram.save(dataDir+ "sample_right_left.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");

    }
}




