package com.aspose.diagram.examples.UserDefinedCells;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.User;
import com.aspose.diagram.examples.Utils;

public class CreateUserDefinedCellInShapeSheet {

	public static void main(String[] args) throws Exception {
		// ExStart:CreateUserDefinedCellInShapeSheet
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CreateUserDefinedCellInShapeSheet.class) + "UserDefinedCells/";
		// load source Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-1");
		// get shape by id
		Shape shape = page.getShapes().getShape(2);

		// initialize user object
		User user = new User();
		user.setName("UserDefineCell");
		user.getValue().setVal("800");
		// add user-defined cell
		shape.getUsers().add(user);

		// save diagram
		diagram.save(dataDir + "CreateUserDefinedCellInShapeSheet_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:CreateUserDefinedCellInShapeSheet
	}

}
