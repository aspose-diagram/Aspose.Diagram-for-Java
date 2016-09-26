package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.LayoutDirection;
import com.aspose.diagram.LayoutOptions;
import com.aspose.diagram.LayoutStyle;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class LayOutShapesInFlowchartStyle {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(LayOutShapesInFlowchartStyle.class) + "Diagrams/";

		// load an existing Visio diagram
		String fileName = "LayOutShapesInFlowchartStyle.vdx";
		Diagram diagram = new Diagram(dataDir + fileName);

		// set layout options
		LayoutOptions flowChartOptions = new LayoutOptions();
		flowChartOptions.setLayoutStyle(LayoutStyle.FLOW_CHART);
		flowChartOptions.setSpaceShapes(1f);
		flowChartOptions.setEnlargePage(true);

		// set layout direction as BottomToTop and then save
		flowChartOptions.setDirection(LayoutDirection.BOTTOM_TO_TOP);
		diagram.layout(flowChartOptions);
		diagram.save(dataDir + "sample_btm_top.vdx", SaveFileFormat.VDX);

		// set layout direction as TopToBottom and then save
		diagram = new Diagram(dataDir + fileName);
		flowChartOptions.setDirection(LayoutDirection.TOP_TO_BOTTOM);
		diagram.layout(flowChartOptions);
		diagram.save(dataDir + "sample_top_btm.vdx", SaveFileFormat.VDX);

		// set layout direction as LeftToRight and then save
		diagram = new Diagram(dataDir + fileName);
		flowChartOptions.setDirection(LayoutDirection.LEFT_TO_RIGHT);
		diagram.layout(flowChartOptions);
		diagram.save(dataDir + "sample_left_right.vdx", SaveFileFormat.VDX);

		// set layout direction as RightToLeft and then save
		diagram = new Diagram(dataDir + fileName);
		flowChartOptions.setDirection(LayoutDirection.RIGHT_TO_LEFT);
		diagram.layout(flowChartOptions);
		diagram.save(dataDir + "sample_right_left.vdx", SaveFileFormat.VDX);
	}
}
