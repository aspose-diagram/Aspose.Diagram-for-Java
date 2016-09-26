package com.aspose.diagram.examples.Protection;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class VisioShapeProtection {

	public static void main(String[] args) throws Exception {
		// ExStart:VisioShapeProtection
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(VisioShapeProtection.class) + "Protection/";
		// Load diagram
		Diagram diagram = new Diagram(dataDir + "ProtectAndUnprotect.vsd");
		// get page by name
		Page page = diagram.getPages().getPage("Flow 1");
		// get shape by ID
		Shape shape = page.getShapes().getShape(1);

		// set protections
		shape.getProtection().getLockAspect().setValue(BOOL.TRUE);
		shape.getProtection().getLockBegin().setValue(BOOL.TRUE);
		shape.getProtection().getLockCalcWH().setValue(BOOL.TRUE);
		shape.getProtection().getLockCrop().setValue(BOOL.TRUE);
		shape.getProtection().getLockCustProp().setValue(BOOL.TRUE);
		shape.getProtection().getLockDelete().setValue(BOOL.TRUE);
		shape.getProtection().getLockEnd().setValue(BOOL.TRUE);
		shape.getProtection().getLockFormat().setValue(BOOL.TRUE);
		shape.getProtection().getLockFromGroupFormat().setValue(BOOL.TRUE);
		shape.getProtection().getLockGroup().setValue(BOOL.TRUE);
		shape.getProtection().getLockHeight().setValue(BOOL.TRUE);
		shape.getProtection().getLockMoveX().setValue(BOOL.TRUE);
		shape.getProtection().getLockMoveY().setValue(BOOL.TRUE);
		shape.getProtection().getLockRotate().setValue(BOOL.TRUE);
		shape.getProtection().getLockSelect().setValue(BOOL.TRUE);
		shape.getProtection().getLockTextEdit().setValue(BOOL.TRUE);
		shape.getProtection().getLockThemeColors().setValue(BOOL.TRUE);
		shape.getProtection().getLockThemeEffects().setValue(BOOL.TRUE);
		shape.getProtection().getLockVtxEdit().setValue(BOOL.TRUE);
		shape.getProtection().getLockWidth().setValue(BOOL.TRUE);

		// save diagram
		diagram.save(dataDir + "VisioShapeProtection_Out.vdx", SaveFileFormat.VDX);
		// ExEnd:VisioShapeProtection
	}

}
