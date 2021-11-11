package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ApplyThemeToShape {

	public static void main(String[] args) throws Exception {
		// ExStart:GroupShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GroupShapes.class) + "Shapes/";
		// load a Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-3");

		// Initialize an array of shapes
		Shape[] ss = new Shape[3];

		// extract and assign shapes to the array
		Shape shape = page.getShapes().getShape(15);
    // Apply preset theme clouds to new shape in page "Page-2"
    shape.setPresetTheme( PresetThemeValue.BUBBLE);
    shape.setPresetThemeVariant( PresetThemeVariantValue.VARIANT_1);
    shape.setPresetThemeQuickStyle(PresetQuickStyleValue.VARIANT_STYLE_1);

		// save visio diagram
		diagram.save(dataDir + "ApplyThemeToShape_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:GroupShapes
	}

}
