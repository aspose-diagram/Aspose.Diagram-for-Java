# Java API for Microsoft Visio® File Formats

[Aspose.Diagram for Java](https://products.aspose.com/diagram/java) API is a solution for Microsoft Visio file manipulation requirements. It allows the Java applications to read, write, export and process Microsoft Visio diagrams while supporting all Visio objects & properties including shapes, pages, images, shape masters, stencils, text, layers, header, footers, user-defined cells, hyperlinks, file protection, geometries, text boxes, and comments.

Aspose.Diagram for Java can also be used to [apply protection to the Microsoft Visio drawings](https://docs.aspose.com/diagram/java/working-with-protection/) by locking backgrounds, stencils (master) as well as  shapes and styles to avoid any accidental amendments.

Directory | Description
--------- | -----------
[Examples](https://github.com/aspose-diagram/Aspose.Diagram-for-Java/tree/master/Examples) | A collection of Java examples that help you learn the product features.
[Plugins](https://github.com/aspose-diagram/Aspose.Diagram-for-Java/tree/master/Plugins) | Plugins that will demonstrate one or more features of Aspose.Diagram for Java.

<p align="center">
  <a title="Download Examples ZIP" href="https://github.com/asposediagram/Aspose_Diagram_Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

## Visio File Processing Features

- Load, create, save and convert Microsoft Visio diagrams.
- [Create Master from sctrach](https://docs.aspose.com/diagram/java/working-with-masters/) or add from Stencil of Shapes.
- Create, Layout and Auto-Fit Shapes as well as retrieve Visio Connectors and Font Information.
- Modify Geometry Section of a Connector Shape.
- Insert an ActiveX Control in the Visio Diagram.
- [Printing to specific printer](https://docs.aspose.com/diagram/java/working-with-print/) or set printer and document name.

## Read & Write Visio Formats

**Microsoft Visio:** VSDX, VSX, VTX, VDX, VSSX, VSTX, VSDM, VSSM, VSTM

## Save Visio Diagrams As

**Fixed Layout:** PDF, XPS\
**Images:** JPEG, PNG, BMP, TIFF, SVG, EMF\
**Web:** HTML\
**Other:** XAML, SWF

## Read Visio Formats

**Microsoft Visio:** VDW, VSD, VSS, VST

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 7.0 (1.7)`, `J2SE 8.0 (1.8)`

## Get Started with Aspose.Diagram for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-diagram). You can easily use Aspose.BarCode for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.Diagram for Java from Aspose Repository](https://docs.aspose.com/diagram/java/installation/) documentation page.

## Auto-fit the Visio Diagram using Java

```java
// For complete examples and data files, please go to https://github.com/aspose-diagram/Aspose.Diagram-for-Java
// The path to the documents directory.
String dataDir = Utils.getDataDir(AutoFitShapesInVisio.class);

// load a Visio diagram
Diagram diagram = new Diagram(dataDir + "BFlowcht.vsdx");

// use saving options
DiagramSaveOptions options = new DiagramSaveOptions(SaveFileFormat.VSDX);

// set Auto fit page property
options.setAutoFitPageToDrawingContent(true);

// save Visio diagram
diagram.save(dataDir + "AutoFitShapesInVisio_Out.vsdx", options);
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/diagram/java) | [Docs](https://docs.aspose.com/diagram/java/) | [Demos](https://products.aspose.app/diagram/family) | [API Reference](https://apireference.aspose.com/java/diagram) | [Examples](https://github.com/aspose-diagram/Aspose.Diagram-for-Java) | [Blog](https://blog.aspose.com/category/diagram/) | [Free Support](https://forum.aspose.com/c/diagram) | [Temporary License](https://purchase.aspose.com/temporary-license)
