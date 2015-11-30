<?php
namespace Aspose\Diagram\WorkingwithHyperlinks;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Hyperlink as Hyperlink;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class AddHyperlinkToShape{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "Drawing.vsd");

        # Initialize Hyperlink object
        $hyperlink = new Hyperlink();

        # Set address value
        $hyperlink->getAddress()->setValue("http://www.google.com/");

        # Set sub address value
        $hyperlink->getSubAddress()->setValue("Sub address here");

        # Set description value
        $hyperlink->getDescription()->setValue("Description here");

        # Set name
        $hyperlink->setName("MyHyperLink");

        # Add hyperlink to the shape
        $diagram->getPages()->getPage("Flow 1")->getShapes()->getShape(1)->getHyperlinks()->add($hyperlink);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir . "Hyperlinks.vdx", $saveFileFormat->VDX);

        print "Added hyperlik to shape successfully!".PHP_EOL;
    }
}