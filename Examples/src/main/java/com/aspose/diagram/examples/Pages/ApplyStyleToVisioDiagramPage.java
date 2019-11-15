package com.aspose.diagram.examples.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.aspose.diagram.ColorValue;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Shape;
import com.aspose.diagram.StyleSheet;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Diagrams.ReadDiagramFile;

public class ApplyStyleToVisioDiagramPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ExStart: ApplyStyleToVisioDiagramPage
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ReadDiagramFile.class) + "Diagrams/";
		// Open the stream. Read only access is enough for Aspose.Diagram to
		// load a diagram.
		InputStream stream = new FileInputStream(dataDir + "ReadDiagramFile.vsd");

		// load diagram
		Diagram vsdDiagram = new Diagram(stream);
		//Define a new StyleSheet
		StyleSheet st = new StyleSheet();
		st.setID(vsdDiagram.getStyleSheets().getCount()+1);
		com.aspose.diagram.Char ch = new com.aspose.diagram.Char();
		ch.getColor().setValue("#00ff00");
		ch.setIX(0);
		st.getChars().add(ch);
		
		st.getLine().getLineColor().setValue("#ff0000");
		st.getLine().getLinePattern().setValue(1);
		
		st.getLine().getLineWeight().setValue(0.01);
		st.getFill().getFillForegnd().setValue("#0000ff");
		st.getFill().getFillPattern().setValue(1);
		st.getFill().getShdwPattern().setValue(0);

		//Add the stylesheet to Stylesheets collection
		vsdDiagram.getStyleSheets().add(st);

		for (Shape shape: (Iterable<Shape>)vsdDiagram.getPages().get(0).getShapes())
		{
		    shape.getLine().getLinePattern().setValue(1);
		    shape.getFill().getFillPattern().setValue(1);
		}

		//Apply the stylesheet
		vsdDiagram.getPages().get(0).applyStyle(st.getID(), st.getID(), st.getID());
		//ExEnd: ApplyStyleToVisioDiagramPage
	}

}
