<?php
namespace Aspose\Diagram\WorkingwithProtection;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ProtectUnprotectDiagram{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "drawing.vsd");

        $diagram->getDocumentSettings()->setProtectBkgnds(1);
        $diagram->getDocumentSettings()->setProtectMasters(1);
        $diagram->getDocumentSettings()->setProtectShapes(1);
        $diagram->getDocumentSettings()->setProtectStyles(1);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir . "ProtectUnprotectDiagram.vdx", $saveFileFormat->VDX);
        print "Applied protection on diagram successfully!".PHP_EOL;
    }
}